package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class jc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.h6 f34896a;
    public final Paint f34897b = new Paint(1);
    public final my0 f34898c;
    public final Runnable d;
    public hc f34899e;
    public Integer f34900f;

    public jc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f34896a = h6Var;
        this.d = runnable;
        this.f34898c = new my0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        jc jcVar = new jc(charSequence, runnable, h6Var);
        spannableString.setSpan(jcVar, 0, spannableString.length(), 33);
        jcVar.f34900f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f34898c.f36133c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(ic icVar, boolean z9) {
        if (this.f34899e == null) {
            this.f34899e = new hc(icVar);
        }
        this.f34899e.c(z9);
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
        hc hcVar = this.f34899e;
        if (hcVar == null) {
            a10 = 1.0f;
        } else {
            a10 = hcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f34900f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.f34896a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, i14);
        Paint paint2 = this.f34897b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f34898c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
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
