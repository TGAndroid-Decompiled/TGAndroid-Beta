package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class c11 extends ReplacementSpan {
    public final int f25205a;
    public int f25206b;
    public final Object f25207c;

    public c11(int i10) {
        this.f25205a = 0;
        Paint paint = new Paint(1);
        this.f25207c = paint;
        this.f25206b = i10;
        paint.setColor(org.telegram.ui.ActionBar.i6.m1(0.3f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20987nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f25207c;
        if (vp0Var != null) {
            vp0Var.f42959a = i10 / 2.0f;
            vp0Var.d();
            this.f25206b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f25205a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f25206b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f25207c);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f25207c;
                if (vp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f25206b;
                    vp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f25206b, (int) (dp3 + i16), i15 + i16);
                    vp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f25205a) {
            case 0:
                return this.f25206b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f25206b;
        }
    }

    public c11(boolean z10, int i10, int i11) {
        this.f25205a = 1;
        this.f25206b = AndroidUtilities.dp(21.0f);
        this.f25207c = z10 ? org.telegram.ui.vp0.c(i10, i11) : org.telegram.ui.vp0.a(i10, i11);
    }
}
