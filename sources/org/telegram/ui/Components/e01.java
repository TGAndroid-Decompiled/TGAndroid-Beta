package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class e01 extends ReplacementSpan {
    public final int f26410a;
    public int f26411b;
    public final Object f26412c;

    public e01(int i10) {
        this.f26410a = 0;
        Paint paint = new Paint(1);
        this.f26412c = paint;
        this.f26411b = i10;
        paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21847nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) this.f26412c;
        if (ip0Var != null) {
            ip0Var.f37754a = i10 / 2.0f;
            ip0Var.d();
            this.f26411b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f26410a) {
            case 0:
                float dp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f10, dp - dp2, this.f26411b + f10, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f26412c);
                return;
            default:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) this.f26412c;
                if (ip0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    float dp3 = f10 + AndroidUtilities.dp(5.0f);
                    int i16 = this.f26411b;
                    ip0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f10), i15 - this.f26411b, (int) (dp3 + i16), i15 + i16);
                    ip0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f26410a) {
            case 0:
                return this.f26411b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f26411b;
        }
    }

    public e01(boolean z4, int i10, int i11) {
        this.f26410a = 1;
        this.f26411b = AndroidUtilities.dp(21.0f);
        this.f26412c = z4 ? org.telegram.ui.ip0.c(i10, i11) : org.telegram.ui.ip0.a(i10, i11);
    }
}
