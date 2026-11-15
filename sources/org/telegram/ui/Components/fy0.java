package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class fy0 extends ReplacementSpan {
    public final int f34749a;
    public int f34750b;
    public final Object f34751c;

    public fy0(int i7) {
        this.f34749a = 0;
        Paint paint = new Paint(1);
        this.f34751c = paint;
        this.f34750b = i7;
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28875ee, false)));
    }

    public void a(int i7) {
        org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) this.f34751c;
        if (em0Var != null) {
            em0Var.f46861a = i7 / 2.0f;
            em0Var.d();
            this.f34750b = i7;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f34749a) {
            case 0:
                float L = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.33f);
                RectF rectF = org.telegram.messenger.g0.P;
                float L2 = org.telegram.messenger.g0.L(6.66f) / 2.0f;
                rectF.set(f10, L - L2, this.f34750b + f10, L + L2);
                Paint paint2 = (Paint) this.f34751c;
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28875ee, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
            default:
                org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) this.f34751c;
                if (em0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    float L3 = f10 + org.telegram.messenger.g0.L(5.0f);
                    int i15 = this.f34750b;
                    em0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.f34750b, (int) (L3 + i15), i14 + i15);
                    em0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f34749a) {
            case 0:
                return this.f34750b;
            default:
                return org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(3.0f) + this.f34750b;
        }
    }

    public fy0(boolean z10, int i7, int i10) {
        this.f34749a = 1;
        this.f34750b = org.telegram.messenger.g0.L(21.0f);
        this.f34751c = z10 ? org.telegram.ui.em0.c(i7, i10) : org.telegram.ui.em0.a(i7, i10);
    }
}
