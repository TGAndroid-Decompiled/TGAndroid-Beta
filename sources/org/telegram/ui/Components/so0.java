package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
public final class so0 extends View implements org.telegram.ui.ActionBar.z5 {
    public Random f38096a;
    public Paint f38097b;
    public Paint f38098c;
    public Paint d;
    public Paint f38099e;
    public float f38100f;
    public float h;
    public float f38101n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f38098c;
        Paint paint2 = this.f38097b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f11 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(3.0f);
        int L = org.telegram.messenger.g0.L(1.0f) + ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * 7);
        xq xqVar = xq.f40453g;
        float f12 = this.f38100f;
        if (f12 > 0.4f) {
            f10 = (f12 - 0.4f) / 0.6f;
        } else {
            f10 = 0.0f;
        }
        float interpolation = xqVar.getInterpolation(f10);
        float f13 = (this.f38101n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.k5.B(4.0f, getMeasuredHeight(), L)) * f13);
        int i3 = 0;
        for (int i10 = 7; i3 < i10; i10 = 7) {
            int L2 = ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * i3) + org.telegram.messenger.g0.L(f11);
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = L2;
            float f15 = L2 + measuredWidth;
            rectF.set(0.0f, f14, measuredWidth, f15);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            rectF.set(org.telegram.messenger.g0.L(1.0f) + measuredWidth, f14, org.telegram.messenger.k5.C(1.0f, measuredWidth, measuredWidth), f15);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            i3++;
            f11 = f11;
        }
        float f16 = f11;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.f38099e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - org.telegram.messenger.g0.L(21.0f)) * f13) + org.telegram.messenger.g0.L(f16);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(getMeasuredWidth() - org.telegram.messenger.g0.L(f16), measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = org.telegram.messenger.g0.L(0.5f) + measuredWidth;
        rectF2.set(L3 - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(f16), L3 + org.telegram.messenger.g0.L(8.0f), centerY + org.telegram.messenger.g0.L(f16));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint);
        float f17 = this.f38100f + 0.016f;
        this.f38100f = f17;
        if (f17 > 1.0f) {
            this.h = this.f38101n;
            float abs = Math.abs(this.f38096a.nextInt() % 1001) / 1000.0f;
            this.f38101n = abs;
            if (abs > this.h) {
                this.f38101n = abs + 0.3f;
            } else {
                this.f38101n = abs - 0.3f;
            }
            this.f38101n = Math.max(0.0f, Math.min(1.0f, this.f38101n));
            this.f38100f = 0.0f;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f38097b;
            int i3 = org.telegram.ui.ActionBar.k6.f27888dg;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 76));
            this.f38098c.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
