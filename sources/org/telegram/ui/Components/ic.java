package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class ic extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.e6 f34663a;
    public final Paint f34664b = new Paint(1);
    public final ly0 f34665c;
    public final Runnable d;
    public gc f34666e;
    public Integer f34667f;

    public ic(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34663a = e6Var;
        this.d = runnable;
        this.f34665c = new ly0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ic icVar = new ic(charSequence, runnable, e6Var);
        spannableString.setSpan(icVar, 0, spannableString.length(), 33);
        icVar.f34667f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f34665c.f35918c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(hc hcVar, boolean z10) {
        if (this.f34666e == null) {
            this.f34666e = new gc(hcVar);
        }
        this.f34666e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float a10;
        int w02;
        float N = org.telegram.messenger.g0.N(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = N / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        gc gcVar = this.f34666e;
        if (gcVar == null) {
            a10 = 1.0f;
        } else {
            a10 = gcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f34667f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f34663a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, i14);
        Paint paint2 = this.f34664b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f34665c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
