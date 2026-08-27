package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class jz0 extends ReplacementSpan {

    public final int f29863a;

    public int f29864b;

    public final Object f29865c;

    public jz0(int i10) {
        this.f29863a = 0;
        Paint paint = new Paint(1);
        this.f29865c = paint;
        this.f29864b = i10;
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23240nd, false)));
    }

    public void a(int i10) {
        org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.f29865c;
        if (wo0Var != null) {
            wo0Var.f44156a = i10 / 2.0f;
            wo0Var.d();
            this.f29864b = i10;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f29863a) {
            case 0:
                float fDp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(1.33f);
                float fDp2 = AndroidUtilities.dp(6.66f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = fDp2 / 2.0f;
                rectF.set(f10, fDp - f11, this.f29864b + f10, fDp + f11);
                canvas.drawRoundRect(rectF, f11, f11, (Paint) this.f29865c);
                break;
            default:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.f29865c;
                if (wo0Var != null) {
                    int i15 = (i12 + i14) / 2;
                    int iDp = (int) (AndroidUtilities.dp(3.0f) + f10);
                    int i16 = i15 - this.f29864b;
                    float fDp3 = f10 + AndroidUtilities.dp(5.0f);
                    int i17 = this.f29864b;
                    wo0Var.setBounds(iDp, i16, (int) (fDp3 + i17), i15 + i17);
                    wo0Var.draw(canvas);
                }
                break;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f29863a) {
            case 0:
                return this.f29864b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f29864b;
        }
    }

    public jz0(boolean z10, int i10, int i11) {
        this.f29863a = 1;
        this.f29864b = AndroidUtilities.dp(21.0f);
        this.f29865c = z10 ? org.telegram.ui.wo0.c(i10, i11) : org.telegram.ui.wo0.a(i10, i11);
    }
}
