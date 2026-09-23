package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class zz0 extends ReplacementSpan {
    public final int f30702a;
    public int f30703b;
    public final Object f30704c;

    public zz0(int i10) {
        this.f30702a = 0;
        Paint paint = new Paint(1);
        this.f30704c = paint;
        this.f30703b = i10;
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.3f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18978nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.pp0 pp0Var = (org.telegram.ui.pp0) this.f30704c;
        if (pp0Var != null) {
            pp0Var.f36156a = i10 / 2.0f;
            pp0Var.d();
            this.f30703b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f30702a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f30703b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f30704c);
                return;
            default:
                org.telegram.ui.pp0 pp0Var = (org.telegram.ui.pp0) this.f30704c;
                if (pp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f30703b;
                    pp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f30703b, (int) (dp3 + i16), i15 + i16);
                    pp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30702a) {
            case 0:
                return this.f30703b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f30703b;
        }
    }

    public zz0(boolean z10, int i10, int i11) {
        this.f30702a = 1;
        this.f30703b = AndroidUtilities.dp(21.0f);
        this.f30704c = z10 ? org.telegram.ui.pp0.c(i10, i11) : org.telegram.ui.pp0.a(i10, i11);
    }
}
