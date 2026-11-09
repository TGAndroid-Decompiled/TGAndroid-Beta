package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36134a;
    public int f36135b;
    public ny0 f36136c;
    public int d;
    public boolean f36137e;
    public int f36138f;
    public int f36139g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f36134a = voVar.f26070a;
        obj.f36135b = voVar.f26080m;
        String str = voVar.f26071b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        ny0 ny0Var = new ny0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        ny0Var.r(t2Var);
        obj.f36136c = ny0Var;
        obj.f36136c.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, ny0Var.f36539a.getFontMetricsInt(), false, null, 0), voVar.f26072c, obj.f36136c.f36539a.getFontMetricsInt(), false));
        obj.f36136c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        ny0 ny0Var2 = obj.f36136c;
        obj.f36139g = L + ((int) ny0Var2.f36541c);
        ny0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.l6.f28126r8;
        int i7 = iArr[voVar.f26080m % iArr.length];
        obj.f36138f = i7;
        obj.f36137e = true;
        obj.d = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36137e) {
            this.d = org.telegram.ui.ActionBar.l6.x0(null, this.f36138f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.l6.A0;
        int i7 = this.d;
        if (org.telegram.ui.ActionBar.l6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.l6.r1(f10, i7));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f36139g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.l6.A0);
        this.f36136c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
