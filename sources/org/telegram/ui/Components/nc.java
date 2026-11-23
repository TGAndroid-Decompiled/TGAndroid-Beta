package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class nc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.i6 f37754a;
    public final Paint f37755b = new Paint(1);
    public final wy0 f37756c;
    public final Runnable d;
    public lc f37757e;
    public Integer f37758f;

    public nc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f37754a = i6Var;
        this.d = runnable;
        this.f37756c = new wy0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.i6 i6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        nc ncVar = new nc(charSequence, runnable, i6Var);
        spannableString.setSpan(ncVar, 0, spannableString.length(), 33);
        ncVar.f37758f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f37756c.f41763c + org.telegram.messenger.g0.L(14.0f));
    }

    public final void c(mc mcVar, boolean z10) {
        if (this.f37757e == null) {
            this.f37757e = new lc(mcVar);
        }
        this.f37757e.c(z10);
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
        lc lcVar = this.f37757e;
        if (lcVar == null) {
            a10 = 1.0f;
        } else {
            a10 = lcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        Integer num = this.f37758f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f37754a);
        }
        int i14 = w02;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, i14);
        Paint paint2 = this.f37755b;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f37756c.c(f10 + org.telegram.messenger.g0.L(7.0f), f11, 1.0f, i14, canvas);
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
