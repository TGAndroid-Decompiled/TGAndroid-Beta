package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47499a;
    public int f47500b = 0;
    public boolean f47501c = true;
    public int d = 0;
    public int f47502e;
    public final mb f47503f;

    public lb(mb mbVar) {
        this.f47503f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47499a;
        mb mbVar = this.f47503f;
        if (ijVar != null) {
            int indexOf = mbVar.f47763o0.indexOf(ijVar) + mbVar.E.f46919f;
            if (indexOf >= 0) {
                mbVar.f47777y.i1(indexOf, this.f47502e, false);
            }
        } else {
            mbVar.f47777y.i1(this.f47500b, this.d, this.f47501c);
        }
        this.f47499a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new gq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47503f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47503f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
