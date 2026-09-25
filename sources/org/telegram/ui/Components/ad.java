package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ad extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f22657a;
    public final Paint f22658b = new Paint(1);
    public final t01 f22659c;
    public final Runnable d;
    public yc e;
    public Integer f22660f;

    public ad(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f22657a = d6Var;
        this.d = runnable;
        this.f22659c = new t01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ad adVar = new ad(charSequence, runnable, d6Var);
        spannableString.setSpan(adVar, 0, spannableString.length(), 33);
        adVar.f22660f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f22659c.f28364c + AndroidUtilities.dp(14.0f));
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
        int v02;
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
        Integer num = this.f22660f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f22657a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, i15);
        Paint paint2 = this.f22658b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f22659c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
