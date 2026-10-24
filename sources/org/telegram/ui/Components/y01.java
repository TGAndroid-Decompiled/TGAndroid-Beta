package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class y01 extends ReplacementSpan {
    public final int f32774a;
    public int f32775b;
    public final Object f32776c;

    public y01(int i10) {
        this.f32774a = 0;
        Paint paint = new Paint(1);
        this.f32776c = paint;
        this.f32775b = i10;
        paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21374nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.fp0 fp0Var = (org.telegram.ui.fp0) this.f32776c;
        if (fp0Var != null) {
            fp0Var.f37365a = i10 / 2.0f;
            fp0Var.d();
            this.f32775b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f32774a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f7, dp - dp2, this.f32775b + f7, dp + dp2);
                Paint paint2 = (Paint) this.f32776c;
                paint2.setColor(org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21374nd, false)));
                canvas.drawRoundRect(rectF, dp2, dp2, paint2);
                return;
            default:
                org.telegram.ui.fp0 fp0Var = (org.telegram.ui.fp0) this.f32776c;
                if (fp0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f7 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f32775b;
                    fp0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f7), i15 - this.f32775b, (int) (dp3 + i16), i15 + i16);
                    fp0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f32774a) {
            case 0:
                return this.f32775b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f32775b;
        }
    }

    public y01(boolean z10, int i10, int i11) {
        this.f32774a = 1;
        this.f32775b = AndroidUtilities.dp(21.0f);
        this.f32776c = z10 ? org.telegram.ui.fp0.c(i10, i11) : org.telegram.ui.fp0.a(i10, i11);
    }
}
