package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class v01 extends ReplacementSpan {
    public final int f31489a;
    public int f31490b;
    public final Object f31491c;

    public v01(int i10) {
        this.f31489a = 0;
        Paint paint = new Paint(1);
        this.f31491c = paint;
        this.f31490b = i10;
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21009nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.rp0 rp0Var = (org.telegram.ui.rp0) this.f31491c;
        if (rp0Var != null) {
            rp0Var.f40173a = i10 / 2.0f;
            rp0Var.d();
            this.f31490b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f31489a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f31490b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f31491c);
                return;
            default:
                org.telegram.ui.rp0 rp0Var = (org.telegram.ui.rp0) this.f31491c;
                if (rp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f31490b;
                    rp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f31490b, (int) (dp3 + i16), i15 + i16);
                    rp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f31489a) {
            case 0:
                return this.f31490b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f31490b;
        }
    }

    public v01(boolean z10, int i10, int i11) {
        this.f31489a = 1;
        this.f31490b = AndroidUtilities.dp(21.0f);
        this.f31491c = z10 ? org.telegram.ui.rp0.c(i10, i11) : org.telegram.ui.rp0.a(i10, i11);
    }
}
