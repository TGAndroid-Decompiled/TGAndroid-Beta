package org.telegram.ui;

import android.view.View;
public final class kb extends c8.oa {
    public org.telegram.messenger.fj f49265a;
    public int f49266b = 0;
    public boolean f49267c = true;
    public int d = 0;
    public int f49268e;
    public final lb f49269f;

    public kb(lb lbVar) {
        this.f49269f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.fj fjVar = this.f49265a;
        lb lbVar = this.f49269f;
        if (fjVar != null) {
            int indexOf = lbVar.f49559p0.indexOf(fjVar) + lbVar.F.f48713f;
            if (indexOf >= 0) {
                lbVar.f49572y.i1(indexOf, this.f49268e, false);
            }
        } else {
            lbVar.f49572y.i1(this.f49266b, this.d, this.f49267c);
        }
        this.f49265a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f49269f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f49269f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
