package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class fc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.p6 f26123a;
    public final Paint f26124b = new Paint(1);
    public final rz0 f26125c;
    public final Runnable d;
    public dc e;
    public Integer f26126f;

    public fc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f26123a = p6Var;
        this.d = runnable;
        this.f26125c = new rz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        fc fcVar = new fc(charSequence, runnable, p6Var);
        spannableString.setSpan(fcVar, 0, spannableString.length(), 33);
        fcVar.f26126f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f26125c.f30126c + org.telegram.messenger.i0.L(14.0f));
    }

    public final void c(ec ecVar, boolean z10) {
        if (this.e == null) {
            this.e = new dc(ecVar);
        }
        this.e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float a2;
        int w02;
        float N = org.telegram.messenger.i0.N(17.0f);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = N / 2.0f;
        rectF.set(f7, f10 - f11, a() + f7, f10 + f11);
        dc dcVar = this.e;
        if (dcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = dcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f26126f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f26123a);
        }
        int i15 = w02;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, i15);
        Paint paint2 = this.f26124b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f26125c.c(f7 + org.telegram.messenger.i0.L(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
