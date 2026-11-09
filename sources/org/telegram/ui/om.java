package org.telegram.ui;

import android.view.View;
public final class om extends c8.ja {
    public org.telegram.messenger.ij f48469a;
    public int f48470b = 0;
    public boolean f48471c = true;
    public int d = 0;
    public int f48472e;
    public boolean f48473f;
    public int f48474g;
    public final cn h;

    public om(cn cnVar) {
        this.h = cnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f48469a;
        cn cnVar = this.h;
        if (ijVar != null) {
            cnVar.C0.T();
            int indexOf = cnVar.K6.indexOf(this.f48469a) + cnVar.C0.J;
            if (indexOf >= 0) {
                cnVar.B0.i1(indexOf, (int) ((this.f48472e + this.f48474g) - cnVar.N9), this.f48473f);
            }
        } else {
            cnVar.C0.T();
            cnVar.B0.i1(this.f48470b, this.d, this.f48471c);
        }
        this.f48469a = null;
        cnVar.A3 = true;
        cnVar.Fd(false);
        org.telegram.messenger.g0.h3(new dh(this, 9));
    }

    @Override
    public final void c() {
        cn cnVar = this.h;
        cnVar.f44429da = cnVar.getNotificationCenter().q(cn.f44373qd, cnVar.f44429da, true);
        ak akVar = cnVar.Ra;
        if (akVar.f46390n) {
            akVar.d();
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
