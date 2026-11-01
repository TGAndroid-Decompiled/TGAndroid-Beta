package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class iz0 extends ReplacementSpan {
    public final int f27209a;
    public int f27210b;
    public final Object f27211c;

    public iz0(int i10) {
        this.f27209a = 0;
        Paint paint = new Paint(1);
        this.f27211c = paint;
        this.f27210b = i10;
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20900be, false)));
    }

    public void a(int i10) {
        org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.f27211c;
        if (mn0Var != null) {
            mn0Var.f39579a = i10 / 2.0f;
            mn0Var.d();
            this.f27210b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f27209a) {
            case 0:
                float L = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.33f);
                RectF rectF = org.telegram.messenger.i0.P;
                float L2 = org.telegram.messenger.i0.L(6.66f) / 2.0f;
                rectF.set(f7, L - L2, this.f27210b + f7, L + L2);
                Paint paint2 = (Paint) this.f27211c;
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20900be, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
            default:
                org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.f27211c;
                if (mn0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float L3 = f7 + org.telegram.messenger.i0.L(5.0f);
                    int i16 = this.f27210b;
                    mn0Var.setBounds((int) (org.telegram.messenger.i0.L(3.0f) + f7), i15 - this.f27210b, (int) (L3 + i16), i15 + i16);
                    mn0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f27209a) {
            case 0:
                return this.f27210b;
            default:
                return org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(3.0f) + this.f27210b;
        }
    }

    public iz0(boolean z10, int i10, int i11) {
        this.f27209a = 1;
        this.f27210b = org.telegram.messenger.i0.L(21.0f);
        this.f27211c = z10 ? org.telegram.ui.mn0.c(i10, i11) : org.telegram.ui.mn0.a(i10, i11);
    }
}
