package org.telegram.ui;

import android.view.View;
public final class kb extends c8.oa {
    public org.telegram.messenger.fj f49226a;
    public int f49227b = 0;
    public boolean f49228c = true;
    public int d = 0;
    public int f49229e;
    public final lb f49230f;

    public kb(lb lbVar) {
        this.f49230f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f49226a;
        lb lbVar = this.f49230f;
        if (fjVar != null) {
            int indexOf = lbVar.f49519p0.indexOf(fjVar) + lbVar.F.f48683f;
            if (indexOf >= 0) {
                lbVar.f49532y.i1(indexOf, this.f49229e, false);
            }
        } else {
            lbVar.f49532y.i1(this.f49227b, this.d, this.f49228c);
        }
        this.f49226a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49230f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f49230f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
