package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class sr {
    public int f39393a;
    public int f39394b;
    public oy0 f39395c;
    public int d;
    public boolean f39396e;
    public int f39397f;
    public int f39398g;

    public static sr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.so soVar) {
        ?? obj = new Object();
        obj.f39393a = soVar.f26542a;
        obj.f39394b = soVar.f26552m;
        String str = soVar.f26543b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        oy0 oy0Var = new oy0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        oy0Var.r(t2Var);
        obj.f39395c = oy0Var;
        obj.f39395c.q(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, oy0Var.f38103a.getFontMetricsInt(), false, null, 0), soVar.f26544c, obj.f39395c.f38103a.getFontMetricsInt(), false));
        obj.f39395c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        oy0 oy0Var2 = obj.f39395c;
        obj.f39398g = L + ((int) oy0Var2.f38105c);
        oy0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
        int i7 = iArr[soVar.f26552m % iArr.length];
        obj.f39397f = i7;
        obj.f39396e = true;
        obj.d = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f39396e) {
            this.d = org.telegram.ui.ActionBar.j6.x0(null, this.f39397f, false);
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
        rectF.set(0.0f, 0.0f, this.f39398g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.j6.A0);
        this.f39395c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
