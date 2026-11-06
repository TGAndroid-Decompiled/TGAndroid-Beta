package org.telegram.ui;

import android.view.View;
public final class lb extends c8.ja {
    public org.telegram.messenger.ij f47498a;
    public int f47499b = 0;
    public boolean f47500c = true;
    public int d = 0;
    public int f47501e;
    public final mb f47502f;

    public lb(mb mbVar) {
        this.f47502f = mbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.ij ijVar = this.f47498a;
        mb mbVar = this.f47502f;
        if (ijVar != null) {
            int indexOf = mbVar.f47762o0.indexOf(ijVar) + mbVar.E.f46918f;
            if (indexOf >= 0) {
                mbVar.f47776y.i1(indexOf, this.f47501e, false);
            }
        } else {
            mbVar.f47776y.i1(this.f47499b, this.d, this.f47500c);
        }
        this.f47498a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new gq0(this, 21));
    }

    @Override
    public final void c() {
        mb mbVar = this.f47502f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f47502f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
