package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f22919a;
    public final Paint f22920b = new Paint(1);
    public final w01 f22921c;
    public final Runnable d;
    public zc e;
    public Integer f22922f;

    public bd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f22919a = d6Var;
        this.d = runnable;
        this.f22921c = new w01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        bd bdVar = new bd(charSequence, runnable, d6Var);
        spannableString.setSpan(bdVar, 0, spannableString.length(), 33);
        bdVar.f22922f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f22921c.f29768c + AndroidUtilities.dp(14.0f));
    }

    public final void c(ad adVar, boolean z10) {
        if (this.e == null) {
            this.e = new zc(adVar);
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
        zc zcVar = this.e;
        if (zcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = zcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f22922f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.f22919a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, i15);
        Paint paint2 = this.f22920b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f22921c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
