package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n71 implements p71 {
    public final View f37475a;
    public final String f37476b;
    public final org.telegram.utils.twidget.y0 f37477c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final Paint f37478e = new Paint(1);
    public final Path f37479f = new Path();
    public q71 h;
    public int f37480n;
    public boolean f37481r;

    public n71(org.telegram.ui.Cells.h2 h2Var, int i7, TLRPC.BotInlineResult botInlineResult, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37475a = h2Var;
        this.d = e6Var;
        String v = org.telegram.utils.twidget.n0.v(i7, botInlineResult);
        this.f37476b = v;
        this.f37477c = org.telegram.utils.twidget.n0.i(v);
    }

    public final void a(int i7) {
        org.telegram.utils.twidget.y0 y0Var = this.f37477c;
        if (y0Var != null && i7 > 0) {
            this.f37480n = i7;
            y0Var.n(i7);
            if (!this.f37481r) {
                this.f37481r = true;
                y0Var.l(org.telegram.utils.twidget.m1.a(this.d, true));
                if (this.h == null) {
                    this.h = new q71(this, org.telegram.messenger.g0.f23608p);
                }
                q71 q71Var = this.h;
                if (q71Var.f38550p != y0Var) {
                    q71Var.q();
                    q71Var.f38550p = y0Var;
                    y0Var.h = q71Var;
                    y0Var.m(q71Var.f38551q);
                }
                this.h.p(true);
                org.telegram.utils.twidget.n0.t(y0Var);
            }
        }
    }

    @Override
    public final void h() {
        this.f37475a.invalidate();
    }

    @Override
    public final void j() {
        View view = this.f37475a;
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
