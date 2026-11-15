package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.tgnet.tl.TL_account;
public final class mw0 {
    public final int f37389a;
    public final org.telegram.ui.Cells.t0 f37390b;
    public final org.telegram.ui.ActionBar.e6 f37391c;
    public final ch0 d;
    public TL_account.TL_birthday f37392e;
    public oy0 f37393f;
    public oy0[] f37394g;
    public oy0[] h;
    public boolean f37395i;
    public oy0 f37396j;
    public final RectF f37397k = new RectF();
    public final Paint f37398l = new Paint(1);
    public final dc f37399m;

    public mw0(int i7, org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37389a = i7;
        this.f37390b = t0Var;
        this.f37391c = e6Var;
        ch0 ch0Var = new ch0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = ch0Var;
        ch0Var.H(false);
        this.f37399m = new dc(t0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.t0 t0Var = this.f37390b;
        int width = (t0Var.getWidth() - L) / 2;
        ch0 ch0Var = this.d;
        ch0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        ch0Var.draw(canvas);
        this.f37393f.c((t0Var.getWidth() - this.f37393f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f37393f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37394g.length; i11++) {
            i10 = (int) (Math.max(this.f37394g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (t0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f37394g.length) {
            float max = Math.max(this.f37394g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            oy0 oy0Var = this.f37394g[i12];
            oy0Var.c(f11 - (oy0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            oy0 oy0Var2 = this.h[i12];
            oy0Var2.c(f11 - (oy0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f37395i) {
            canvas.save();
            float k10 = this.f37396j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f37397k;
            rectF.set((t0Var.getWidth() - k10) / 2.0f, L3, (t0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f37399m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f37398l);
            this.f37396j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.u2) t4.l(this.f37390b.getContext(), org.telegram.messenger.hd.M0(2131751672, null), org.telegram.messenger.hd.M0(2131751671, null), this.f37392e, new q2(this, 13), null, true, false, this.f37391c).f25806b).show();
    }
}
