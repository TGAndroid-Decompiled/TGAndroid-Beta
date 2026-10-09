package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class sr0 extends View {
    public Random f30877a;
    public Paint f30878b;
    public Paint f30879c;
    public Paint d;
    public Paint f30880e;
    public float f30881f;
    public float h;
    public float f30882n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f30879c;
        Paint paint2 = this.f30878b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        hs hsVar = hs.f27119g;
        float f11 = this.f30881f;
        if (f11 > 0.4f) {
            f7 = (f11 - 0.4f) / 0.6f;
        } else {
            f7 = 0.0f;
        }
        float interpolation = hsVar.getInterpolation(f7);
        float f12 = (this.f30882n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.q.A(4.0f, getMeasuredHeight(), dp)) * f12);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i10) + AndroidUtilities.dp(f10);
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = dp2;
            float f14 = dp2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f13, org.telegram.messenger.q.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i10++;
            f10 = f10;
        }
        float f15 = f10;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.f30880e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f12) + AndroidUtilities.dp(f15);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(f15), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(f15), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(f15));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint);
        float f16 = this.f30881f + 0.016f;
        this.f30881f = f16;
        if (f16 > 1.0f) {
            this.h = this.f30882n;
            float d = org.telegram.ui.Cells.c1.d(this.f30877a, 1001) / 1000.0f;
            this.f30882n = d;
            if (d > this.h) {
                this.f30882n = d + 0.3f;
            } else {
                this.f30882n = d - 0.3f;
            }
            this.f30882n = Math.max(0.0f, Math.min(1.0f, this.f30882n));
            this.f30881f = 0.0f;
        }
        invalidate();
    }
}
