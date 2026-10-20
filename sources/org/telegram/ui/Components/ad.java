package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ad extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f24569a;
    public final Paint f24570b = new Paint(1);
    public final f11 f24571c;
    public final Runnable d;
    public yc e;
    public Integer f24572f;

    public ad(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24569a = d6Var;
        this.d = runnable;
        this.f24571c = new f11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ad adVar = new ad(charSequence, runnable, d6Var);
        spannableString.setSpan(adVar, 0, spannableString.length(), 33);
        adVar.f24572f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f24571c.f26021c + AndroidUtilities.dp(14.0f));
    }

    public final void c(zc zcVar, boolean z10) {
        if (this.e == null) {
            this.e = new yc(zcVar);
        }
        this.e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float a2;
        int w02;
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dpf2 / 2.0f;
        rectF.set(f7, f10 - f11, a() + f7, f10 + f11);
        yc ycVar = this.e;
        if (ycVar == null) {
            a2 = 1.0f;
        } else {
            a2 = ycVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f24572f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f24569a);
        }
        int i15 = w02;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, i15);
        Paint paint2 = this.f24570b;
        paint2.setColor(m12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f24571c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
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
