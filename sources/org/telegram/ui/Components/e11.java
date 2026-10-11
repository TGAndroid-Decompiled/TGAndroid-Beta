package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class e11 extends ReplacementSpan {
    public final int f25799a;
    public int f25800b;
    public final Object f25801c;

    public e11(int i10) {
        this.f25799a = 0;
        Paint paint = new Paint(1);
        this.f25801c = paint;
        this.f25800b = i10;
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20976nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f25801c;
        if (up0Var != null) {
            up0Var.f42746a = i10 / 2.0f;
            up0Var.d();
            this.f25800b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f25799a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f25800b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f25801c);
                return;
            default:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f25801c;
                if (up0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f25800b;
                    up0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f25800b, (int) (dp3 + i16), i15 + i16);
                    up0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f25799a) {
            case 0:
                return this.f25800b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f25800b;
        }
    }

    public e11(boolean z10, int i10, int i11) {
        this.f25799a = 1;
        this.f25800b = AndroidUtilities.dp(21.0f);
        this.f25801c = z10 ? org.telegram.ui.up0.c(i10, i11) : org.telegram.ui.up0.a(i10, i11);
    }
}
