package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class cy0 extends ReplacementSpan {
    public final int f32854a;
    public int f32855b;
    public final Object f32856c;

    public cy0(int i3) {
        this.f32854a = 0;
        Paint paint = new Paint(1);
        this.f32856c = paint;
        this.f32855b = i3;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27850be, false)));
    }

    public void a(int i3) {
        org.telegram.ui.xl0 xl0Var = (org.telegram.ui.xl0) this.f32856c;
        if (xl0Var != null) {
            xl0Var.f52043a = i3 / 2.0f;
            xl0Var.d();
            this.f32855b = i3;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f32854a) {
            case 0:
                float L = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.33f);
                RectF rectF = org.telegram.messenger.g0.P;
                float L2 = org.telegram.messenger.g0.L(6.66f) / 2.0f;
                rectF.set(f10, L - L2, this.f32855b + f10, L + L2);
                Paint paint2 = (Paint) this.f32856c;
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27850be, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
            default:
                org.telegram.ui.xl0 xl0Var = (org.telegram.ui.xl0) this.f32856c;
                if (xl0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    float L3 = f10 + org.telegram.messenger.g0.L(5.0f);
                    int i15 = this.f32855b;
                    xl0Var.setBounds((int) (org.telegram.messenger.g0.L(3.0f) + f10), i14 - this.f32855b, (int) (L3 + i15), i14 + i15);
                    xl0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f32854a) {
            case 0:
                return this.f32855b;
            default:
                return org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(3.0f) + this.f32855b;
        }
    }

    public cy0(boolean z10, int i3, int i10) {
        this.f32854a = 1;
        this.f32855b = org.telegram.messenger.g0.L(21.0f);
        this.f32856c = z10 ? org.telegram.ui.xl0.c(i3, i10) : org.telegram.ui.xl0.a(i3, i10);
    }
}
