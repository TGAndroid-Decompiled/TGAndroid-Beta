package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
public final class tp0 extends View implements org.telegram.ui.ActionBar.k6 {
    public Random f30668a;
    public Paint f30669b;
    public Paint f30670c;
    public Paint d;
    public Paint e;
    public float f30671f;
    public float h;
    public float f30672n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f30670c;
        Paint paint2 = this.f30669b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f10 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(3.0f);
        int L = org.telegram.messenger.i0.L(1.0f) + ((org.telegram.messenger.i0.L(1.0f) + measuredWidth) * 7);
        gr grVar = gr.f26496g;
        float f11 = this.f30671f;
        if (f11 > 0.4f) {
            f7 = (f11 - 0.4f) / 0.6f;
        } else {
            f7 = 0.0f;
        }
        float interpolation = grVar.getInterpolation(f7);
        float f12 = (this.f30672n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.m5.B(4.0f, getMeasuredHeight(), L)) * f12);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            int L2 = ((org.telegram.messenger.i0.L(1.0f) + measuredWidth) * i10) + org.telegram.messenger.i0.L(f10);
            RectF rectF = org.telegram.messenger.i0.P;
            float f13 = L2;
            float f14 = L2 + measuredWidth;
            rectF.set(0.0f, f13, measuredWidth, f14);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint2);
            rectF.set(org.telegram.messenger.i0.L(1.0f) + measuredWidth, f13, org.telegram.messenger.m5.C(1.0f, measuredWidth, measuredWidth), f14);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint2);
            i10++;
            f10 = f10;
        }
        float f15 = f10;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(4.0f), this.e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - org.telegram.messenger.i0.L(21.0f)) * f12) + org.telegram.messenger.i0.L(f15);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(getMeasuredWidth() - org.telegram.messenger.i0.L(f15), measuredHeight, getMeasuredWidth(), org.telegram.messenger.i0.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = org.telegram.messenger.i0.L(0.5f) + measuredWidth;
        rectF2.set(L3 - org.telegram.messenger.i0.L(8.0f), centerY - org.telegram.messenger.i0.L(f15), L3 + org.telegram.messenger.i0.L(8.0f), centerY + org.telegram.messenger.i0.L(f15));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint);
        float f16 = this.f30671f + 0.016f;
        this.f30671f = f16;
        if (f16 > 1.0f) {
            this.h = this.f30672n;
            float abs = Math.abs(this.f30668a.nextInt() % 1001) / 1000.0f;
            this.f30672n = abs;
            if (abs > this.h) {
                this.f30672n = abs + 0.3f;
            } else {
                this.f30672n = abs - 0.3f;
            }
            this.f30672n = Math.max(0.0f, Math.min(1.0f, this.f30672n));
            this.f30671f = 0.0f;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f30669b;
            int i10 = org.telegram.ui.ActionBar.t6.f20939dg;
            paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 76));
            this.f30670c.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
