package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class cd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.c6 f23683a;
    public final Paint f23684b = new Paint(1);
    public final i11 f23685c;
    public final Runnable d;
    public ad e;
    public Integer f23686f;

    public cd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f23683a = c6Var;
        this.d = runnable;
        this.f23685c = new i11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        cd cdVar = new cd(charSequence, runnable, c6Var);
        spannableString.setSpan(cdVar, 0, spannableString.length(), 33);
        cdVar.f23686f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f23685c.f25455c + AndroidUtilities.dp(14.0f));
    }

    public final void c(bd bdVar, boolean z10) {
        if (this.e == null) {
            this.e = new ad(bdVar);
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
        ad adVar = this.e;
        if (adVar == null) {
            a2 = 1.0f;
        } else {
            a2 = adVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f23686f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.f23683a);
        }
        int i15 = w02;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.15f, i15);
        Paint paint2 = this.f23684b;
        paint2.setColor(m12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f23685c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
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
