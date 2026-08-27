package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;

public final class yp0 extends View {

    public Random f34941a;

    public Paint f34942b;

    public Paint f34943c;
    public Paint d;

    public Paint f34944e;

    public float f34945f;
    public float h;

    public float f34946n;

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f34943c;
        Paint paint2 = this.f34942b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int i10 = 7;
        int iDp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        er erVar = er.f28123g;
        float f11 = this.f34945f;
        float interpolation = erVar.getInterpolation(f11 > 0.4f ? (f11 - 0.4f) / 0.6f : 0.0f);
        float f12 = (this.f34946n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.y1.A(4.0f, getMeasuredHeight(), iDp)) * f12);
        int i11 = 0;
        while (i11 < i10) {
            int iDp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i11) + AndroidUtilities.dp(f10);
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = iDp2;
            float f14 = iDp2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f13, org.telegram.messenger.y1.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i11++;
            i10 = 7;
            f10 = 3.0f;
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.f34944e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f12) + AndroidUtilities.dp(3.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float fCenterY = rectF2.centerY();
        float fDp = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(fDp - AndroidUtilities.dp(8.0f), fCenterY - AndroidUtilities.dp(3.0f), fDp + AndroidUtilities.dp(8.0f), fCenterY + AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
        float f15 = this.f34945f + 0.016f;
        this.f34945f = f15;
        if (f15 > 1.0f) {
            this.h = this.f34946n;
            float f16 = org.telegram.ui.Cells.pa.f(this.f34941a, 1001) / 1000.0f;
            this.f34946n = f16;
            if (f16 > this.h) {
                this.f34946n = f16 + 0.3f;
            } else {
                this.f34946n = f16 - 0.3f;
            }
            this.f34946n = Math.max(0.0f, Math.min(1.0f, this.f34946n));
            this.f34945f = 0.0f;
        }
        invalidate();
    }
}
