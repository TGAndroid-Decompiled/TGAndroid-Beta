package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements c81 {
    public final View f33423a;
    public final String f33424b;
    public final org.telegram.utils.twidget.d1 f33425c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final Paint f33426e = new Paint(1);
    public final Path f33427f = new Path();
    public d81 h;
    public int f33428n;
    public boolean f33429r;

    public a81(org.telegram.ui.Cells.i2 i2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33423a = i2Var;
        this.d = h6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f33424b = v;
        this.f33425c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.d1 d1Var = this.f33425c;
        if (d1Var != null && i7 > 0) {
            this.f33428n = i7;
            d1Var.l(i7);
            if (!this.f33429r) {
                this.f33429r = true;
                d1Var.j(org.telegram.utils.twidget.q1.a(this.d, true));
                if (this.h == null) {
                    this.h = new d81(this, org.telegram.messenger.g0.f24045p);
                }
                this.h.b(d1Var);
                this.h.q(true);
                org.telegram.utils.twidget.n0.t(d1Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f33423a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f33423a;
        view.requestLayout();
        view.invalidate();
    }

    @Override
    public final void b(boolean z10) {
    }

    @Override
    public final void f(String str) {
    }

    @Override
    public final void d() {
    }
}
