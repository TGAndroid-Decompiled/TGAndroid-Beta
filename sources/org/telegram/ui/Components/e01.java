package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class e01 extends ReplacementSpan {
    public final int f24423a;
    public int f24424b;
    public final Object f24425c;

    public e01(int i10) {
        this.f24423a = 0;
        Paint paint = new Paint(1);
        this.f24425c = paint;
        this.f24424b = i10;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20091nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) this.f24425c;
        if (cp0Var != null) {
            cp0Var.f33402a = i10 / 2.0f;
            cp0Var.d();
            this.f24424b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f24423a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f10, dp - dp2, this.f24424b + f10, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f24425c);
                return;
            default:
                org.telegram.ui.cp0 cp0Var = (org.telegram.ui.cp0) this.f24425c;
                if (cp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f10 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f24424b;
                    cp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f10), i15 - this.f24424b, (int) (dp3 + i16), i15 + i16);
                    cp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f24423a) {
            case 0:
                return this.f24424b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f24424b;
        }
    }

    public e01(boolean z4, int i10, int i11) {
        this.f24423a = 1;
        this.f24424b = AndroidUtilities.dp(21.0f);
        this.f24425c = z4 ? org.telegram.ui.cp0.c(i10, i11) : org.telegram.ui.cp0.a(i10, i11);
    }
}
