package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class oc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.h6 f38161a;
    public final Paint f38162b = new Paint(1);
    public final xy0 f38163c;
    public final Runnable d;
    public mc f38164e;
    public Integer f38165f;

    public oc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f38161a = h6Var;
        this.d = runnable;
        this.f38163c = new xy0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.h6 h6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        oc ocVar = new oc(charSequence, runnable, h6Var);
        spannableString.setSpan(ocVar, 0, spannableString.length(), 33);
        ocVar.f38165f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f38163c.f42246c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(nc ncVar, boolean z10) {
        if (this.f38164e == null) {
            this.f38164e = new mc(ncVar);
        }
        this.f38164e.c(z10);
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
        mc mcVar = this.f38164e;
        if (mcVar == null) {
            a10 = 1.0f;
        } else {
            a10 = mcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f38165f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.f38161a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, i14);
        Paint paint2 = this.f38162b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f38163c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
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
