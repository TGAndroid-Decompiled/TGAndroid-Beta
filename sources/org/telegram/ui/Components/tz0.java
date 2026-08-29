package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class tz0 extends ReplacementSpan {
    public final int f33063a;
    public int f33064b;
    public final Object f33065c;

    public tz0(int i10) {
        this.f33063a = 0;
        Paint paint = new Paint(1);
        this.f33065c = paint;
        this.f33064b = i10;
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23248nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) this.f33065c;
        if (uo0Var != null) {
            uo0Var.f43297a = i10 / 2.0f;
            uo0Var.d();
            this.f33064b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        switch (this.f33063a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f9, dp - dp2, this.f33064b + f9, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f33065c);
                return;
            default:
                org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) this.f33065c;
                if (uo0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f9 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f33064b;
                    uo0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f9), i15 - this.f33064b, (int) (dp3 + i16), i15 + i16);
                    uo0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f33063a) {
            case 0:
                return this.f33064b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f33064b;
        }
    }

    public tz0(boolean z10, int i10, int i11) {
        this.f33063a = 1;
        this.f33064b = AndroidUtilities.dp(21.0f);
        this.f33065c = z10 ? org.telegram.ui.uo0.c(i10, i11) : org.telegram.ui.uo0.a(i10, i11);
    }
}
