package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36057a;
    public int f36058b;
    public my0 f36059c;
    public int d;
    public boolean f36060e;
    public int f36061f;
    public int f36062g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f36057a = voVar.f26064a;
        obj.f36058b = voVar.f26074m;
        String str = voVar.f26065b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        my0 my0Var = new my0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        my0Var.r(t2Var);
        obj.f36059c = my0Var;
        obj.f36059c.q(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, my0Var.f36123a.getFontMetricsInt(), false, null, 0), voVar.f26066c, obj.f36059c.f36123a.getFontMetricsInt(), false));
        obj.f36059c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        my0 my0Var2 = obj.f36059c;
        obj.f36062g = L + ((int) my0Var2.f36125c);
        my0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.k6.f28110r8;
        int i7 = iArr[voVar.f26074m % iArr.length];
        obj.f36061f = i7;
        obj.f36060e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36060e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f36061f, false);
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
        rectF.set(0.0f, 0.0f, this.f36062g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f36059c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
