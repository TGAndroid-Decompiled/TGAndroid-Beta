package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class kc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 f35251a;
    public final Paint f35252b = new Paint(1);
    public final ly0 f35253c;
    public final Runnable d;
    public ic f35254e;
    public Integer f35255f;

    public kc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35251a = f6Var;
        this.d = runnable;
        this.f35253c = new ly0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        kc kcVar = new kc(charSequence, runnable, f6Var);
        spannableString.setSpan(kcVar, 0, spannableString.length(), 33);
        kcVar.f35255f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f35253c.f35777c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(jc jcVar, boolean z9) {
        if (this.f35254e == null) {
            this.f35254e = new ic(jcVar);
        }
        this.f35254e.c(z9);
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
        ic icVar = this.f35254e;
        if (icVar == null) {
            a10 = 1.0f;
        } else {
            a10 = icVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f35255f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f35251a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, i14);
        Paint paint2 = this.f35252b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f35253c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
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
