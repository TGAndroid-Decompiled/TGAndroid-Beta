package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xi0 {
    public final d6 f30327a;
    public final n6 f30328b;
    public final int f30329c;
    public boolean d;
    public final cj0 e;
    public final yc f30330f;
    public final Paint f30331g = new Paint(1);
    public boolean h;

    public xi0(View view) {
        this.f30327a = new d6(view, 350L, qr.h);
        this.e = new cj0(view);
        this.f30330f = new yc(view);
        n6 n6Var = new n6(false, false, false, false);
        this.f30328b = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.o(true, true, false);
        n6Var.setCallback(view);
        n6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        n6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = n6Var.f26642a;
        this.f30329c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        n6 n6Var = this.f30328b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            n6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = n6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (d + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f30330f.a(0.02f) * this.f30327a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f30331g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            n6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            n6Var.r(i10);
            n6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            cj0 cj0Var = this.e;
            cj0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = cj0Var.f23377b;
            paint2.setColor(i10);
            paint2.setAlpha(cj0Var.d);
            boolean z13 = !z10;
            if (cj0Var.e != z13) {
                cj0Var.e = z13;
                cj0Var.f23376a.invalidate();
            }
            cj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f30330f.c(z10);
    }
}
