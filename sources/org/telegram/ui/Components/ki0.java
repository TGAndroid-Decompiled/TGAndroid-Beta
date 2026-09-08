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
    public final e6 f27857a;
    public final p6 f27858b;
    public final int f27859c;
    public boolean d;
    public final pi0 f27860e;
    public final zc f27861f;
    public final Paint f27862g = new Paint(1);
    public boolean h;

    public ki0(View view) {
        this.f27857a = new e6(view, 350L, pr.h);
        this.f27860e = new pi0(view);
        this.f27861f = new zc(view);
        p6 p6Var = new p6(false, false, false, false);
        this.f27858b = p6Var;
        p6Var.t(AndroidUtilities.dp(11.0f));
        p6Var.o(true, true, false);
        p6Var.setCallback(view);
        p6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        p6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = p6Var.f29311a;
        this.f27859c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        p6 p6Var = this.f27858b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            p6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = p6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (d + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f27861f.a(0.02f) * this.f27857a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f27862g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            p6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            p6Var.r(i10);
            p6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            pi0 pi0Var = this.f27860e;
            pi0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = pi0Var.f29420b;
            paint2.setColor(i10);
            paint2.setAlpha(pi0Var.d);
            boolean z13 = !z10;
            if (pi0Var.f29422e != z13) {
                pi0Var.f29422e = z13;
                pi0Var.f29419a.invalidate();
            }
            pi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f27861f.c(z10);
    }
}
