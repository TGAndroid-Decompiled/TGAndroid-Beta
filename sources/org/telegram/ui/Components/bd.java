package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bd extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 f24667a;
    public final Paint f24668b = new Paint(1);
    public final f01 f24669c;
    public final Runnable d;
    public zc f24670e;
    public Integer f24671f;

    public bd(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24667a = f6Var;
        this.d = runnable;
        this.f24669c = new f01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        bd bdVar = new bd(charSequence, runnable, f6Var);
        spannableString.setSpan(bdVar, 0, spannableString.length(), 33);
        bdVar.f24671f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f24669c.f25847c + AndroidUtilities.dp(14.0f));
    }

    public final void c(ad adVar, boolean z10) {
        if (this.f24670e == null) {
            this.f24670e = new zc(adVar);
        }
        this.f24670e.c(z10);
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
        zc zcVar = this.f24670e;
        if (zcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = zcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f24671f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f24667a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i15);
        Paint paint2 = this.f24668b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f24669c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
