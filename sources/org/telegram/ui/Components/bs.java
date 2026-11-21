package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class bs {
    public int f33911a;
    public int f33912b;
    public xy0 f33913c;
    public int d;
    public boolean f33914e;
    public int f33915f;
    public int f33916g;

    public static bs b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.ro roVar) {
        ?? obj = new Object();
        obj.f33911a = roVar.f26700a;
        obj.f33912b = roVar.f26710m;
        String str = roVar.f26701b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        xy0 xy0Var = new xy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        xy0Var.r(u2Var);
        obj.f33913c = xy0Var;
        obj.f33913c.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, xy0Var.f42252a.getFontMetricsInt(), false, null, 0), roVar.f26702c, obj.f33913c.f42252a.getFontMetricsInt(), false));
        obj.f33913c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        xy0 xy0Var2 = obj.f33913c;
        obj.f33916g = L + ((int) xy0Var2.f42254c);
        xy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.m6.f29639r8;
        int i7 = iArr[roVar.f26710m % iArr.length];
        obj.f33915f = i7;
        obj.f33914e = true;
        obj.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f33914e) {
            this.d = org.telegram.ui.ActionBar.m6.x0(null, this.f33915f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.m6.A0;
        int i7 = this.d;
        if (org.telegram.ui.ActionBar.m6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(f10, i7));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f33916g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.A0);
        this.f33913c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
