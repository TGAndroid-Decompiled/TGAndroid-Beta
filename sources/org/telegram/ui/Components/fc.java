package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class fc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.e6 f34554a;
    public final Paint f34555b = new Paint(1);
    public final oy0 f34556c;
    public final Runnable d;
    public dc f34557e;
    public Integer f34558f;

    public fc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34554a = e6Var;
        this.d = runnable;
        this.f34556c = new oy0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        fc fcVar = new fc(charSequence, runnable, e6Var);
        spannableString.setSpan(fcVar, 0, spannableString.length(), 33);
        fcVar.f34558f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f34556c.f38105c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(ec ecVar, boolean z10) {
        if (this.f34557e == null) {
            this.f34557e = new dc(ecVar);
        }
        this.f34557e.c(z10);
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
        dc dcVar = this.f34557e;
        if (dcVar == null) {
            a10 = 1.0f;
        } else {
            a10 = dcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f34558f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f34554a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.15f, i14);
        Paint paint2 = this.f34555b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f34556c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
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
