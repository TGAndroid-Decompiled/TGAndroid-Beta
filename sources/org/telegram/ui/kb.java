package org.telegram.ui;

import android.view.View;
public final class kb extends c8.oa {
    public org.telegram.messenger.gj f49269a;
    public int f49270b = 0;
    public boolean f49271c = true;
    public int d = 0;
    public int f49272e;
    public final lb f49273f;

    public kb(lb lbVar) {
        this.f49273f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f49269a;
        lb lbVar = this.f49273f;
        if (gjVar != null) {
            int indexOf = lbVar.f49563p0.indexOf(gjVar) + lbVar.F.f48717f;
            if (indexOf >= 0) {
                lbVar.f49576y.i1(indexOf, this.f49272e, false);
            }
        } else {
            lbVar.f49576y.i1(this.f49270b, this.d, this.f49271c);
        }
        this.f49269a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49273f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f49273f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
