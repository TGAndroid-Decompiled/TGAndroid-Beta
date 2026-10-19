package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class v01 extends ReplacementSpan {
    public final int f31107a;
    public int f31108b;
    public final Object f31109c;

    public v01(int i10) {
        this.f31107a = 0;
        Paint paint = new Paint(1);
        this.f31109c = paint;
        this.f31108b = i10;
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21177nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.dp0 dp0Var = (org.telegram.ui.dp0) this.f31109c;
        if (dp0Var != null) {
            dp0Var.f36425a = i10 / 2.0f;
            dp0Var.d();
            this.f31108b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f31107a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f31108b + f7, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f31109c);
                return;
            default:
                org.telegram.ui.dp0 dp0Var = (org.telegram.ui.dp0) this.f31109c;
                if (dp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f31108b;
                    dp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f31108b, (int) (dp3 + i16), i15 + i16);
                    dp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f31107a) {
            case 0:
                return this.f31108b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f31108b;
        }
    }

    public v01(boolean z10, int i10, int i11) {
        this.f31107a = 1;
        this.f31108b = AndroidUtilities.dp(21.0f);
        this.f31109c = z10 ? org.telegram.ui.dp0.c(i10, i11) : org.telegram.ui.dp0.a(i10, i11);
    }
}
