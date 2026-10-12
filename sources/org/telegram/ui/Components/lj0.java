package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lj0 {
    public final g6 f27052a;
    public final r6 f27053b;
    public final int f27054c;
    public boolean d;
    public final qj0 e;
    public final ad f27055f;
    public final Paint f27056g = new Paint(1);
    public boolean h;

    public lj0(View view) {
        this.f27052a = new g6(view, 350L, es.h);
        this.e = new qj0(view);
        this.f27055f = new ad(view);
        r6 r6Var = new r6(false, false, false);
        this.f27053b = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.r(true, true);
        r6Var.setCallback(view);
        r6Var.M = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        r6Var.t(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = r6Var.f28746a;
        this.f27054c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        r6 r6Var = this.f27053b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            r6Var.t(LocaleController.getString(i11), true, true);
        }
        float c10 = r6Var.c();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (c10 + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f27055f.a(0.02f) * this.f27052a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f27056g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            r6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            r6Var.u(i10);
            r6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            qj0 qj0Var = this.e;
            qj0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = qj0Var.f28621b;
            paint2.setColor(i10);
            paint2.setAlpha(qj0Var.d);
            boolean z13 = !z10;
            if (qj0Var.e != z13) {
                qj0Var.e = z13;
                qj0Var.f28620a.invalidate();
            }
            qj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f27055f.c(z10);
    }
}
