package org.telegram.ui;

import android.view.View;
public final class mm extends c8.ja {
    public org.telegram.messenger.ij f47829a;
    public int f47830b = 0;
    public boolean f47831c = true;
    public int d = 0;
    public int f47832e;
    public boolean f47833f;
    public int f47834g;
    public final an h;

    public mm(an anVar) {
        this.h = anVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47829a;
        an anVar = this.h;
        if (ijVar != null) {
            anVar.C0.T();
            int indexOf = anVar.K6.indexOf(this.f47829a) + anVar.C0.J;
            if (indexOf >= 0) {
                anVar.B0.i1(indexOf, (int) ((this.f47832e + this.f47834g) - anVar.L9), this.f47833f);
            }
        } else {
            anVar.C0.T();
            anVar.B0.i1(this.f47830b, this.d, this.f47831c);
        }
        this.f47829a = null;
        anVar.A3 = true;
        anVar.Cd(false);
        org.telegram.messenger.g0.h3(new bh(this, 9));
    }

    @Override
    public final void c() {
        an anVar = this.h;
        anVar.f43742ba = anVar.getNotificationCenter().q(an.f43713od, anVar.f43742ba, true);
        yj yjVar = anVar.Pa;
        if (yjVar.f45711n) {
            yjVar.d();
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
