package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ki0 {
    public final c6 f25608a;
    public final m6 f25609b;
    public final int f25610c;
    public boolean d;
    public final pi0 e;
    public final wc f25611f;
    public final Paint f25612g = new Paint(1);
    public boolean h;

    public ki0(View view) {
        this.f25608a = new c6(view, 350L, qr.h);
        this.e = new pi0(view);
        this.f25611f = new wc(view);
        m6 m6Var = new m6(false, false, false, false);
        this.f25609b = m6Var;
        m6Var.t(AndroidUtilities.dp(11.0f));
        m6Var.o(true, true, false);
        m6Var.setCallback(view);
        m6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        m6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = m6Var.f26084a;
        this.f25610c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        m6 m6Var = this.f25609b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            m6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = m6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (d + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f25611f.a(0.02f) * this.f25608a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f25612g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            m6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            m6Var.r(i10);
            m6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            pi0 pi0Var = this.e;
            pi0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = pi0Var.f27053b;
            paint2.setColor(i10);
            paint2.setAlpha(pi0Var.d);
            boolean z13 = !z10;
            if (pi0Var.e != z13) {
                pi0Var.e = z13;
                pi0Var.f27052a.invalidate();
            }
            pi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f25611f.c(z10);
    }
}
