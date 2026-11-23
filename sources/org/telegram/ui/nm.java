package org.telegram.ui;

import android.view.View;
public final class nm extends c8.ra {
    public org.telegram.messenger.fj f50332a;
    public int f50333b = 0;
    public boolean f50334c = true;
    public int d = 0;
    public int f50335e;
    public boolean f50336f;
    public int f50337g;
    public final bn h;

    public nm(bn bnVar) {
        this.h = bnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f50332a;
        bn bnVar = this.h;
        if (fjVar != null) {
            bnVar.D0.T();
            int indexOf = bnVar.M6.indexOf(this.f50332a) + bnVar.D0.K;
            if (indexOf >= 0) {
                bnVar.C0.i1(indexOf, (int) ((this.f50335e + this.f50337g) - bnVar.P9), this.f50336f);
            }
        } else {
            bnVar.D0.T();
            bnVar.C0.i1(this.f50333b, this.d, this.f50334c);
        }
        this.f50332a = null;
        bnVar.B3 = true;
        bnVar.Gd(false);
        org.telegram.messenger.g0.g3(new ch(this, 9));
    }

    @Override
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.f46114sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.f47964n) {
            zjVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            r1Var.setDelegate(null);
            r1Var.setResourcesProvider(null);
        }
    }
}
