package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class zh0 {

    public final y5 f35240a;

    public final i6 f35241b;

    public final int f35242c;
    public boolean d;

    public final ei0 f35243e;

    public final nc f35244f;

    public final Paint f35245g = new Paint(1);
    public boolean h;

    public zh0(View view) {
        this.f35240a = new y5(view, 350L, er.h);
        this.f35243e = new ei0(view);
        this.f35244f = new nc(view);
        i6 i6Var = new i6(false, false, false, false);
        this.f35241b = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.o(true, true, false);
        i6Var.setCallback(view);
        i6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        i6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = i6Var.f29238a;
        this.f35242c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i10, boolean z10, boolean z11) {
        boolean z12 = this.d;
        i6 i6Var = this.f35241b;
        if (z10 != z12) {
            this.d = z10;
            i6Var.q(LocaleController.getString(z10 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int iD = (int) (i6Var.d() + AndroidUtilities.dp(23.66f));
        float fDp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - iD, f11 - fDp, f10, f11);
        float fA = this.f35244f.a(0.02f) * this.f35240a.e(z11);
        if (fA > 0.0f) {
            int iK = i0.b.k(i10, 30);
            Paint paint = this.f35245g;
            paint.setColor(iK);
            canvas.save();
            canvas.scale(fA, fA, f10, f11);
            float f12 = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            i6Var.r(i10);
            i6Var.draw(canvas);
            float fDp2 = AndroidUtilities.dp(14.0f);
            int iDp = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - fDp2);
            float f13 = fDp2 / 2.0f;
            int iCenterY = (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f));
            int iDp2 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int iCenterY2 = (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f));
            ei0 ei0Var = this.f35243e;
            ei0Var.setBounds(iDp, iCenterY, iDp2, iCenterY2);
            Paint paint2 = ei0Var.f28067b;
            paint2.setColor(i10);
            paint2.setAlpha(ei0Var.d);
            boolean z13 = !z10;
            if (ei0Var.f28069e != z13) {
                ei0Var.f28069e = z13;
                ei0Var.f28066a.invalidate();
            }
            ei0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f35244f.c(z10);
    }
}
