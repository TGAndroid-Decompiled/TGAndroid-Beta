package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class lr {
    public int f35727a;
    public int f35728b;
    public my0 f35729c;
    public int d;
    public boolean f35730e;
    public int f35731f;
    public int f35732g;

    public static lr b(org.telegram.ui.Cells.t2 t2Var, org.telegram.messenger.vo voVar) {
        ?? obj = new Object();
        obj.f35727a = voVar.f26074a;
        obj.f35728b = voVar.f26084m;
        String str = voVar.f26075b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        my0 my0Var = new my0(spannableStringBuilder, 10.0f, org.telegram.messenger.g0.o());
        my0Var.r(t2Var);
        obj.f35729c = my0Var;
        obj.f35729c.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, my0Var.f36131a.getFontMetricsInt(), false, null, 0), voVar.f26076c, obj.f35729c.f36131a.getFontMetricsInt(), false));
        obj.f35729c.o(26);
        int L = org.telegram.messenger.g0.L(9.32f);
        my0 my0Var2 = obj.f35729c;
        obj.f35732g = L + ((int) my0Var2.f36133c);
        my0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.m6.f28151r8;
        int i7 = iArr[voVar.f26084m % iArr.length];
        obj.f35731f = i7;
        obj.f35730e = true;
        obj.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f10;
        if (this.f35730e) {
            this.d = org.telegram.ui.ActionBar.m6.x0(null, this.f35731f, false);
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
        rectF.set(0.0f, 0.0f, this.f35732g, org.telegram.messenger.g0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.A0);
        this.f35729c.c(org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
