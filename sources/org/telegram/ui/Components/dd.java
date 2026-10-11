package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class dd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f25537a;
    public final Paint f25538b = new Paint(1);
    public final n11 f25539c;
    public final Runnable d;
    public bd f25540e;
    public Integer f25541f;

    public dd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25537a = d6Var;
        this.d = runnable;
        this.f25539c = new n11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        dd ddVar = new dd(charSequence, runnable, d6Var);
        spannableString.setSpan(ddVar, 0, spannableString.length(), 33);
        ddVar.f25541f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f25539c.f28902c + AndroidUtilities.dp(14.0f));
    }

    public final void c(cd cdVar, boolean z10) {
        if (this.f25540e == null) {
            this.f25540e = new bd(cdVar);
        }
        this.f25540e.c(z10);
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
        bd bdVar = this.f25540e;
        if (bdVar == null) {
            a2 = 1.0f;
        } else {
            a2 = bdVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f25541f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f25537a);
        }
        int i15 = w02;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, i15);
        Paint paint2 = this.f25538b;
        paint2.setColor(m12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f25539c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
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
