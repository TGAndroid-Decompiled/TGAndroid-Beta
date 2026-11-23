package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements d81 {
    public final View f33684a;
    public final String f33685b;
    public final org.telegram.utils.twidget.d1 f33686c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final Paint f33687e = new Paint(1);
    public final Path f33688f = new Path();
    public e81 h;
    public int f33689n;
    public boolean f33690r;

    public b81(org.telegram.ui.Cells.i2 i2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f33684a = i2Var;
        this.d = i6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f33685b = v;
        this.f33686c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.d1 d1Var = this.f33686c;
        if (d1Var != null && i7 > 0) {
            this.f33689n = i7;
            d1Var.l(i7);
            if (!this.f33690r) {
                this.f33690r = true;
                d1Var.j(org.telegram.utils.twidget.q1.a(this.d, true));
                if (this.h == null) {
                    this.h = new e81(this, org.telegram.messenger.g0.f24225p);
                }
                this.h.b(d1Var);
                this.h.q(true);
                org.telegram.utils.twidget.n0.t(d1Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f33684a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f33684a;
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
