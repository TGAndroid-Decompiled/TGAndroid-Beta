package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ri0 {
    public final z5 f28471a;
    public final j6 f28472b;
    public final int f28473c;
    public boolean d;
    public final wi0 e;
    public final rc f28474f;
    public final Paint f28475g = new Paint(1);
    public boolean h;

    public ri0(View view) {
        this.f28471a = new z5(view, 350L, nr.h);
        this.e = new wi0(view);
        this.f28474f = new rc(view);
        j6 j6Var = new j6(false, false, false, false);
        this.f28472b = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.o(true, true, false);
        j6Var.setCallback(view);
        j6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        j6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = j6Var.f25883a;
        this.f28473c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11 = this.d;
        j6 j6Var = this.f28472b;
        if (z4 != z11) {
            this.d = z4;
            if (z4) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            j6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = j6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - ((int) (d + AndroidUtilities.dp(23.66f))), f11 - dp, f10, f11);
        float a2 = this.f28474f.a(0.02f) * this.f28471a.e(z10);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f28475g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            j6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            j6Var.r(i10);
            j6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f13 = dp2 / 2.0f;
            wi0 wi0Var = this.e;
            wi0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = wi0Var.f30375b;
            paint2.setColor(i10);
            paint2.setAlpha(wi0Var.d);
            boolean z12 = !z4;
            if (wi0Var.e != z12) {
                wi0Var.e = z12;
                wi0Var.f30374a.invalidate();
            }
            wi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z4) {
        this.h = z4;
        this.f28474f.c(z4);
    }
}
