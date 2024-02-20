package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
public class UploadingDotsSpannable extends ReplacementSpan {
    public boolean fixTop;
    private boolean isMediumTypeface;
    long lastTime;
    private View parent;
    float swapProgress;
    boolean waitForNextAnimation;
    int swapPosition1 = 1;
    int swapPosition2 = 2;
    CubicBezierInterpolator circle = new CubicBezierInterpolator(0.0f, 0.5f, 0.5f, 1.0f);

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText("…");
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        TextPaint textPaint = (TextPaint) paint;
        float measureText = paint.measureText("…") / 3.0f;
        float f3 = -(this.fixTop ? textPaint.getFontMetrics().ascent : textPaint.getFontMetrics().top);
        float f4 = (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top) * (this.isMediumTypeface ? 0.05f : 0.0365f);
        float f5 = f3 - f4;
        if (this.waitForNextAnimation) {
            if (System.currentTimeMillis() - this.lastTime > 1000) {
                this.waitForNextAnimation = false;
            }
        } else {
            float f6 = this.swapProgress + 0.053333335f;
            this.swapProgress = f6;
            if (f6 > 1.0f) {
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
        }
        for (int i7 = 0; i7 < 3; i7++) {
            float f7 = measureText / 2.0f;
            float f8 = (i7 * measureText) + f + f7;
            if (i7 == this.swapPosition1) {
                f8 = AndroidUtilities.lerp(f8, ((i7 + 1) * measureText) + f + f7, this.swapProgress);
                float f9 = this.swapProgress;
                f2 = AndroidUtilities.lerp(f5, f5 - f7, this.circle.getInterpolation(f9 < 0.5f ? f9 / 0.5f : 1.0f - ((f9 - 0.5f) / 0.5f)));
            } else {
                if (i7 == this.swapPosition2) {
                    f8 = AndroidUtilities.lerp(f8, ((i7 - 1) * measureText) + f + f7, this.swapProgress);
                }
                f2 = f5;
            }
            canvas.drawCircle(f8, f2, f4, paint);
        }
        View view = this.parent;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setParent(View view, boolean z) {
        this.parent = view;
        this.isMediumTypeface = z;
    }
}
