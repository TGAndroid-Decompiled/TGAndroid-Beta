package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class kc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.g6 f35305a;
    public final Paint f35306b = new Paint(1);
    public final ny0 f35307c;
    public final Runnable d;
    public ic f35308e;
    public Integer f35309f;

    public kc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f35305a = g6Var;
        this.d = runnable;
        this.f35307c = new ny0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        kc kcVar = new kc(charSequence, runnable, g6Var);
        spannableString.setSpan(kcVar, 0, spannableString.length(), 33);
        kcVar.f35309f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f35307c.f36541c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(jc jcVar, boolean z9) {
        if (this.f35308e == null) {
            this.f35308e = new ic(jcVar);
        }
        this.f35308e.c(z9);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float a10;
        int w02;
        float N = org.telegram.messenger.g0.N(17.0f);
        float f11 = (i11 + i13) / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = N / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        ic icVar = this.f35308e;
        if (icVar == null) {
            a10 = 1.0f;
        } else {
            a10 = icVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f35309f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.f35305a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.15f, i14);
        Paint paint2 = this.f35306b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f35307c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
