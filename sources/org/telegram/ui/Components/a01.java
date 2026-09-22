package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class a01 extends ReplacementSpan {
    public final int f22247a;
    public int f22248b;
    public final Object f22249c;

    public a01(int i10) {
        this.f22247a = 0;
        Paint paint = new Paint(1);
        this.f22249c = paint;
        this.f22248b = i10;
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19023nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f22249c;
        if (vp0Var != null) {
            vp0Var.f38600a = i10 / 2.0f;
            vp0Var.d();
            this.f22248b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f22247a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f22248b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f22249c);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f22249c;
                if (vp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f22248b;
                    vp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f22248b, (int) (dp3 + i16), i15 + i16);
                    vp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f22247a) {
            case 0:
                return this.f22248b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f22248b;
        }
    }

    public a01(boolean z10, int i10, int i11) {
        this.f22247a = 1;
        this.f22248b = AndroidUtilities.dp(21.0f);
        this.f22249c = z10 ? org.telegram.ui.vp0.c(i10, i11) : org.telegram.ui.vp0.a(i10, i11);
    }
}
