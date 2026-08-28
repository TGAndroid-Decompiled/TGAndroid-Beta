package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class xp0 extends View {
    public Random f34734a;
    public Paint f34735b;
    public Paint f34736c;
    public Paint d;
    public Paint f34737e;
    public float f34738f;
    public float h;
    public float f34739n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f34736c;
        Paint paint2 = this.f34735b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f11 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int i9 = 7;
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        gr grVar = gr.f28845g;
        float f12 = this.f34738f;
        if (f12 > 0.4f) {
            f10 = (f12 - 0.4f) / 0.6f;
        } else {
            f10 = 0.0f;
        }
        float interpolation = grVar.getInterpolation(f10);
        float f13 = (this.f34739n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.l0.A(4.0f, getMeasuredHeight(), dp)) * f13);
        int i10 = 0;
        while (i10 < i9) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i10) + AndroidUtilities.dp(f11);
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = dp2;
            float f15 = dp2 + measuredWidth;
            rectF.set(0.0f, f14, measuredWidth, f15);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f14, org.telegram.messenger.l0.C(1.0f, measuredWidth, measuredWidth), f15);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i10++;
            i9 = 7;
            f11 = 3.0f;
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.f34737e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f13) + AndroidUtilities.dp(3.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(3.0f), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
        float f16 = this.f34738f + 0.016f;
        this.f34738f = f16;
        if (f16 > 1.0f) {
            this.h = this.f34739n;
            float e10 = org.telegram.ui.Cells.j2.e(this.f34734a, 1001) / 1000.0f;
            this.f34739n = e10;
            if (e10 > this.h) {
                this.f34739n = e10 + 0.3f;
            } else {
                this.f34739n = e10 - 0.3f;
            }
            this.f34739n = Math.max(0.0f, Math.min(1.0f, this.f34739n));
            this.f34738f = 0.0f;
        }
        invalidate();
    }
}
