package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36103a;
    public int f36104b;
    public ly0 f36105c;
    public int d;
    public boolean f36106e;
    public int f36107f;
    public int f36108g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f36103a = voVar.f26056a;
        obj.f36104b = voVar.f26066m;
        String str = voVar.f26057b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        ly0 ly0Var = new ly0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        ly0Var.r(t2Var);
        obj.f36105c = ly0Var;
        obj.f36105c.q(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, ly0Var.f35775a.getFontMetricsInt(), false, null, 0), voVar.f26058c, obj.f36105c.f35775a.getFontMetricsInt(), false));
        obj.f36105c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        ly0 ly0Var2 = obj.f36105c;
        obj.f36108g = L + ((int) ly0Var2.f35777c);
        ly0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.k6.f28109r8;
        int i7 = iArr[voVar.f26066m % iArr.length];
        obj.f36107f = i7;
        obj.f36106e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36106e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f36107f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.k6.A0;
        int i7 = this.d;
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(f10, i7));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f36108g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f36105c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
