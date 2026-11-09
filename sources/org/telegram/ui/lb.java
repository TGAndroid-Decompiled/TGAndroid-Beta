package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47550a;
    public int f47551b = 0;
    public boolean f47552c = true;
    public int d = 0;
    public int f47553e;
    public final mb f47554f;

    public lb(mb mbVar) {
        this.f47554f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47550a;
        mb mbVar = this.f47554f;
        if (ijVar != null) {
            int indexOf = mbVar.f47824o0.indexOf(ijVar) + mbVar.E.f46910f;
            if (indexOf >= 0) {
                mbVar.f47838y.i1(indexOf, this.f47553e, false);
            }
        } else {
            mbVar.f47838y.i1(this.f47551b, this.d, this.f47552c);
        }
        this.f47550a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new iq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47554f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47554f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
