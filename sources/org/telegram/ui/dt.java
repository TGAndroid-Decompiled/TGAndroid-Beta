package org.telegram.ui;

import android.view.ViewGroup;
public final class dt extends org.telegram.ui.ActionBar.m1 {
    public final jt f33190o;

    public dt(jt jtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f33190o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f33190o.f34866a;
        ntVar.f35983k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
