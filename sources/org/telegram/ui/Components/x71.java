package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class x71 implements z71 {
    public final View f41930a;
    public final String f41931b;
    public final org.telegram.utils.twidget.d1 f41932c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Paint f41933e = new Paint(1);
    public final Path f41934f = new Path();
    public a81 h;
    public int f41935n;
    public boolean f41936r;

    public x71(org.telegram.ui.Cells.i2 i2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f41930a = i2Var;
        this.d = i6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f41931b = v;
        this.f41932c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.d1 d1Var = this.f41932c;
        if (d1Var != null && i7 > 0) {
            this.f41935n = i7;
            d1Var.l(i7);
            if (!this.f41936r) {
                this.f41936r = true;
                d1Var.j(org.telegram.utils.twidget.q1.a(this.d, true));
                if (this.h == null) {
                    this.h = new a81(this, org.telegram.messenger.g0.f24117p);
                }
                this.h.b(d1Var);
                this.h.q(true);
                org.telegram.utils.twidget.n0.t(d1Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f41930a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f41930a;
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
