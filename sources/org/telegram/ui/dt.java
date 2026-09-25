package org.telegram.ui;

import android.view.ViewGroup;
public final class dt extends org.telegram.ui.ActionBar.m1 {
    public final jt f33192o;

    public dt(jt jtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f33192o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f33192o.f34868a;
        ntVar.f35985k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
