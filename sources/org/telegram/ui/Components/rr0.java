package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class rr0 extends View implements org.telegram.ui.ActionBar.p6 {
    public Random f32289a;
    public Paint f32290b;
    public Paint f32291c;
    public Paint d;
    public Paint e;
    public float f32292f;
    public float h;
    public float f32293n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f32291c;
        Paint paint2 = this.f32290b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
        int dp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
        ds dsVar = ds.f27585g;
        float f11 = this.f32292f;
        if (f11 > 0.4f) {
            f7 = (f11 - 0.4f) / 0.6f;
        } else {
            f7 = 0.0f;
        }
        float interpolation = dsVar.getInterpolation(f7);
        float f12 = (this.f32293n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.t.B(4.0f, getMeasuredHeight(), dp)) * f12);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            int dp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i10) + AndroidUtilities.dp(f10);
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = dp2;
            float f14 = dp2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f13, org.telegram.messenger.t.D(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
            i10++;
            f10 = f10;
        }
        float f15 = f10;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f12) + AndroidUtilities.dp(f15);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(f15), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.5f), AndroidUtilities.dp(1.5f), paint);
        float centerY = rectF2.centerY();
        float dp3 = AndroidUtilities.dp(0.5f) + measuredWidth;
        rectF2.set(dp3 - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(f15), dp3 + AndroidUtilities.dp(8.0f), centerY + AndroidUtilities.dp(f15));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint);
        float f16 = this.f32292f + 0.016f;
        this.f32292f = f16;
        if (f16 > 1.0f) {
            this.h = this.f32293n;
            float j10 = org.telegram.ui.d3.j(this.f32289a, 1001) / 1000.0f;
            this.f32293n = j10;
            if (j10 > this.h) {
                this.f32293n = j10 + 0.3f;
            } else {
                this.f32293n = j10 - 0.3f;
            }
            this.f32293n = Math.max(0.0f, Math.min(1.0f, this.f32293n));
            this.f32292f = 0.0f;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f32290b;
            int i10 = org.telegram.ui.ActionBar.y6.f23585pf;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 76));
            this.f32291c.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
