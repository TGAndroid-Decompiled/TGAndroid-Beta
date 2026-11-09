package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n71 implements p71 {
    public final View f36282a;
    public final String f36283b;
    public final org.telegram.utils.twidget.v0 f36284c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final Paint f36285e = new Paint(1);
    public final Path f36286f = new Path();
    public q71 h;
    public int f36287n;
    public boolean f36288r;

    public n71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36282a = h2Var;
        this.d = g6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f36283b = v;
        this.f36284c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.v0 v0Var = this.f36284c;
        if (v0Var != null && i7 > 0) {
            this.f36287n = i7;
            v0Var.n(i7);
            if (!this.f36288r) {
                this.f36288r = true;
                v0Var.l(org.telegram.utils.twidget.j1.a(this.d, true));
                if (this.h == null) {
                    this.h = new q71(this, org.telegram.messenger.g0.f22562p);
                }
                q71 q71Var = this.h;
                if (q71Var.f37224p != v0Var) {
                    q71Var.q();
                    q71Var.f37224p = v0Var;
                    v0Var.h = q71Var;
                    v0Var.m(q71Var.f37225q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.n0.t(v0Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f36282a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f36282a;
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
