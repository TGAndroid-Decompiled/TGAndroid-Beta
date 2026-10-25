package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class h11 extends ReplacementSpan {
    public final int f28762a;
    public int f28763b;
    public final Object f28764c;

    public h11(int i10) {
        this.f28762a = 0;
        Paint paint = new Paint(1);
        this.f28764c = paint;
        this.f28763b = i10;
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23545nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.mp0 mp0Var = (org.telegram.ui.mp0) this.f28764c;
        if (mp0Var != null) {
            mp0Var.f41633a = i10 / 2.0f;
            mp0Var.d();
            this.f28763b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f28762a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f28763b + f7, dp + dp2);
                Paint paint2 = (Paint) this.f28764c;
                paint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23545nd, false)));
                canvas.drawRoundRect(rectF, dp2, dp2, paint2);
                return;
            default:
                org.telegram.ui.mp0 mp0Var = (org.telegram.ui.mp0) this.f28764c;
                if (mp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f28763b;
                    mp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f28763b, (int) (dp3 + i16), i15 + i16);
                    mp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f28762a) {
            case 0:
                return this.f28763b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f28763b;
        }
    }

    public h11(boolean z10, int i10, int i11) {
        this.f28762a = 1;
        this.f28763b = AndroidUtilities.dp(21.0f);
        this.f28764c = z10 ? org.telegram.ui.mp0.c(i10, i11) : org.telegram.ui.mp0.a(i10, i11);
    }
}
