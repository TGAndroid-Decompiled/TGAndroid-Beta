package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;

public final class pc extends ReplacementSpan {

    public final org.telegram.ui.ActionBar.c6 f31581a;

    public final Paint f31582b = new Paint(1);

    public final pz0 f31583c;
    public final Runnable d;

    public nc f31584e;

    public Integer f31585f;

    public pc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f31581a = c6Var;
        this.d = runnable;
        this.f31583c = new pz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        pc pcVar = new pc(charSequence, runnable, c6Var);
        spannableString.setSpan(pcVar, 0, spannableString.length(), 33);
        pcVar.f31585f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f31583c.f31697c + AndroidUtilities.dp(14.0f));
    }

    public final void c(oc ocVar, boolean z10) {
        if (this.f31584e == null) {
            this.f31584e = new nc(ocVar);
        }
        this.f31584e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float fDpf2 = AndroidUtilities.dpf2(17.0f);
        float f11 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = fDpf2 / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        nc ncVar = this.f31584e;
        float fA = ncVar == null ? 1.0f : ncVar.a(0.025f);
        canvas.save();
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        Integer num = this.f31585f;
        int iIntValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f31581a);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, iIntValue);
        Paint paint2 = this.f31582b;
        paint2.setColor(iL1);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f31583c.c(f10 + AndroidUtilities.dp(7.0f), f11, 1.0f, iIntValue, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
