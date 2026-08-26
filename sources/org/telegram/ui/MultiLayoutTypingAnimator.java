package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

public final class MultiLayoutTypingAnimator implements Choreographer.FrameCallback {
    private static final float EPS = 0.001f;
    public static final float FADE_IN_SEC = 0.2f;
    private static final float FADE_WIDTH_DP = 50.0f;
    private static final LinearGradient GRADIENT;
    private static final Matrix GRAD_MTX = new Matrix();
    private static final Paint MASK_PAINT;
    public static final float MIN_SPEED_DP_PER_SEC = 40.0f;
    public static final float TARGET_DURATION_SEC = 1.05f;
    private View invalidateTarget;
    private View lastInvalidatedView;
    private Runnable onFinishRunnable;
    private final Choreographer choreo = Choreographer.getInstance();
    private List<? extends Block> blocks = new ArrayList();
    private final ArrayList<Float> blockAlphas = new ArrayList<>();
    private int curBlockIdx = 0;
    private int curLineIdx = 0;
    private float xPosition = 0.0f;
    private boolean running = false;
    private boolean finished = true;
    private long lastFrameNs = 0;
    private float speedPxPerSec = AndroidUtilities.dp(40.0f);

    public interface Block {
        Layout getLayout();

        View getParentView();
    }

    public interface Renderer {
        void draw(Canvas canvas);
    }

    static {
        Paint paint = new Paint(1);
        MASK_PAINT = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        GRADIENT = linearGradient;
        paint.setShader(linearGradient);
    }

    private void advance(float f) {
        if (this.blocks.isEmpty() || f <= 0.0f) {
            this.finished = this.blocks.isEmpty();
            return;
        }
        float f2 = this.speedPxPerSec * f;
        while (f2 > 0.0f) {
            if (this.curBlockIdx >= this.blocks.size()) {
                this.finished = true;
                break;
            }
            Layout layout = this.blocks.get(this.curBlockIdx).getLayout();
            if (layout == null || layout.getLineCount() == 0) {
                this.curBlockIdx++;
                this.curLineIdx = 0;
                this.xPosition = 0.0f;
            } else {
                if (this.curLineIdx >= layout.getLineCount()) {
                    int lineCount = layout.getLineCount() - 1;
                    this.curLineIdx = lineCount;
                    this.xPosition = lineWidth(layout, lineCount);
                }
                float fLineWidth = lineWidth(layout, this.curLineIdx);
                if (fLineWidth > 0.001f) {
                    float f3 = this.xPosition;
                    float f4 = fLineWidth - f3;
                    if (f4 > 0.001f) {
                        if (f2 < f4) {
                            f4 = f2;
                        }
                        float f5 = f3 + f4;
                        this.xPosition = f5;
                        f2 -= f4;
                        if (fLineWidth - f5 <= 0.001f && !nextLineOrBlock(layout)) {
                            f2 = 0.0f;
                        }
                    } else if (nextLineOrBlock(layout)) {
                        break;
                    }
                } else if (nextLineOrBlock(layout)) {
                    break;
                }
            }
        }
        this.finished = isAtAbsoluteEnd();
    }

    private void applyBlockAlphas(float f) {
        int size = this.blocks.size();
        View view = null;
        int i = 0;
        while (i < size) {
            Block block = this.blocks.get(i);
            float fMin = (this.finished || i <= this.curBlockIdx) ? 1.0f : 0.0f;
            float fFloatValue = i < this.blockAlphas.size() ? this.blockAlphas.get(i).floatValue() : fMin;
            if (fFloatValue == fMin) {
                fMin = fFloatValue;
            } else if (f > 0.0f) {
                float f2 = f / 0.2f;
                fMin = fMin > fFloatValue ? Math.min(fMin, f2 + fFloatValue) : Math.max(fMin, fFloatValue - f2);
            }
            if (i < this.blockAlphas.size() && fMin != fFloatValue) {
                this.blockAlphas.set(i, Float.valueOf(fMin));
            }
            View parentView = block.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != fMin) {
                    parentView.setAlpha(fMin);
                }
                view = parentView;
            }
            i++;
        }
    }

    private float computeRemainingPixels() {
        float f = 0.0f;
        if (this.blocks.isEmpty()) {
            return 0.0f;
        }
        int i = this.curBlockIdx;
        while (i < this.blocks.size()) {
            Layout layout = this.blocks.get(i).getLayout();
            if (layout != null) {
                int iMin = i == this.curBlockIdx ? Math.min(Math.max(this.curLineIdx, 0), Math.max(0, layout.getLineCount() - 1)) : 0;
                for (int i2 = iMin; i2 < layout.getLineCount(); i2++) {
                    float fLineWidth = lineWidth(layout, i2);
                    if (fLineWidth > 0.001f) {
                        if (i == this.curBlockIdx && i2 == iMin) {
                            fLineWidth -= this.xPosition;
                            if (fLineWidth > 0.001f) {
                                f += fLineWidth;
                            }
                        } else {
                            f += fLineWidth;
                        }
                    }
                }
            }
            i++;
        }
        return f;
    }

    public static void drawHorizontalFadeMask(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (f6 <= 0.0f) {
            return;
        }
        float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f6, MathUtils.clamp(f7, 0.0f, f6) / f6);
        Matrix matrix = GRAD_MTX;
        matrix.reset();
        if (i >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(fLerp + f5, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate((f5 + f6) - fLerp, 0.0f);
        }
        GRADIENT.setLocalMatrix(matrix);
        canvas.drawRect(f, f2, f3, f4, MASK_PAINT);
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, Layout layout, int i, float f) {
        drawLayoutWithLastLineFade(canvas, layout, i, f, null);
    }

    private void invalidate() {
        Block block;
        int i = this.curBlockIdx;
        View parentView = (i < 0 || i >= this.blocks.size() || (block = this.blocks.get(this.curBlockIdx)) == null) ? null : block.getParentView();
        if (parentView == null) {
            View view = this.invalidateTarget;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        parentView.invalidate();
        View view2 = this.lastInvalidatedView;
        if (view2 != null && view2 != parentView) {
            view2.invalidate();
        }
        this.lastInvalidatedView = parentView;
    }

    private boolean isAtAbsoluteEnd() {
        if (this.blocks.isEmpty()) {
            return true;
        }
        int size = this.blocks.size() - 1;
        Layout layout = null;
        while (size >= 0) {
            layout = this.blocks.get(size).getLayout();
            if (layout != null && layout.getLineCount() > 0) {
                break;
            }
            size--;
        }
        if (size < 0 || layout == null) {
            return true;
        }
        int i = this.curBlockIdx;
        if (i < size) {
            return false;
        }
        if (i > size) {
            return true;
        }
        int lineCount = layout.getLineCount() - 1;
        return this.curLineIdx >= lineCount && this.xPosition >= lineWidth(layout, lineCount) - 0.001f;
    }

    private float lineWidth(Layout layout, int i) {
        float lineRight = layout.getLineRight(i) - layout.getLineLeft(i);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    private boolean nextLineOrBlock(Layout layout) {
        int i = this.curLineIdx + 1;
        this.curLineIdx = i;
        this.xPosition = 0.0f;
        if (i >= layout.getLineCount()) {
            int i2 = this.curBlockIdx + 1;
            this.curBlockIdx = i2;
            this.curLineIdx = 0;
            this.xPosition = 0.0f;
            if (i2 >= this.blocks.size()) {
                return true;
            }
        }
        return false;
    }

    private void recalcSpeed() {
        float fComputeRemainingPixels = computeRemainingPixels();
        float fDp = AndroidUtilities.dp(40.0f);
        if (fComputeRemainingPixels <= 0.001f) {
            this.speedPxPerSec = fDp;
        } else {
            this.speedPxPerSec = Math.max(fDp, fComputeRemainingPixels / 1.05f);
        }
    }

    private void resetBlockAlphas() {
        int size = this.blockAlphas.size();
        for (int i = 0; i < size; i++) {
            this.blockAlphas.set(i, Float.valueOf(1.0f));
        }
        int size2 = this.blocks.size();
        View view = null;
        for (int i2 = 0; i2 < size2; i2++) {
            View parentView = this.blocks.get(i2).getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != 1.0f) {
                    parentView.setAlpha(1.0f);
                }
                view = parentView;
            }
        }
    }

    @Override
    public void doFrame(long j) {
        float f;
        if (this.running) {
            long j2 = this.lastFrameNs;
            if (j2 != 0) {
                f = (j - j2) * 1.0E-9f;
                advance(f);
            } else {
                f = 0.0f;
            }
            this.lastFrameNs = j;
            applyBlockAlphas(f);
            invalidate();
            if (!this.finished) {
                this.choreo.postFrameCallback(this);
                return;
            }
            this.running = false;
            resetBlockAlphas();
            Runnable runnable = this.onFinishRunnable;
            if (runnable != null) {
                runnable.run();
                this.onFinishRunnable = null;
            }
        }
    }

    public float getBlockAlpha(Block block) {
        int iIndexOf = indexOf(block);
        if (iIndexOf < 0 || iIndexOf >= this.blockAlphas.size()) {
            return 1.0f;
        }
        return this.blockAlphas.get(iIndexOf).floatValue();
    }

    public int getCurrentBlockIndex() {
        return this.curBlockIdx;
    }

    public int getFadeLineIndex(Block block) {
        if (isFadeBlock(block)) {
            return this.curLineIdx;
        }
        return -1;
    }

    public float getFadeXPosition(Block block) {
        if (isFadeBlock(block)) {
            return this.xPosition;
        }
        return 0.0f;
    }

    public int indexOf(Block block) {
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            if (this.blocks.get(i) == block) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFadeBlock(Block block) {
        Layout layout;
        return indexOf(block) == this.curBlockIdx && (layout = block.getLayout()) != null && this.curLineIdx < layout.getLineCount();
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isRunning() {
        return this.running;
    }

    public boolean needDraw(Block block) {
        int iIndexOf = indexOf(block);
        if (iIndexOf < 0 || this.blocks.isEmpty()) {
            return false;
        }
        int i = this.curBlockIdx;
        return iIndexOf < i || iIndexOf <= i;
    }

    public void reset() {
        this.curBlockIdx = 0;
        this.curLineIdx = 0;
        this.xPosition = 0.0f;
        this.finished = this.blocks.isEmpty();
        this.speedPxPerSec = AndroidUtilities.dp(40.0f);
        applyBlockAlphas(0.0f);
        invalidate();
    }

    public void setBlocks(List<? extends Block> list) {
        if (!this.blocks.isEmpty() && this.curBlockIdx >= this.blocks.size()) {
            int size = this.blocks.size() - 1;
            this.curBlockIdx = size;
            Layout layout = this.blocks.get(size).getLayout();
            int iMax = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.curLineIdx = iMax;
            this.xPosition = layout == null ? 0.0f : layout.getLineWidth(iMax);
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.blocks = list;
        recalcSpeed();
        this.finished = isAtAbsoluteEnd();
        while (this.blockAlphas.size() > this.blocks.size()) {
            Fragment$$ExternalSyntheticOutline0.m81m(1, (ArrayList) this.blockAlphas);
        }
        int size2 = this.blockAlphas.size();
        while (size2 < this.blocks.size()) {
            this.blockAlphas.add(Float.valueOf((this.finished || size2 <= this.curBlockIdx) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.finished && !this.running) {
            start();
        }
        applyBlockAlphas(0.0f);
        invalidate();
    }

    public void setInvalidateTarget(View view) {
        this.invalidateTarget = view;
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinishRunnable = runnable;
    }

    public void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        if (isAtAbsoluteEnd()) {
            this.finished = true;
        }
        this.lastFrameNs = 0L;
        this.choreo.postFrameCallback(this);
    }

    public void stop() {
        if (this.running) {
            this.running = false;
            this.choreo.removeFrameCallback(this);
            this.lastFrameNs = 0L;
            resetBlockAlphas();
            Runnable runnable = this.onFinishRunnable;
            if (runnable != null) {
                runnable.run();
                this.onFinishRunnable = null;
            }
        }
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, Layout layout, int i, float f, Renderer renderer) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i < 0 || i >= lineCount) {
            return;
        }
        Renderer todoItemMenu$$ExternalSyntheticLambda3 = renderer != null ? renderer : new TodoItemMenu$$ExternalSyntheticLambda3(layout, 7);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            todoItemMenu$$ExternalSyntheticLambda3.draw(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i);
        float lineRight = layout.getLineRight(i);
        float fMin = Math.min(lineLeft, lineRight);
        float fMax = Math.max(lineLeft, lineRight);
        if (fMax <= fMin) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i);
        float f2 = fMax - fMin;
        float fClamp = MathUtils.clamp(f, 0.0f, f2);
        float f3 = fClamp / f2;
        if (fClamp <= 0.0f) {
            return;
        }
        if (fClamp >= f2) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            todoItemMenu$$ExternalSyntheticLambda3.draw(canvas);
            canvas.restore();
            return;
        }
        float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f2, f3);
        AndroidUtilities.dp(50.0f);
        float f4 = lineTop;
        float f5 = lineBottom;
        int iSaveLayer = canvas.saveLayer(fMin, f4, fMax, f5, null);
        canvas.save();
        canvas.clipRect(fMin, f4, fMax, f5);
        todoItemMenu$$ExternalSyntheticLambda3.draw(canvas);
        canvas.restore();
        Matrix matrix = GRAD_MTX;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(fLerp, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(f2 - fLerp, 0.0f);
        }
        GRADIENT.setLocalMatrix(matrix);
        canvas.drawRect(fMin, f4, fMax, f5, MASK_PAINT);
        canvas.restoreToCount(iSaveLayer);
    }
}
