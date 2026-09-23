package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class nq0 extends View {
    public Random f26492a;
    public Paint f26493b;
    public Paint f26494c;
    public Paint d;
    public Paint e;
    public float f26495f;
    public float h;
    public float f26496n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f26494c;
        Paint paint2 = this.f26493b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int i10 = 7;
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        rr rrVar = rr.f27702g;
        float f11 = this.f26495f;
        if (f11 > 0.4f) {
            f7 = (f11 - 0.4f) / 0.6f;
        } else {
            f7 = 0.0f;
        }
        float interpolation = rrVar.getInterpolation(f7);
        float f12 = (this.f26496n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.z0.z(4.0f, getMeasuredHeight(), dp)) * f12);
        int i11 = 0;
        while (i11 < i10) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i11) + AndroidUtilities.dp(f10);
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = dp2;
            float f14 = dp2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f13, org.telegram.messenger.z0.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i11++;
            i10 = 7;
            f10 = 3.0f;
        }
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f12) + AndroidUtilities.dp(3.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(3.0f), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
        float f15 = this.f26495f + 0.016f;
        this.f26495f = f15;
        if (f15 > 1.0f) {
            this.h = this.f26496n;
            float c10 = org.telegram.ui.Cells.q3.c(this.f26492a, 1001) / 1000.0f;
            this.f26496n = c10;
            if (c10 > this.h) {
                this.f26496n = c10 + 0.3f;
            } else {
                this.f26496n = c10 - 0.3f;
            }
            this.f26496n = Math.max(0.0f, Math.min(1.0f, this.f26496n));
            this.f26495f = 0.0f;
        }
        invalidate();
    }
}
