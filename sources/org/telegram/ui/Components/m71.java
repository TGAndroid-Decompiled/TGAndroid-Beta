package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m71 implements o71 {
    public final View f35882a;
    public final String f35883b;
    public final org.telegram.utils.twidget.v0 f35884c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final Paint f35885e = new Paint(1);
    public final Path f35886f = new Path();
    public p71 h;
    public int f35887n;
    public boolean f35888r;

    public m71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f35882a = h2Var;
        this.d = h6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f35883b = v;
        this.f35884c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.v0 v0Var = this.f35884c;
        if (v0Var != null && i7 > 0) {
            this.f35887n = i7;
            v0Var.n(i7);
            if (!this.f35888r) {
                this.f35888r = true;
                v0Var.l(org.telegram.utils.twidget.j1.a(this.d, true));
                if (this.h == null) {
                    this.h = new p71(this, org.telegram.messenger.g0.f22566p);
                }
                p71 p71Var = this.h;
                if (p71Var.f36823p != v0Var) {
                    p71Var.q();
                    p71Var.f36823p = v0Var;
                    v0Var.h = p71Var;
                    v0Var.m(p71Var.f36824q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.n0.t(v0Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f35882a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f35882a;
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
