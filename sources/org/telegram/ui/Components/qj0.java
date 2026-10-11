package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qj0 {
    public final g6 f30253a;
    public final q6 f30254b;
    public final int f30255c;
    public boolean d;
    public final vj0 f30256e;
    public final bd f30257f;
    public final Paint f30258g = new Paint(1);
    public boolean h;

    public qj0(View view) {
        this.f30253a = new g6(view, 350L, is.h);
        this.f30256e = new vj0(view);
        this.f30257f = new bd(view);
        q6 q6Var = new q6(false, false, false);
        this.f30254b = q6Var;
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.r(true, true);
        q6Var.setCallback(view);
        q6Var.M = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        q6Var.t(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = q6Var.f30132a;
        this.f30255c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        q6 q6Var = this.f30254b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            q6Var.t(LocaleController.getString(i11), true, true);
        }
        float c10 = q6Var.c();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (c10 + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f30257f.a(0.02f) * this.f30253a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f30258g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            q6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            q6Var.u(i10);
            q6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            vj0 vj0Var = this.f30256e;
            vj0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = vj0Var.f31898b;
            paint2.setColor(i10);
            paint2.setAlpha(vj0Var.d);
            boolean z13 = !z10;
            if (vj0Var.f31900e != z13) {
                vj0Var.f31900e = z13;
                vj0Var.f31897a.invalidate();
            }
            vj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f30257f.c(z10);
    }
}
