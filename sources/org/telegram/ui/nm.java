package org.telegram.ui;

import android.view.View;
public final class nm extends c8.oa {
    public org.telegram.messenger.fj f50220a;
    public int f50221b = 0;
    public boolean f50222c = true;
    public int d = 0;
    public int f50223e;
    public boolean f50224f;
    public int f50225g;
    public final bn h;

    public nm(bn bnVar) {
        this.h = bnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f50220a;
        bn bnVar = this.h;
        if (fjVar != null) {
            bnVar.D0.T();
            int indexOf = bnVar.M6.indexOf(this.f50220a) + bnVar.D0.K;
            if (indexOf >= 0) {
                bnVar.C0.i1(indexOf, (int) ((this.f50223e + this.f50225g) - bnVar.P9), this.f50224f);
            }
        } else {
            bnVar.D0.T();
            bnVar.C0.i1(this.f50221b, this.d, this.f50222c);
        }
        this.f50220a = null;
        bnVar.B3 = true;
        bnVar.Gd(false);
        org.telegram.messenger.g0.g3(new bh(this, 9));
    }

    @Override
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.f45928sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.f47797n) {
            zjVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
