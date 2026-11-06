package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47472a;
    public int f47473b = 0;
    public boolean f47474c = true;
    public int d = 0;
    public int f47475e;
    public final mb f47476f;

    public lb(mb mbVar) {
        this.f47476f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47472a;
        mb mbVar = this.f47476f;
        if (ijVar != null) {
            int indexOf = mbVar.f47736o0.indexOf(ijVar) + mbVar.E.f46895f;
            if (indexOf >= 0) {
                mbVar.f47750y.i1(indexOf, this.f47475e, false);
            }
        } else {
            mbVar.f47750y.i1(this.f47473b, this.d, this.f47474c);
        }
        this.f47472a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new fq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47476f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47476f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
