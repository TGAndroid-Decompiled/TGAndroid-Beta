package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class yr {
    public int f42542a;
    public int f42543b;
    public wy0 f42544c;
    public int d;
    public boolean f42545e;
    public int f42546f;
    public int f42547g;

    public static yr b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.ro roVar) {
        ?? obj = new Object();
        obj.f42542a = roVar.f26773a;
        obj.f42543b = roVar.f26783m;
        String str = roVar.f26774b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        wy0 wy0Var = new wy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        wy0Var.r(u2Var);
        obj.f42544c = wy0Var;
        obj.f42544c.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, wy0Var.f41761a.getFontMetricsInt(), false, null, 0), roVar.f26775c, obj.f42544c.f41761a.getFontMetricsInt(), false));
        obj.f42544c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        wy0 wy0Var2 = obj.f42544c;
        obj.f42547g = L + ((int) wy0Var2.f41763c);
        wy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.n6.f29712r8;
        int i7 = iArr[roVar.f26783m % iArr.length];
        obj.f42546f = i7;
        obj.f42545e = true;
        obj.d = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f42545e) {
            this.d = org.telegram.ui.ActionBar.n6.x0(null, this.f42546f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.n6.A0;
        int i7 = this.d;
        if (org.telegram.ui.ActionBar.n6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.n6.r1(f10, i7));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f42547g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.A0);
        this.f42544c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
