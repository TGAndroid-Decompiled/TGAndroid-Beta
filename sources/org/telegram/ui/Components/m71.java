package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m71 implements o71 {
    public final View f35932a;
    public final String f35933b;
    public final org.telegram.utils.twidget.v0 f35934c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Paint f35935e = new Paint(1);
    public final Path f35936f = new Path();
    public p71 h;
    public int f35937n;
    public boolean f35938r;

    public m71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35932a = h2Var;
        this.d = f6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f35933b = v;
        this.f35934c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.v0 v0Var = this.f35934c;
        if (v0Var != null && i7 > 0) {
            this.f35937n = i7;
            v0Var.n(i7);
            if (!this.f35938r) {
                this.f35938r = true;
                v0Var.l(org.telegram.utils.twidget.j1.a(this.d, true));
                if (this.h == null) {
                    this.h = new p71(this, org.telegram.messenger.g0.f22562p);
                }
                p71 p71Var = this.h;
                if (p71Var.f36827p != v0Var) {
                    p71Var.q();
                    p71Var.f36827p = v0Var;
                    v0Var.h = p71Var;
                    v0Var.m(p71Var.f36828q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.n0.t(v0Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f35932a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f35932a;
        view.requestLayout();
        view.invalidate();
    }

    @Override
    public final void b(boolean z9) {
    }

    @Override
    public final void f(String str) {
    }

    @Override
    public final void d() {
    }
}
