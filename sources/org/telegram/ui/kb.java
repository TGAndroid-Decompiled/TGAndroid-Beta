package org.telegram.ui;

import android.view.View;
public final class kb extends c8.ma {
    public org.telegram.messenger.gj f48659a;
    public int f48660b = 0;
    public boolean f48661c = true;
    public int d = 0;
    public int f48662e;
    public final lb f48663f;

    public kb(lb lbVar) {
        this.f48663f = lbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.gj gjVar = this.f48659a;
        lb lbVar = this.f48663f;
        if (gjVar != null) {
            int indexOf = lbVar.f48949p0.indexOf(gjVar) + lbVar.F.f48012f;
            if (indexOf >= 0) {
                lbVar.f48962y.i1(indexOf, this.f48662e, false);
            }
        } else {
            lbVar.f48962y.i1(this.f48660b, this.d, this.f48661c);
        }
        this.f48659a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.h3(new fq0(this, 21));
    }

    @Override
    public final void c() {
        lb lbVar = this.f48663f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f48663f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
