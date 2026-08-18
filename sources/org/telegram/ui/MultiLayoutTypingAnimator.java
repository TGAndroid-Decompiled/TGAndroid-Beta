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
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

public final class MultiLayoutTypingAnimator implements Choreographer.FrameCallback {
    private static final LinearGradient GRADIENT;
    private static final Matrix GRAD_MTX = new Matrix();
    private static final Paint MASK_PAINT;
    private View invalidateTarget;
    private View lastInvalidatedView;
    private Runnable onFinishRunnable;
    private final Choreographer choreo = Choreographer.getInstance();
    private List blocks = new ArrayList();
    private final ArrayList blockAlphas = new ArrayList();
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

    private void applyBlockAlphas(float f) {
        int size = this.blocks.size();
        View view = null;
        int i = 0;
        while (i < size) {
            Block block = (Block) this.blocks.get(i);
            float fMin = (this.finished || i <= this.curBlockIdx) ? 1.0f : 0.0f;
            float fFloatValue = i < this.blockAlphas.size() ? ((Float) this.blockAlphas.get(i)).floatValue() : fMin;
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

    private void resetBlockAlphas() {
        int size = this.blockAlphas.size();
        for (int i = 0; i < size; i++) {
            this.blockAlphas.set(i, Float.valueOf(1.0f));
        }
        int size2 = this.blocks.size();
        View view = null;
        for (int i2 = 0; i2 < size2; i2++) {
            View parentView = ((Block) this.blocks.get(i2)).getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != 1.0f) {
                    parentView.setAlpha(1.0f);
                }
                view = parentView;
            }
        }
    }

    public float getBlockAlpha(Block block) {
        int iIndexOf = indexOf(block);
        if (iIndexOf < 0 || iIndexOf >= this.blockAlphas.size()) {
            return 1.0f;
        }
        return ((Float) this.blockAlphas.get(iIndexOf)).floatValue();
    }

    private void invalidate() {
        Block block;
        int i = this.curBlockIdx;
        View parentView = (i < 0 || i >= this.blocks.size() || (block = (Block) this.blocks.get(this.curBlockIdx)) == null) ? null : block.getParentView();
        if (parentView != null) {
            parentView.invalidate();
            View view = this.lastInvalidatedView;
            if (view != null && view != parentView) {
                view.invalidate();
            }
            this.lastInvalidatedView = parentView;
            return;
        }
        View view2 = this.invalidateTarget;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    public void setBlocks(List list) {
        if (!this.blocks.isEmpty() && this.curBlockIdx >= this.blocks.size()) {
            int size = this.blocks.size() - 1;
            this.curBlockIdx = size;
            Layout layout = ((Block) this.blocks.get(size)).getLayout();
            int iMax = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.curLineIdx = iMax;
            this.xPosition = layout == null ? 0.0f : layout.getLineWidth(iMax);
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.blocks = list;
        recalcSpeed();
        this.finished = isAtAbsoluteEnd();
        while (this.blockAlphas.size() > this.blocks.size()) {
            ArrayList arrayList = this.blockAlphas;
            arrayList.remove(arrayList.size() - 1);
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

    public boolean isRunning() {
        return this.running;
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinishRunnable = runnable;
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

    public boolean needDraw(Block block) {
        int iIndexOf = indexOf(block);
        if (iIndexOf < 0 || this.blocks.isEmpty()) {
            return false;
        }
        int i = this.curBlockIdx;
        return iIndexOf < i || iIndexOf <= i;
    }

    public boolean isFadeBlock(Block block) {
        Layout layout;
        return indexOf(block) == this.curBlockIdx && (layout = block.getLayout()) != null && this.curLineIdx < layout.getLineCount();
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
            if (this.finished) {
                this.running = false;
                resetBlockAlphas();
                Runnable runnable = this.onFinishRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.onFinishRunnable = null;
                    return;
                }
                return;
            }
            this.choreo.postFrameCallback(this);
        }
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
            Layout layout = ((Block) this.blocks.get(this.curBlockIdx)).getLayout();
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
                if (fLineWidth <= 0.001f) {
                    if (nextLineOrBlock(layout)) {
                        break;
                    }
                } else {
                    float f3 = this.xPosition;
                    float f4 = fLineWidth - f3;
                    if (f4 <= 0.001f) {
                        if (nextLineOrBlock(layout)) {
                            break;
                        }
                    } else {
                        if (f2 < f4) {
                            f4 = f2;
                        }
                        float f5 = f3 + f4;
                        this.xPosition = f5;
                        f2 -= f4;
                        if (fLineWidth - f5 <= 0.001f && !nextLineOrBlock(layout)) {
                            f2 = 0.0f;
                        }
                    }
                }
            }
        }
        this.finished = isAtAbsoluteEnd();
    }

    private boolean nextLineOrBlock(Layout layout) {
        int i = this.curLineIdx + 1;
        this.curLineIdx = i;
        this.xPosition = 0.0f;
        if (i < layout.getLineCount()) {
            return false;
        }
        int i2 = this.curBlockIdx + 1;
        this.curBlockIdx = i2;
        this.curLineIdx = 0;
        this.xPosition = 0.0f;
        return i2 >= this.blocks.size();
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

    private float computeRemainingPixels() {
        float f = 0.0f;
        if (this.blocks.isEmpty()) {
            return 0.0f;
        }
        int i = this.curBlockIdx;
        while (i < this.blocks.size()) {
            Layout layout = ((Block) this.blocks.get(i)).getLayout();
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

    private boolean isAtAbsoluteEnd() {
        if (this.blocks.isEmpty()) {
            return true;
        }
        int size = this.blocks.size() - 1;
        Layout layout = null;
        while (size >= 0) {
            layout = ((Block) this.blocks.get(size)).getLayout();
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

    public int indexOf(Block block) {
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            if (this.blocks.get(i) == block) {
                return i;
            }
        }
        return -1;
    }

    static {
        Paint paint = new Paint(1);
        MASK_PAINT = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        GRADIENT = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, Layout layout, int i, float f) {
        drawLayoutWithLastLineFade(canvas, layout, i, f, null);
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, final Layout layout, int i, float f, Renderer renderer) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i < 0 || i >= lineCount) {
            return;
        }
        Renderer renderer2 = renderer != null ? renderer : new Renderer() {
            @Override
            public final void draw(Canvas canvas2) {
                layout.draw(canvas2);
            }
        };
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            renderer2.draw(canvas);
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
            renderer2.draw(canvas);
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
        renderer2.draw(canvas);
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
