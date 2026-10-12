package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class cd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.c6 f24920a;
    public final Paint f24921b = new Paint(1);
    public final r11 f24922c;
    public final Runnable d;
    public ad f24923e;
    public Integer f24924f;

    public cd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f24920a = c6Var;
        this.d = runnable;
        this.f24922c = new r11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        cd cdVar = new cd(charSequence, runnable, c6Var);
        spannableString.setSpan(cdVar, 0, spannableString.length(), 33);
        cdVar.f24924f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f24922c.f29989c + AndroidUtilities.dp(14.0f));
    }

    public final void c(bd bdVar, boolean z10) {
        if (this.f24923e == null) {
            this.f24923e = new ad(bdVar);
        }
        this.f24923e.c(z10);
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
        ad adVar = this.f24923e;
        if (adVar == null) {
            a2 = 1.0f;
        } else {
            a2 = adVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f24924f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f24920a);
        }
        int i15 = w02;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, i15);
        Paint paint2 = this.f24921b;
        paint2.setColor(m12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f24922c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
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
