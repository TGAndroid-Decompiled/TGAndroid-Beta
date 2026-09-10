package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ui0 {
    public final d6 f27679a;
    public final n6 f27680b;
    public final int f27681c;
    public boolean d;
    public final zi0 e;
    public final xc f27682f;
    public final Paint f27683g = new Paint(1);
    public boolean h;

    public ui0(View view) {
        this.f27679a = new d6(view, 350L, wr.h);
        this.e = new zi0(view);
        this.f27682f = new xc(view);
        n6 n6Var = new n6(false, false, false, false);
        this.f27680b = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.o(true, true, false);
        n6Var.setCallback(view);
        n6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        n6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = n6Var.f25424a;
        this.f27681c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        n6 n6Var = this.f27680b;
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
        float a2 = this.f27682f.a(0.02f) * this.f27679a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f27683g;
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
            zi0 zi0Var = this.e;
            zi0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = zi0Var.f29698b;
            paint2.setColor(i10);
            paint2.setAlpha(zi0Var.d);
            boolean z13 = !z10;
            if (zi0Var.e != z13) {
                zi0Var.e = z13;
                zi0Var.f29697a.invalidate();
            }
            zi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f27682f.c(z10);
    }
}
