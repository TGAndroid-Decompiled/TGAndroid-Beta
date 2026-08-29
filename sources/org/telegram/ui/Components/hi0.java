package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hi0 {
    public final d6 f29183a;
    public final n6 f29184b;
    public final int f29185c;
    public boolean d;
    public final ni0 f29186e;
    public final uc f29187f;
    public final Paint f29188g = new Paint(1);
    public boolean h;

    public hi0(View view) {
        this.f29183a = new d6(view, 350L, jr.h);
        this.f29186e = new ni0(view);
        this.f29187f = new uc(view);
        n6 n6Var = new n6(false, false, false, false);
        this.f29184b = n6Var;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.o(true, true, false);
        n6Var.setCallback(view);
        n6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        n6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = n6Var.f30861a;
        this.f29185c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f9, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        n6 n6Var = this.f29184b;
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
        rectF.set(f9 - ((int) (d + AndroidUtilities.dp(23.66f))), f10 - dp, f9, f10);
        float a2 = this.f29187f.a(0.02f) * this.f29183a.e(z11);
        if (a2 > 0.0f) {
            int k9 = i0.a.k(i10, 30);
            Paint paint = this.f29188g;
            paint.setColor(k9);
            canvas.save();
            canvas.scale(a2, a2, f9, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            n6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            n6Var.r(i10);
            n6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            ni0 ni0Var = this.f29186e;
            ni0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = ni0Var.f31073b;
            paint2.setColor(i10);
            paint2.setAlpha(ni0Var.d);
            boolean z13 = !z10;
            if (ni0Var.f31075e != z13) {
                ni0Var.f31075e = z13;
                ni0Var.f31072a.invalidate();
            }
            ni0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f29187f.c(z10);
    }
}
