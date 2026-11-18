package org.telegram.ui;

import android.view.View;
public final class kb extends c8.oa {
    public org.telegram.messenger.fj f49231a;
    public int f49232b = 0;
    public boolean f49233c = true;
    public int d = 0;
    public int f49234e;
    public final lb f49235f;

    public kb(lb lbVar) {
        this.f49235f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f49231a;
        lb lbVar = this.f49235f;
        if (fjVar != null) {
            int indexOf = lbVar.f49546p0.indexOf(fjVar) + lbVar.F.f48685f;
            if (indexOf >= 0) {
                lbVar.f49559y.i1(indexOf, this.f49234e, false);
            }
        } else {
            lbVar.f49559y.i1(this.f49232b, this.d, this.f49233c);
        }
        this.f49231a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49235f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f49235f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
