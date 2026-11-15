package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class sr {
    public int f39391a;
    public int f39392b;
    public oy0 f39393c;
    public int d;
    public boolean f39394e;
    public int f39395f;
    public int f39396g;

    public static sr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.so soVar) {
        ?? obj = new Object();
        obj.f39391a = soVar.f26552a;
        obj.f39392b = soVar.f26562m;
        String str = soVar.f26553b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        oy0 oy0Var = new oy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        oy0Var.r(t2Var);
        obj.f39393c = oy0Var;
        obj.f39393c.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, oy0Var.f38101a.getFontMetricsInt(), false, null, 0), soVar.f26554c, obj.f39393c.f38101a.getFontMetricsInt(), false));
        obj.f39393c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        oy0 oy0Var2 = obj.f39393c;
        obj.f39396g = L + ((int) oy0Var2.f38103c);
        oy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
        int i7 = iArr[soVar.f26562m % iArr.length];
        obj.f39395f = i7;
        obj.f39394e = true;
        obj.d = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f39394e) {
            this.d = org.telegram.ui.ActionBar.j6.x0(null, this.f39395f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.j6.A0;
        int i7 = this.d;
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.r1(f10, i7));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f39396g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.f39393c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
