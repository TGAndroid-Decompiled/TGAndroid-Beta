package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class z01 extends ReplacementSpan {
    public final int f33101a;
    public int f33102b;
    public final Object f33103c;

    public z01(int i10) {
        this.f33101a = 0;
        Paint paint = new Paint(1);
        this.f33103c = paint;
        this.f33102b = i10;
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21373nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) this.f33103c;
        if (gp0Var != null) {
            gp0Var.f37645a = i10 / 2.0f;
            gp0Var.d();
            this.f33102b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f33101a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f33102b + f7, dp + dp2);
                Paint paint2 = (Paint) this.f33103c;
                paint2.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21373nd, false)));
                canvas.drawRoundRect(rectF, dp2, dp2, paint2);
                return;
            default:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) this.f33103c;
                if (gp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f33102b;
                    gp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f33102b, (int) (dp3 + i16), i15 + i16);
                    gp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f33101a) {
            case 0:
                return this.f33102b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f33102b;
        }
    }

    public z01(boolean z10, int i10, int i11) {
        this.f33101a = 1;
        this.f33102b = AndroidUtilities.dp(21.0f);
        this.f33103c = z10 ? org.telegram.ui.gp0.c(i10, i11) : org.telegram.ui.gp0.a(i10, i11);
    }
}
