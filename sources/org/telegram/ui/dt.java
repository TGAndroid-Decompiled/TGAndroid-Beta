package org.telegram.ui;

import android.view.ViewGroup;
public final class dt extends org.telegram.ui.ActionBar.m1 {
    public final jt f33274o;

    public dt(jt jtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f33274o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f33274o.f34957a;
        ntVar.f36122k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
