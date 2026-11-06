package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class dy0 extends ReplacementSpan {
    public final int f33092a;
    public int f33093b;
    public final Object f33094c;

    public dy0(int i7) {
        this.f33092a = 0;
        Paint paint = new Paint(1);
        this.f33094c = paint;
        this.f33093b = i7;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27819be, false)));
    }

    public void a(int i7) {
        org.telegram.ui.cm0 cm0Var = (org.telegram.ui.cm0) this.f33094c;
        if (cm0Var != null) {
            cm0Var.f44850a = i7 / 2.0f;
            cm0Var.d();
            this.f33093b = i7;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f33092a) {
            case 0:
                float L = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.33f);
                RectF rectF = org.telegram.messenger.g0.P;
                float L2 = org.telegram.messenger.g0.L(6.66f) / 2.0f;
                rectF.set(f10, L - L2, this.f33093b + f10, L + L2);
                Paint paint2 = (Paint) this.f33094c;
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27819be, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
            default:
                org.telegram.ui.cm0 cm0Var = (org.telegram.ui.cm0) this.f33094c;
                if (cm0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    float L3 = f10 + org.telegram.messenger.g0.L(5.0f);
                    int i15 = this.f33093b;
                    cm0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.f33093b, (int) (L3 + i15), i14 + i15);
                    cm0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f33092a) {
            case 0:
                return this.f33093b;
            default:
                return org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(3.0f) + this.f33093b;
        }
    }

    public dy0(boolean z9, int i7, int i10) {
        this.f33092a = 1;
        this.f33093b = org.telegram.messenger.g0.L(21.0f);
        this.f33094c = z9 ? org.telegram.ui.cm0.c(i7, i10) : org.telegram.ui.cm0.a(i7, i10);
    }
}
