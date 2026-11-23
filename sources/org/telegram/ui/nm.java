package org.telegram.ui;

import android.view.View;
public final class nm extends c8.ra {
    public org.telegram.messenger.gj f50219a;
    public int f50220b = 0;
    public boolean f50221c = true;
    public int d = 0;
    public int f50222e;
    public boolean f50223f;
    public int f50224g;
    public final bn h;

    public nm(bn bnVar) {
        this.h = bnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f50219a;
        bn bnVar = this.h;
        if (gjVar != null) {
            bnVar.D0.T();
            int indexOf = bnVar.M6.indexOf(this.f50219a) + bnVar.D0.K;
            if (indexOf >= 0) {
                bnVar.C0.i1(indexOf, (int) ((this.f50222e + this.f50224g) - bnVar.P9), this.f50223f);
            }
        } else {
            bnVar.D0.T();
            bnVar.C0.i1(this.f50220b, this.d, this.f50221c);
        }
        this.f50219a = null;
        bnVar.B3 = true;
        bnVar.Gd(false);
        org.telegram.messenger.g0.g3(new bh(this, 9));
    }

    @Override
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.f45899sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.f48110n) {
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
