package org.telegram.ui;

import android.view.ViewGroup;
public final class dt extends org.telegram.ui.ActionBar.m1 {
    public final jt f33164o;

    public dt(jt jtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f33164o = jtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        nt ntVar = this.f33164o.f34854a;
        ntVar.f35960k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
