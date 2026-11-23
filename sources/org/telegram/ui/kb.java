package org.telegram.ui;

import android.view.View;
public final class kb extends c8.ra {
    public org.telegram.messenger.fj f49384a;
    public int f49385b = 0;
    public boolean f49386c = true;
    public int d = 0;
    public int f49387e;
    public final lb f49388f;

    public kb(lb lbVar) {
        this.f49388f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f49384a;
        lb lbVar = this.f49388f;
        if (fjVar != null) {
            int indexOf = lbVar.f49698p0.indexOf(fjVar) + lbVar.F.f48770f;
            if (indexOf >= 0) {
                lbVar.f49711y.i1(indexOf, this.f49387e, false);
            }
        } else {
            lbVar.f49711y.i1(this.f49385b, this.d, this.f49386c);
        }
        this.f49384a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49388f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f49388f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
