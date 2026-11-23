package org.telegram.ui;

import android.view.View;
public final class kb extends c8.ra {
    public org.telegram.messenger.gj f49227a;
    public int f49228b = 0;
    public boolean f49229c = true;
    public int d = 0;
    public int f49230e;
    public final lb f49231f;

    public kb(lb lbVar) {
        this.f49231f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f49227a;
        lb lbVar = this.f49231f;
        if (gjVar != null) {
            int indexOf = lbVar.f49539p0.indexOf(gjVar) + lbVar.F.f48697f;
            if (indexOf >= 0) {
                lbVar.f49552y.i1(indexOf, this.f49230e, false);
            }
        } else {
            lbVar.f49552y.i1(this.f49228b, this.d, this.f49229c);
        }
        this.f49227a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new iq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49231f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f49231f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
