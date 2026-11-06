package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36041a;
    public int f36042b;
    public ly0 f36043c;
    public int d;
    public boolean f36044e;
    public int f36045f;
    public int f36046g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f36041a = voVar.f26056a;
        obj.f36042b = voVar.f26066m;
        String str = voVar.f26057b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        ly0 ly0Var = new ly0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        ly0Var.r(t2Var);
        obj.f36043c = ly0Var;
        obj.f36043c.q(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, ly0Var.f35780a.getFontMetricsInt(), false, null, 0), voVar.f26058c, obj.f36043c.f35780a.getFontMetricsInt(), false));
        obj.f36043c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        ly0 ly0Var2 = obj.f36043c;
        obj.f36046g = L + ((int) ly0Var2.f35782c);
        ly0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.k6.f28109r8;
        int i7 = iArr[voVar.f26066m % iArr.length];
        obj.f36045f = i7;
        obj.f36044e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36044e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f36045f, false);
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
        rectF.set(0.0f, 0.0f, this.f36046g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f36043c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
