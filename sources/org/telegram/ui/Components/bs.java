package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class bs {
    public int f33904a;
    public int f33905b;
    public xy0 f33906c;
    public int d;
    public boolean f33907e;
    public int f33908f;
    public int f33909g;

    public static bs b(org.telegram.ui.Cells.u2 u2Var, org.telegram.messenger.so soVar) {
        ?? obj = new Object();
        obj.f33904a = soVar.f26886a;
        obj.f33905b = soVar.f26896m;
        String str = soVar.f26887b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        xy0 xy0Var = new xy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        xy0Var.r(u2Var);
        obj.f33906c = xy0Var;
        obj.f33906c.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, xy0Var.f42244a.getFontMetricsInt(), false, null, 0), soVar.f26888c, obj.f33906c.f42244a.getFontMetricsInt(), false));
        obj.f33906c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        xy0 xy0Var2 = obj.f33906c;
        obj.f33909g = L + ((int) xy0Var2.f42246c);
        xy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.m6.f29642r8;
        int i7 = iArr[soVar.f26896m % iArr.length];
        obj.f33908f = i7;
        obj.f33907e = true;
        obj.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f33907e) {
            this.d = org.telegram.ui.ActionBar.m6.x0(null, this.f33908f, false);
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
        rectF.set(0.0f, 0.0f, this.f33909g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.A0);
        this.f33906c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
