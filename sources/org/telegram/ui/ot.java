package org.telegram.ui;

import android.view.ViewGroup;
public final class ot extends org.telegram.ui.ActionBar.m1 {
    public final tt f39035o;

    public ot(tt ttVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f39035o = ttVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xt xtVar = this.f39035o.f40483a;
        xtVar.f41942k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
    }
}
