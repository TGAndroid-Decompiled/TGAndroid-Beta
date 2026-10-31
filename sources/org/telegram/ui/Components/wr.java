package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class wr {
    public int f32231a;
    public int f32232b;
    public qz0 f32233c;
    public int d;
    public boolean e;
    public int f32234f;
    public int f32235g;

    public static wr b(org.telegram.ui.Cells.v2 v2Var, org.telegram.messenger.ap apVar) {
        ?? obj = new Object();
        obj.f32231a = apVar.f14645a;
        obj.f32232b = apVar.f14654m;
        String str = apVar.f14646b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        qz0 qz0Var = new qz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o());
        qz0Var.r(v2Var);
        obj.f32233c = qz0Var;
        obj.f32233c.q(org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, qz0Var.f29772a.getFontMetricsInt(), false, null, 0), apVar.f14647c, obj.f32233c.f29772a.getFontMetricsInt(), false));
        obj.f32233c.o(26);
        int L = org.telegram.messenger.i0.L(9.32f);
        qz0 qz0Var2 = obj.f32233c;
        obj.f32235g = L + ((int) qz0Var2.f29774c);
        qz0Var2.i();
        int[] iArr = org.telegram.ui.ActionBar.t6.f21188r8;
        int i10 = iArr[apVar.f14654m % iArr.length];
        obj.f32234f = i10;
        obj.e = true;
        obj.d = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f7;
        if (this.e) {
            this.d = org.telegram.ui.ActionBar.t6.x0(null, this.f32234f, false);
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
        rectF.set(0.0f, 0.0f, this.f32235g, org.telegram.messenger.i0.L(14.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.A0);
        this.f32233c.c(org.telegram.messenger.i0.L(4.66f), org.telegram.messenger.i0.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
