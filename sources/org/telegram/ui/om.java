package org.telegram.ui;

import android.view.View;
public final class om extends c8.ja {
    public org.telegram.messenger.ij f48546a;
    public int f48547b = 0;
    public boolean f48548c = true;
    public int d = 0;
    public int f48549e;
    public boolean f48550f;
    public int f48551g;
    public final cn h;

    public om(cn cnVar) {
        this.h = cnVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f48546a;
        cn cnVar = this.h;
        if (ijVar != null) {
            cnVar.C0.T();
            int indexOf = cnVar.K6.indexOf(this.f48546a) + cnVar.C0.J;
            if (indexOf >= 0) {
                cnVar.B0.i1(indexOf, (int) ((this.f48549e + this.f48551g) - cnVar.N9), this.f48550f);
            }
        } else {
            cnVar.C0.T();
            cnVar.B0.i1(this.f48547b, this.d, this.f48548c);
        }
        this.f48546a = null;
        cnVar.A3 = true;
        cnVar.Fd(false);
        org.telegram.messenger.g0.h3(new dh(this, 9));
    }

    @Override
    public final void c() {
        cn cnVar = this.h;
        cnVar.f44470da = cnVar.getNotificationCenter().q(cn.f44414qd, cnVar.f44470da, true);
        ak akVar = cnVar.Ra;
        if (akVar.f46737n) {
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
