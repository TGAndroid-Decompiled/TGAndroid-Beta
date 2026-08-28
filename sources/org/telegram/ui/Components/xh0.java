package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh0 {
    public final y5 f34675a;
    public final i6 f34676b;
    public final int f34677c;
    public boolean d;
    public final ci0 f34678e;
    public final pc f34679f;
    public final Paint f34680g = new Paint(1);
    public boolean h;

    public xh0(View view) {
        this.f34675a = new y5(view, 350L, gr.h);
        this.f34678e = new ci0(view);
        this.f34679f = new pc(view);
        i6 i6Var = new i6(false, false, false, false);
        this.f34676b = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.o(true, true, false);
        i6Var.setCallback(view);
        i6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        i6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = i6Var.f29332a;
        this.f34677c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i9, boolean z10, boolean z11) {
        int i10;
        boolean z12 = this.d;
        i6 i6Var = this.f34676b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i10 = R.string.QuoteExpand;
            } else {
                i10 = R.string.QuoteCollapse;
            }
            i6Var.q(LocaleController.getString(i10), true, true);
        }
        float d = i6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - ((int) (d + AndroidUtilities.dp(23.66f))), f11 - dp, f10, f11);
        float a2 = this.f34679f.a(0.02f) * this.f34675a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i9, 30);
            Paint paint = this.f34680g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            i6Var.r(i9);
            i6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f13 = dp2 / 2.0f;
            ci0 ci0Var = this.f34678e;
            ci0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = ci0Var.f27498b;
            paint2.setColor(i9);
            paint2.setAlpha(ci0Var.d);
            boolean z13 = !z10;
            if (ci0Var.f27500e != z13) {
                ci0Var.f27500e = z13;
                ci0Var.f27497a.invalidate();
            }
            ci0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f34679f.c(z10);
    }
}
