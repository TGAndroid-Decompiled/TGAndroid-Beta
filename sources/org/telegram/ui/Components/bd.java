package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.d6 f24919a;
    public final Paint f24920b = new Paint(1);
    public final e11 f24921c;
    public final Runnable d;
    public zc f24922e;
    public Integer f24923f;

    public bd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24919a = d6Var;
        this.d = runnable;
        this.f24921c = new e11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        bd bdVar = new bd(charSequence, runnable, d6Var);
        spannableString.setSpan(bdVar, 0, spannableString.length(), 33);
        bdVar.f24923f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f24921c.f25879c + AndroidUtilities.dp(14.0f));
    }

    public final void c(ad adVar, boolean z10) {
        if (this.f24922e == null) {
            this.f24922e = new zc(adVar);
        }
        this.f24922e.c(z10);
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
        zc zcVar = this.f24922e;
        if (zcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = zcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f24923f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.f24919a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, i15);
        Paint paint2 = this.f24920b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f24921c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
