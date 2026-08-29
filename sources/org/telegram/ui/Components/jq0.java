package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class jq0 extends View {
    public Random f29794a;
    public Paint f29795b;
    public Paint f29796c;
    public Paint d;
    public Paint f29797e;
    public float f29798f;
    public float h;
    public float f29799n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        Paint paint = this.f29796c;
        Paint paint2 = this.f29795b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int i10 = 7;
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        jr jrVar = jr.f29801g;
        float f11 = this.f29798f;
        if (f11 > 0.4f) {
            f9 = (f11 - 0.4f) / 0.6f;
        } else {
            f9 = 0.0f;
        }
        float interpolation = jrVar.getInterpolation(f9);
        float f12 = (this.f29799n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.x3.z(4.0f, getMeasuredHeight(), dp)) * f12);
        int i11 = 0;
        while (i11 < i10) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i11) + AndroidUtilities.dp(f10);
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = dp2;
            float f14 = dp2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f13, org.telegram.messenger.x3.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i11++;
            i10 = 7;
            f10 = 3.0f;
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.f29797e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f12) + AndroidUtilities.dp(3.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(3.0f), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
        float f15 = this.f29798f + 0.016f;
        this.f29798f = f15;
        if (f15 > 1.0f) {
            this.h = this.f29799n;
            float f16 = org.telegram.ui.th.f(this.f29794a, 1001) / 1000.0f;
            this.f29799n = f16;
            if (f16 > this.h) {
                this.f29799n = f16 + 0.3f;
            } else {
                this.f29799n = f16 - 0.3f;
            }
            this.f29799n = Math.max(0.0f, Math.min(1.0f, this.f29799n));
            this.f29798f = 0.0f;
        }
        invalidate();
    }
}
