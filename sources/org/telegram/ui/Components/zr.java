package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class zr {
    public int f42931a;
    public int f42932b;
    public vy0 f42933c;
    public int d;
    public boolean f42934e;
    public int f42935f;
    public int f42936g;

    public static zr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.ro roVar) {
        ?? obj = new Object();
        obj.f42931a = roVar.f26674a;
        obj.f42932b = roVar.f26684m;
        String str = roVar.f26675b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        vy0 vy0Var = new vy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        vy0Var.r(t2Var);
        obj.f42933c = vy0Var;
        obj.f42933c.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, vy0Var.f41480a.getFontMetricsInt(), false, null, 0), roVar.f26676c, obj.f42933c.f41480a.getFontMetricsInt(), false));
        obj.f42933c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        vy0 vy0Var2 = obj.f42933c;
        obj.f42936g = L + ((int) vy0Var2.f41482c);
        vy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.n6.f29657r8;
        int i7 = iArr[roVar.f26684m % iArr.length];
        obj.f42935f = i7;
        obj.f42934e = true;
        obj.d = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f42934e) {
            this.d = org.telegram.ui.ActionBar.n6.x0(null, this.f42935f, false);
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
        rectF.set(0.0f, 0.0f, this.f42936g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.A0);
        this.f42933c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
