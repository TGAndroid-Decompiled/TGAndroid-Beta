package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yi0 {
    public final e6 f30721a;
    public final o6 f30722b;
    public final int f30723c;
    public boolean d;
    public final dj0 e;
    public final zc f30724f;
    public final Paint f30725g = new Paint(1);
    public boolean h;

    public yi0(View view) {
        this.f30721a = new e6(view, 350L, tr.h);
        this.e = new dj0(view);
        this.f30724f = new zc(view);
        o6 o6Var = new o6(false, false, false, false);
        this.f30722b = o6Var;
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.o(true, true, false);
        o6Var.setCallback(view);
        o6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        o6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = o6Var.f26990a;
        this.f30723c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = this.d;
        o6 o6Var = this.f30722b;
        if (z10 != z12) {
            this.d = z10;
            if (z10) {
                i11 = R.string.QuoteExpand;
            } else {
                i11 = R.string.QuoteCollapse;
            }
            o6Var.q(LocaleController.getString(i11), true, true);
        }
        float d = o6Var.d();
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - ((int) (d + AndroidUtilities.dp(23.66f))), f10 - dp, f7, f10);
        float a2 = this.f30724f.a(0.02f) * this.f30721a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.f30725g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            o6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            o6Var.r(i10);
            o6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            float f12 = dp2 / 2.0f;
            dj0 dj0Var = this.e;
            dj0Var.setBounds((int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2), (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f)));
            Paint paint2 = dj0Var.f23659b;
            paint2.setColor(i10);
            paint2.setAlpha(dj0Var.d);
            boolean z13 = !z10;
            if (dj0Var.e != z13) {
                dj0Var.e = z13;
                dj0Var.f23658a.invalidate();
            }
            dj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f30724f.c(z10);
    }
}
