package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class UploadingDotsSpannable extends ReplacementSpan {
    public boolean fixTop;
    public boolean isMediumTypeface;
    public long lastTime;
    public View parent;
    public float swapProgress;
    public boolean waitForNextAnimation;
    public int swapPosition1 = 1;
    public int swapPosition2 = 2;
    public final CubicBezierInterpolator circle = new CubicBezierInterpolator(0.0f, 0.5f, 0.5f, 1.0f);

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fLerp;
        TextPaint textPaint = (TextPaint) paint;
        float fMeasureText = paint.measureText("…") / 3.0f;
        float f2 = -(this.fixTop ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f3 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.isMediumTypeface ? 0.05f : 0.0365f);
        float f4 = f2 - f3;
        if (!this.waitForNextAnimation) {
            float f5 = this.swapProgress + 0.053333335f;
            this.swapProgress = f5;
            if (f5 > 1.0f) {
                this.swapProgress = 0.0f;
                int i6 = this.swapPosition1 - 1;
                this.swapPosition1 = i6;
                this.swapPosition2--;
                if (i6 < 0) {
                    this.swapPosition1 = 1;
                    this.swapPosition2 = 2;
                    this.waitForNextAnimation = true;
                    this.lastTime = System.currentTimeMillis();
                }
            }
        } else if (System.currentTimeMillis() - this.lastTime > 1000) {
            this.waitForNextAnimation = false;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            float f6 = fMeasureText / 2.0f;
            float fLerp2 = (i7 * fMeasureText) + f + f6;
            if (i7 == this.swapPosition1) {
                fLerp2 = AndroidUtilities.lerp(fLerp2, OKLCH.m(fMeasureText, i7 + 1, f, f6), this.swapProgress);
                float f7 = this.swapProgress;
                fLerp = AndroidUtilities.lerp(f4, f4 - f6, this.circle.getInterpolation(f7 < 0.5f ? f7 / 0.5f : ImageReceiver$$ExternalSyntheticOutline1.m(f7, 0.5f, 0.5f, 1.0f)));
            } else {
                if (i7 == this.swapPosition2) {
                    fLerp2 = AndroidUtilities.lerp(fLerp2, OKLCH.m(fMeasureText, i7 - 1, f, f6), this.swapProgress);
                }
                fLerp = f4;
            }
            canvas.drawCircle(fLerp2, fLerp, f3, paint);
        }
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }

    public final void setParent(ChatActionCell chatActionCell) {
        this.parent = chatActionCell;
        this.isMediumTypeface = false;
    }
}
