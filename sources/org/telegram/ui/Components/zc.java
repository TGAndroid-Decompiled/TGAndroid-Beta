package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class zc extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.f6 f29641a;
    public final Paint f29642b = new Paint(1);
    public final t01 f29643c;
    public final Runnable d;
    public xc e;
    public Integer f29644f;

    public zc(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29641a = f6Var;
        this.d = runnable;
        this.f29643c = new t01(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        zc zcVar = new zc(charSequence, runnable, f6Var);
        spannableString.setSpan(zcVar, 0, spannableString.length(), 33);
        zcVar.f29644f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f29643c.f27247c + AndroidUtilities.dp(14.0f));
    }

    public final void c(yc ycVar, boolean z10) {
        if (this.e == null) {
            this.e = new xc(ycVar);
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
        xc xcVar = this.e;
        if (xcVar == null) {
            a2 = 1.0f;
        } else {
            a2 = xcVar.a(0.025f);
        }
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        Integer num = this.f29644f;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.f29641a);
        }
        int i15 = v02;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i15);
        Paint paint2 = this.f29642b;
        paint2.setColor(l1);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f29643c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return a();
    }
}
