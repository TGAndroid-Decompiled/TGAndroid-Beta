package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class m01 extends ReplacementSpan {
    public final int f25137a;
    public int f25138b;
    public final Object f25139c;

    public m01(int i10) {
        this.f25137a = 0;
        Paint paint = new Paint(1);
        this.f25139c = paint;
        this.f25138b = i10;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18115nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f25139c;
        if (vp0Var != null) {
            vp0Var.f37599a = i10 / 2.0f;
            vp0Var.d();
            this.f25138b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f25137a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f25138b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f25139c);
                return;
            default:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f25139c;
                if (vp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f25138b;
                    vp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f25138b, (int) (dp3 + i16), i15 + i16);
                    vp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f25137a) {
            case 0:
                return this.f25138b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f25138b;
        }
    }

    public m01(boolean z10, int i10, int i11) {
        this.f25137a = 1;
        this.f25138b = AndroidUtilities.dp(21.0f);
        this.f25139c = z10 ? org.telegram.ui.vp0.c(i10, i11) : org.telegram.ui.vp0.a(i10, i11);
    }
}
