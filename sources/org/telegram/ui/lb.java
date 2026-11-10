package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47569a;
    public int f47570b = 0;
    public boolean f47571c = true;
    public int d = 0;
    public int f47572e;
    public final mb f47573f;

    public lb(mb mbVar) {
        this.f47573f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47569a;
        mb mbVar = this.f47573f;
        if (ijVar != null) {
            int indexOf = mbVar.f47891o0.indexOf(ijVar) + mbVar.E.f46892f;
            if (indexOf >= 0) {
                mbVar.f47905y.i1(indexOf, this.f47572e, false);
            }
        } else {
            mbVar.f47905y.i1(this.f47570b, this.d, this.f47571c);
        }
        this.f47569a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new jq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47573f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47573f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
