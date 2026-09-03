package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class tc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.g6 f31331a;
    public final Paint f31332b = new Paint(1);
    public final k01 f31333c;
    public final Runnable d;
    public rc f31334e;
    public Integer f31335f;

    public tc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31331a = g6Var;
        this.d = runnable;
        this.f31333c = new k01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        tc tcVar = new tc(charSequence, runnable, g6Var);
        spannableString.setSpan(tcVar, 0, spannableString.length(), 33);
        tcVar.f31335f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f31333c.f28227c + AndroidUtilities.dp(14.0f));
    }

    public final void c(sc scVar, boolean z4) {
        if (this.f31334e == null) {
            this.f31334e = new rc(scVar);
        }
        this.f31334e.c(z4);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float a2;
        int v02;
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f11 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = dpf2 / 2.0f;
        rectF.set(f10, f11 - f12, a() + f10, f11 + f12);
        rc rcVar = this.f31334e;
        if (rcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = rcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f31335f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.f31331a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.15f, i15);
        Paint paint2 = this.f31332b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f12, f12, paint2);
        this.f31333c.c(f10 + AndroidUtilities.dp(7.0f), f11, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
