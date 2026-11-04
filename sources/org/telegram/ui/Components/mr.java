package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36232a;
    public int f36233b;
    public ly0 f36234c;
    public int d;
    public boolean f36235e;
    public int f36236f;
    public int f36237g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.mo moVar) {
        ?? obj = new Object();
        obj.f36232a = moVar.f24237a;
        obj.f36233b = moVar.f24247m;
        String str = moVar.f24238b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        ly0 ly0Var = new ly0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        ly0Var.r(t2Var);
        obj.f36234c = ly0Var;
        obj.f36234c.q(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, ly0Var.f35916a.getFontMetricsInt(), false, null, 0), moVar.f24239c, obj.f36234c.f35916a.getFontMetricsInt(), false));
        obj.f36234c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        ly0 ly0Var2 = obj.f36234c;
        obj.f36237g = L + ((int) ly0Var2.f35918c);
        ly0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.k6.f28142r8;
        int i3 = iArr[moVar.f24247m % iArr.length];
        obj.f36236f = i3;
        obj.f36235e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36235e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f36236f, false);
        }
        Paint paint = org.telegram.ui.ActionBar.k6.A0;
        int i3 = this.d;
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            f10 = 0.2f;
        } else {
            f10 = 0.1f;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(f10, i3));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.f36237g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f36234c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
