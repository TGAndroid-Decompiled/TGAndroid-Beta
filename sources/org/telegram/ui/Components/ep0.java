package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
public final class ep0 extends View implements org.telegram.ui.ActionBar.c6 {
    public Random f34832a;
    public Paint f34833b;
    public Paint f34834c;
    public Paint d;
    public Paint f34835e;
    public float f34836f;
    public float h;
    public float f34837n;

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f34834c;
        Paint paint2 = this.f34833b;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float f11 = 3.0f;
        int measuredWidth = (getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(3.0f);
        int L = org.telegram.messenger.g0.L(1.0f) + ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * 7);
        kr krVar = kr.f36859g;
        float f12 = this.f34836f;
        if (f12 > 0.4f) {
            f10 = (f12 - 0.4f) / 0.6f;
        } else {
            f10 = 0.0f;
        }
        float interpolation = krVar.getInterpolation(f10);
        float f13 = (this.f34837n * interpolation) + ((1.0f - interpolation) * this.h);
        canvas.save();
        canvas.translate(0.0f, (-org.telegram.messenger.f3.B(4.0f, getMeasuredHeight(), L)) * f13);
        int i7 = 0;
        for (int i10 = 7; i7 < i10; i10 = 7) {
            int L2 = ((org.telegram.messenger.g0.L(1.0f) + measuredWidth) * i7) + org.telegram.messenger.g0.L(f11);
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = L2;
            float f15 = L2 + measuredWidth;
            rectF.set(0.0f, f14, measuredWidth, f15);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            rectF.set(org.telegram.messenger.g0.L(1.0f) + measuredWidth, f14, org.telegram.messenger.f3.C(1.0f, measuredWidth, measuredWidth), f15);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
            i7++;
            f11 = f11;
        }
        float f16 = f11;
        canvas.restore();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.d);
        canvas.translate(0.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(4.0f), this.f34835e);
        canvas.restore();
        float measuredHeight = ((getMeasuredHeight() - org.telegram.messenger.g0.L(21.0f)) * f13) + org.telegram.messenger.g0.L(f16);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(getMeasuredWidth() - org.telegram.messenger.g0.L(f16), measuredHeight, getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + measuredHeight);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(1.5f), paint);
        float centerY = rectF2.centerY();
        float L3 = org.telegram.messenger.g0.L(0.5f) + measuredWidth;
        rectF2.set(L3 - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(f16), L3 + org.telegram.messenger.g0.L(8.0f), centerY + org.telegram.messenger.g0.L(f16));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint);
        float f17 = this.f34836f + 0.016f;
        this.f34836f = f17;
        if (f17 > 1.0f) {
            this.h = this.f34837n;
            float abs = Math.abs(this.f34832a.nextInt() % 1001) / 1000.0f;
            this.f34837n = abs;
            if (abs > this.h) {
                this.f34837n = abs + 0.3f;
            } else {
                this.f34837n = abs - 0.3f;
            }
            this.f34837n = Math.max(0.0f, Math.min(1.0f, this.f34837n));
            this.f34836f = 0.0f;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f34833b;
            int i7 = org.telegram.ui.ActionBar.n6.f29516gg;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 76));
            this.f34834c.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
