package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47495a;
    public int f47496b = 0;
    public boolean f47497c = true;
    public int d = 0;
    public int f47498e;
    public final mb f47499f;

    public lb(mb mbVar) {
        this.f47499f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47495a;
        mb mbVar = this.f47499f;
        if (ijVar != null) {
            int indexOf = mbVar.f47758o0.indexOf(ijVar) + mbVar.E.f46917f;
            if (indexOf >= 0) {
                mbVar.f47772y.i1(indexOf, this.f47498e, false);
            }
        } else {
            mbVar.f47772y.i1(this.f47496b, this.d, this.f47497c);
        }
        this.f47495a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new gq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47499f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47499f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
