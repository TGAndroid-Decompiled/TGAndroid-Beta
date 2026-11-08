package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class mr {
    public int f36085a;
    public int f36086b;
    public my0 f36087c;
    public int d;
    public boolean f36088e;
    public int f36089f;
    public int f36090g;

    public static mr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f36085a = voVar.f26070a;
        obj.f36086b = voVar.f26080m;
        String str = voVar.f26071b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        my0 my0Var = new my0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        my0Var.r(t2Var);
        obj.f36087c = my0Var;
        obj.f36087c.q(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, my0Var.f36145a.getFontMetricsInt(), false, null, 0), voVar.f26072c, obj.f36087c.f36145a.getFontMetricsInt(), false));
        obj.f36087c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        my0 my0Var2 = obj.f36087c;
        obj.f36090g = L + ((int) my0Var2.f36147c);
        my0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.k6.f28113r8;
        int i7 = iArr[voVar.f26080m % iArr.length];
        obj.f36089f = i7;
        obj.f36088e = true;
        obj.d = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f36088e) {
            this.d = org.telegram.ui.ActionBar.k6.x0(null, this.f36089f, false);
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
        rectF.set(0.0f, 0.0f, this.f36090g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.A0);
        this.f36087c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
