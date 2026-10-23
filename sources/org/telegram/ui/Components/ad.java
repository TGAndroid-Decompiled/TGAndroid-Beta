package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
public final class ad extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.g6 f24688a;
    public final Paint f24689b = new Paint(1);
    public final i11 f24690c;
    public final Runnable d;
    public yc e;
    public Integer f24691f;

    public ad(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f24688a = g6Var;
        this.d = runnable;
        this.f24690c = new i11(charSequence, 12.0f, null);
    }

    public static SpannableString b(CharSequence charSequence, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ad adVar = new ad(charSequence, runnable, g6Var);
        spannableString.setSpan(adVar, 0, spannableString.length(), 33);
        adVar.f24691f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.f24690c.f27164c + AndroidUtilities.dp(14.0f));
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
        int w02;
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
        Integer num = this.f24691f;
        if (num != null) {
            w02 = num.intValue();
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.f24688a);
        }
        int i15 = w02;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.15f, i15);
        Paint paint2 = this.f24689b;
        paint2.setColor(o12);
        canvas.drawRoundRect(rectF, f11, f11, paint2);
        this.f24690c.c(f7 + AndroidUtilities.dp(7.0f), f10, 1.0f, i15, canvas);
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
