package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
public final class hz0 extends ReplacementSpan {
    public final int f26848a;
    public int f26849b;
    public final Object f26850c;

    public hz0(int i10) {
        this.f26848a = 0;
        Paint paint = new Paint(1);
        this.f26850c = paint;
        this.f26849b = i10;
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20899be, false)));
    }

    public void a(int i10) {
        org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.f26850c;
        if (on0Var != null) {
            on0Var.f40308a = i10 / 2.0f;
            on0Var.d();
            this.f26849b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f26848a) {
            case 0:
                float L = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.33f);
                RectF rectF = org.telegram.messenger.i0.P;
                float L2 = org.telegram.messenger.i0.L(6.66f) / 2.0f;
                rectF.set(f7, L - L2, this.f26849b + f7, L + L2);
                Paint paint2 = (Paint) this.f26850c;
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20899be, false)));
                canvas.drawRoundRect(rectF, L2, L2, paint2);
                return;
            default:
                org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) this.f26850c;
                if (on0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float L3 = f7 + org.telegram.messenger.i0.L(5.0f);
                    int i16 = this.f26849b;
                    on0Var.setBounds((int) (org.telegram.messenger.i0.L(3.0f) + f7), i15 - this.f26849b, (int) (L3 + i16), i15 + i16);
                    on0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f26848a) {
            case 0:
                return this.f26849b;
            default:
                return org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(3.0f) + this.f26849b;
        }
    }

    public hz0(boolean z10, int i10, int i11) {
        this.f26848a = 1;
        this.f26849b = org.telegram.messenger.i0.L(21.0f);
        this.f26850c = z10 ? org.telegram.ui.on0.c(i10, i11) : org.telegram.ui.on0.a(i10, i11);
    }
}
