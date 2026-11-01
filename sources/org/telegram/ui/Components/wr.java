package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class wr {
    public int f32297a;
    public int f32298b;
    public rz0 f32299c;
    public int d;
    public boolean e;
    public int f32300f;
    public int f32301g;

    public static wr b(org.telegram.ui.Cells.v2 v2Var, org.telegram.messenger.bp bpVar) {
        ?? obj = new Object();
        obj.f32297a = bpVar.f15000a;
        obj.f32298b = bpVar.f15009m;
        String str = bpVar.f15001b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        rz0 rz0Var = new rz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o());
        rz0Var.r(v2Var);
        obj.f32299c = rz0Var;
        obj.f32299c.q(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, rz0Var.f30124a.getFontMetricsInt(), false, null, 0), bpVar.f15002c, obj.f32299c.f30124a.getFontMetricsInt(), false));
        obj.f32299c.o(26);
        int L = org.telegram.messenger.i0.L(9.32f);
        rz0 rz0Var2 = obj.f32299c;
        obj.f32301g = L + ((int) rz0Var2.f30126c);
        rz0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.t6.f21189r8;
        int i10 = iArr[bpVar.f15009m % iArr.length];
        obj.f32300f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.t6.x0(null, this.f32300f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.t6.A0;
        int i10 = this.d;
        if (org.telegram.ui.ActionBar.t6.I.q()) {
            f7 = 0.2f;
        } else {
            f7 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(f7, i10));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, this.f32301g, org.telegram.messenger.i0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.A0);
        this.f32299c.c(org.telegram.messenger.i0.L(4.66f), org.telegram.messenger.i0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
