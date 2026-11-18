package org.telegram.ui;

import android.view.View;
public final class nm extends c8.oa {
    public org.telegram.messenger.fj f50204a;
    public int f50205b = 0;
    public boolean f50206c = true;
    public int d = 0;
    public int f50207e;
    public boolean f50208f;
    public int f50209g;
    public final bn h;

    public nm(bn bnVar) {
        this.h = bnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f50204a;
        bn bnVar = this.h;
        if (fjVar != null) {
            bnVar.D0.T();
            int indexOf = bnVar.M6.indexOf(this.f50204a) + bnVar.D0.K;
            if (indexOf >= 0) {
                bnVar.C0.i1(indexOf, (int) ((this.f50207e + this.f50209g) - bnVar.P9), this.f50208f);
            }
        } else {
            bnVar.D0.T();
            bnVar.C0.i1(this.f50205b, this.d, this.f50206c);
        }
        this.f50204a = null;
        bnVar.B3 = true;
        bnVar.Gd(false);
        org.telegram.messenger.g0.g3(new bh(this, 9));
    }

    @Override
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.f45919sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.f47761n) {
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
