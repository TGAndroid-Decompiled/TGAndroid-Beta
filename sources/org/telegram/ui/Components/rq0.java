package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class rq0 extends View {
    public Random f30870a;
    public Paint f30871b;
    public Paint f30872c;
    public Paint d;
    public Paint f30873e;
    public float f30874f;
    public float h;
    public float f30875n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f30872c;
        Paint paint2 = this.f30871b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f11 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int i10 = 7;
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        pr prVar = pr.f30169g;
        float f12 = this.f30874f;
        if (f12 > 0.4f) {
            f10 = (f12 - 0.4f) / 0.6f;
        } else {
            f10 = 0.0f;
        }
        float interpolation = prVar.getInterpolation(f10);
        float f13 = (this.f30875n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.y3.z(4.0f, getMeasuredHeight(), dp)) * f13);
        int i11 = 0;
        while (i11 < i10) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i11) + AndroidUtilities.dp(f11);
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = dp2;
            float f15 = dp2 + measuredWidth;
            rectF.set(0.0f, f14, measuredWidth, f15);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f14, org.telegram.messenger.y3.C(1.0f, measuredWidth, measuredWidth), f15);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i11++;
            i10 = 7;
            f11 = 3.0f;
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.f30873e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f13) + AndroidUtilities.dp(3.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(3.0f), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
        float f16 = this.f30874f + 0.016f;
        this.f30874f = f16;
        if (f16 > 1.0f) {
            this.h = this.f30875n;
            float f17 = org.telegram.ui.yh.f(this.f30870a, 1001) / 1000.0f;
            this.f30875n = f17;
            if (f17 > this.h) {
                this.f30875n = f17 + 0.3f;
            } else {
                this.f30875n = f17 - 0.3f;
            }
            this.f30875n = Math.max(0.0f, Math.min(1.0f, this.f30875n));
            this.f30874f = 0.0f;
        }
        invalidate();
    }
}
