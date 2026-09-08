package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class zz0 extends ReplacementSpan {
    public final int f33361a;
    public int f33362b;
    public final Object f33363c;

    public zz0(int i10) {
        this.f33361a = 0;
        Paint paint = new Paint(1);
        this.f33363c = paint;
        this.f33362b = i10;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20878nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f33363c;
        if (wp0Var != null) {
            wp0Var.f42476a = i10 / 2.0f;
            wp0Var.d();
            this.f33362b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f33361a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f33362b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f33363c);
                return;
            default:
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.f33363c;
                if (wp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f33362b;
                    wp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f33362b, (int) (dp3 + i16), i15 + i16);
                    wp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f33361a) {
            case 0:
                return this.f33362b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f33362b;
        }
    }

    public zz0(boolean z10, int i10, int i11) {
        this.f33361a = 1;
        this.f33362b = AndroidUtilities.dp(21.0f);
        this.f33363c = z10 ? org.telegram.ui.wp0.c(i10, i11) : org.telegram.ui.wp0.a(i10, i11);
    }
}
