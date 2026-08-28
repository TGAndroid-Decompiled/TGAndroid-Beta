package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class hz0 extends ReplacementSpan {
    public final int f29245a;
    public int f29246b;
    public final Object f29247c;

    public hz0(int i9) {
        this.f29245a = 0;
        Paint paint = new Paint(1);
        this.f29247c = paint;
        this.f29246b = i9;
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nd, false)));
    }

    public void a(int i9) {
        org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.f29247c;
        if (vo0Var != null) {
            vo0Var.f43551a = i9 / 2.0f;
            vo0Var.d();
            this.f29246b = i9;
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f29245a) {
            case 0:
                float dp = ((i11 + i13) / 2.0f) + AndroidUtilities.dp(1.33f);
                RectF rectF = AndroidUtilities.rectTmp;
                float dp2 = AndroidUtilities.dp(6.66f) / 2.0f;
                rectF.set(f10, dp - dp2, this.f29246b + f10, dp + dp2);
                canvas.drawRoundRect(rectF, dp2, dp2, (Paint) this.f29247c);
                return;
            default:
                org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.f29247c;
                if (vo0Var != null) {
                    int i14 = (i11 + i13) / 2;
                    float dp3 = f10 + AndroidUtilities.dp(5.0f);
                    int i15 = this.f29246b;
                    vo0Var.setBounds((int) (AndroidUtilities.dp(3.0f) + f10), i14 - this.f29246b, (int) (dp3 + i15), i14 + i15);
                    vo0Var.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f29245a) {
            case 0:
                return this.f29246b;
            default:
                return AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(3.0f) + this.f29246b;
        }
    }

    public hz0(boolean z10, int i9, int i10) {
        this.f29245a = 1;
        this.f29246b = AndroidUtilities.dp(21.0f);
        this.f29247c = z10 ? org.telegram.ui.vo0.c(i9, i10) : org.telegram.ui.vo0.a(i9, i10);
    }
}
