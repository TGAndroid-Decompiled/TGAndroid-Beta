package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class i11 extends ReplacementSpan {
    public final int f26998a;
    public int f26999b;
    public final Object f27000c;

    public i11(int i10) {
        this.f26998a = 0;
        Paint paint = new Paint(1);
        this.f27000c = paint;
        this.f26999b = i10;
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20750nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.xp0 xp0Var = (org.telegram.ui.xp0) this.f27000c;
        if (xp0Var != null) {
            xp0Var.f44144a = i10 / 2.0f;
            xp0Var.d();
            this.f26999b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f26998a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f26999b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f27000c);
                return;
            default:
                org.telegram.ui.xp0 xp0Var = (org.telegram.ui.xp0) this.f27000c;
                if (xp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f26999b;
                    xp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f26999b, (int) (dp3 + i16), i15 + i16);
                    xp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f26998a) {
            case 0:
                return this.f26999b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f26999b;
        }
    }

    public i11(boolean z10, int i10, int i11) {
        this.f26998a = 1;
        this.f26999b = AndroidUtilities.dp(21.0f);
        this.f27000c = z10 ? org.telegram.ui.xp0.c(i10, i11) : org.telegram.ui.xp0.a(i10, i11);
    }
}
