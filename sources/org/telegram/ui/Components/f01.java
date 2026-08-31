package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class f01 extends ReplacementSpan {
    public final int f26714a;
    public int f26715b;
    public final Object f26716c;

    public f01(int i10) {
        this.f26714a = 0;
        Paint paint = new Paint(1);
        this.f26716c = paint;
        this.f26715b = i10;
        paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21845nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.ep0 ep0Var = (org.telegram.ui.ep0) this.f26716c;
        if (ep0Var != null) {
            ep0Var.f36657a = i10 / 2.0f;
            ep0Var.d();
            this.f26715b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f26714a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f10, dp - dp2, this.f26715b + f10, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f26716c);
                return;
            default:
                org.telegram.ui.ep0 ep0Var = (org.telegram.ui.ep0) this.f26716c;
                if (ep0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f10 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f26715b;
                    ep0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f10), i15 - this.f26715b, (int) (dp3 + i16), i15 + i16);
                    ep0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f26714a) {
            case 0:
                return this.f26715b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f26715b;
        }
    }

    public f01(boolean z4, int i10, int i11) {
        this.f26714a = 1;
        this.f26715b = AndroidUtilities.dp(21.0f);
        this.f26716c = z4 ? org.telegram.ui.ep0.c(i10, i11) : org.telegram.ui.ep0.a(i10, i11);
    }
}
