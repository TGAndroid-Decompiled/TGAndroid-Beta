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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;

public final class MultiLayoutTypingAnimator implements Choreographer.FrameCallback {
    public static final LinearGradient GRADIENT;
    public static final Matrix GRAD_MTX = new Matrix();
    public static final Paint MASK_PAINT;
    public View lastInvalidatedView;
    public ChatMessageCell$$ExternalSyntheticLambda5 onFinishRunnable;
    public final Choreographer choreo = Choreographer.getInstance();
    public List blocks = new ArrayList();
    public final ArrayList blockAlphas = new ArrayList();
    public int curBlockIdx = 0;
    public int curLineIdx = 0;
    public float xPosition = 0.0f;
    public boolean running = false;
    public boolean finished = true;
    public long lastFrameNs = 0;
    public float speedPxPerSec = AndroidUtilities.dp(40.0f);

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

    public static void drawLayoutWithLastLineFade(Canvas canvas, Layout layout, int i, float f, Renderer renderer) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i < 0 || i >= lineCount) {
            return;
        }
        Renderer photoViewer$$ExternalSyntheticLambda115 = renderer != null ? renderer : new PhotoViewer$$ExternalSyntheticLambda115(layout, 11);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            photoViewer$$ExternalSyntheticLambda115.draw(canvas);
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
            photoViewer$$ExternalSyntheticLambda115.draw(canvas);
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
        photoViewer$$ExternalSyntheticLambda115.draw(canvas);
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

    public final void applyBlockAlphas(float f) {
        int size = this.blocks.size();
        View view = null;
        int i = 0;
        while (i < size) {
            Block block = (Block) this.blocks.get(i);
            float fMin = (this.finished || i <= this.curBlockIdx) ? 1.0f : 0.0f;
            ArrayList arrayList = this.blockAlphas;
            float fFloatValue = i < arrayList.size() ? ((Float) arrayList.get(i)).floatValue() : fMin;
            if (fFloatValue == fMin) {
                fMin = fFloatValue;
            } else if (f > 0.0f) {
                float f2 = f / 0.2f;
                fMin = fMin > fFloatValue ? Math.min(fMin, f2 + fFloatValue) : Math.max(fMin, fFloatValue - f2);
            }
            if (i < arrayList.size() && fMin != fFloatValue) {
                arrayList.set(i, Float.valueOf(fMin));
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

    @Override
    public final void doFrame(long j) {
        if (this.running) {
            long j2 = this.lastFrameNs;
            float f = 0.0f;
            if (j2 != 0) {
                float f2 = (j - j2) * 1.0E-9f;
                if (this.blocks.isEmpty() || f2 <= 0.0f) {
                    this.finished = this.blocks.isEmpty();
                } else {
                    float f3 = this.speedPxPerSec * f2;
                    while (f3 > 0.0f) {
                        if (this.curBlockIdx >= this.blocks.size()) {
                            this.finished = true;
                            break;
                        }
                        Layout layout = ((Block) this.blocks.get(this.curBlockIdx)).getLayout();
                        if (layout != null && layout.getLineCount() != 0) {
                            if (this.curLineIdx >= layout.getLineCount()) {
                                int lineCount = layout.getLineCount() - 1;
                                this.curLineIdx = lineCount;
                                float lineRight = layout.getLineRight(lineCount) - layout.getLineLeft(lineCount);
                                if (lineRight < 0.0f) {
                                    lineRight = -lineRight;
                                }
                                this.xPosition = lineRight;
                            }
                            int i = this.curLineIdx;
                            float lineRight2 = layout.getLineRight(i) - layout.getLineLeft(i);
                            if (lineRight2 < 0.0f) {
                                lineRight2 = -lineRight2;
                            }
                            if (lineRight2 <= 0.001f) {
                                if (nextLineOrBlock(layout)) {
                                    break;
                                }
                            } else {
                                float f4 = this.xPosition;
                                float f5 = lineRight2 - f4;
                                if (f5 <= 0.001f) {
                                    if (nextLineOrBlock(layout)) {
                                        break;
                                    }
                                } else {
                                    if (f3 < f5) {
                                        f5 = f3;
                                    }
                                    float f6 = f4 + f5;
                                    this.xPosition = f6;
                                    f3 -= f5;
                                    if (lineRight2 - f6 <= 0.001f && !nextLineOrBlock(layout)) {
                                        f3 = 0.0f;
                                    }
                                }
                            }
                        } else {
                            this.curBlockIdx++;
                            this.curLineIdx = 0;
                            this.xPosition = 0.0f;
                        }
                    }
                    this.finished = isAtAbsoluteEnd();
                }
                f = f2;
            }
            this.lastFrameNs = j;
            applyBlockAlphas(f);
            invalidate();
            if (!this.finished) {
                this.choreo.postFrameCallback(this);
                return;
            }
            this.running = false;
            ArrayList arrayList = this.blockAlphas;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.set(i2, Float.valueOf(1.0f));
            }
            int size2 = this.blocks.size();
            View view = null;
            for (int i3 = 0; i3 < size2; i3++) {
                View parentView = ((Block) this.blocks.get(i3)).getParentView();
                if (parentView != null && parentView != view) {
                    if (parentView.getAlpha() != 1.0f) {
                        parentView.setAlpha(1.0f);
                    }
                    view = parentView;
                }
            }
            ChatMessageCell$$ExternalSyntheticLambda5 chatMessageCell$$ExternalSyntheticLambda5 = this.onFinishRunnable;
            if (chatMessageCell$$ExternalSyntheticLambda5 != null) {
                chatMessageCell$$ExternalSyntheticLambda5.run();
                this.onFinishRunnable = null;
            }
        }
    }

    public final int indexOf(Block block) {
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            if (this.blocks.get(i) == block) {
                return i;
            }
        }
        return -1;
    }

    public final void invalidate() {
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
        }
    }

    public final boolean isAtAbsoluteEnd() {
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
        float lineRight = layout.getLineRight(lineCount) - layout.getLineLeft(lineCount);
        if (lineRight < 0.0f) {
            lineRight = -lineRight;
        }
        return this.curLineIdx >= lineCount && this.xPosition >= lineRight - 0.001f;
    }

    public final boolean isFadeBlock(Block block) {
        Layout layout;
        return indexOf(block) == this.curBlockIdx && (layout = block.getLayout()) != null && this.curLineIdx < layout.getLineCount();
    }

    public final boolean isRunning() {
        return this.running;
    }

    public final boolean needDraw(Block block) {
        int iIndexOf = indexOf(block);
        if (iIndexOf < 0 || this.blocks.isEmpty()) {
            return false;
        }
        int i = this.curBlockIdx;
        return iIndexOf < i || iIndexOf <= i;
    }

    public final boolean nextLineOrBlock(Layout layout) {
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

    public final void setBlocks(List list) {
        float f;
        ArrayList arrayList;
        boolean z;
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
        if (list.isEmpty()) {
            f = 0.0f;
        } else {
            int i = this.curBlockIdx;
            f = 0.0f;
            while (i < this.blocks.size()) {
                Layout layout2 = ((Block) this.blocks.get(i)).getLayout();
                if (layout2 != null) {
                    int iMin = i == this.curBlockIdx ? Math.min(Math.max(this.curLineIdx, 0), Math.max(0, layout2.getLineCount() - 1)) : 0;
                    for (int i2 = iMin; i2 < layout2.getLineCount(); i2++) {
                        float lineRight = layout2.getLineRight(i2) - layout2.getLineLeft(i2);
                        if (lineRight < 0.0f) {
                            lineRight = -lineRight;
                        }
                        if (lineRight > 0.001f) {
                            if (i == this.curBlockIdx && i2 == iMin) {
                                lineRight -= this.xPosition;
                                if (lineRight > 0.001f) {
                                    f += lineRight;
                                }
                            } else {
                                f += lineRight;
                            }
                        }
                    }
                }
                i++;
            }
        }
        float fDp = AndroidUtilities.dp(40.0f);
        if (f <= 0.001f) {
            this.speedPxPerSec = fDp;
        } else {
            this.speedPxPerSec = Math.max(fDp, f / 1.05f);
        }
        this.finished = isAtAbsoluteEnd();
        while (true) {
            arrayList = this.blockAlphas;
            if (arrayList.size() <= this.blocks.size()) {
                break;
            } else {
                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList);
            }
        }
        int size2 = arrayList.size();
        while (size2 < this.blocks.size()) {
            arrayList.add(Float.valueOf((this.finished || size2 <= this.curBlockIdx) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.finished && !(z = this.running) && !z) {
            this.running = true;
            if (isAtAbsoluteEnd()) {
                this.finished = true;
            }
            this.lastFrameNs = 0L;
            this.choreo.postFrameCallback(this);
        }
        applyBlockAlphas(0.0f);
        invalidate();
    }

    public final void setOnFinishListener(ChatMessageCell$$ExternalSyntheticLambda5 chatMessageCell$$ExternalSyntheticLambda5) {
        this.onFinishRunnable = chatMessageCell$$ExternalSyntheticLambda5;
    }
}
