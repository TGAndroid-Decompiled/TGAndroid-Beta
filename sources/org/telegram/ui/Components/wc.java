package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class wc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.c6 f34370a;
    public final Paint f34371b = new Paint(1);
    public final zz0 f34372c;
    public final Runnable d;
    public uc f34373e;
    public Integer f34374f;

    public wc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34370a = c6Var;
        this.d = runnable;
        this.f34372c = new zz0(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        wc wcVar = new wc(charSequence, runnable, c6Var);
        spannableString.setSpan(wcVar, 0, spannableString.length(), 33);
        wcVar.f34374f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f34372c.f35462c + AndroidUtilities.dp(14.0f));
    }

    public final void c(vc vcVar, boolean z10) {
        if (this.f34373e == null) {
            this.f34373e = new uc(vcVar);
        }
        this.f34373e.c(z10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float a2;
        int v02;
        float dpf2 = AndroidUtilities.dpf2(17.0f);
        float f10 = (i12 + i14) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = dpf2 / 2.0f;
        rectF.set(f9, f10 - f11, a() + f9, f10 + f11);
        uc ucVar = this.f34373e;
        if (ucVar == null) {
            a2 = 1.0f;
        } else {
            a2 = ucVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f34374f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f34370a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, i15);
        Paint paint2 = this.f34371b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f34372c.c(f9 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
