package org.telegram.ui;

import android.view.View;
public final class kb extends c8.ma {
    public org.telegram.messenger.gj f48613a;
    public int f48614b = 0;
    public boolean f48615c = true;
    public int d = 0;
    public int f48616e;
    public final lb f48617f;

    public kb(lb lbVar) {
        this.f48617f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f48613a;
        lb lbVar = this.f48617f;
        if (gjVar != null) {
            int indexOf = lbVar.f48945p0.indexOf(gjVar) + lbVar.F.f48002f;
            if (indexOf >= 0) {
                lbVar.f48958y.i1(indexOf, this.f48616e, false);
            }
        } else {
            lbVar.f48958y.i1(this.f48614b, this.d, this.f48615c);
        }
        this.f48613a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.h3(new fq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f48617f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f48617f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
