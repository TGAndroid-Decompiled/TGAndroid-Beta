package org.telegram.ui;

import android.view.ViewGroup;
public final class ot extends org.telegram.ui.ActionBar.m1 {
    public final tt f38746o;

    public ot(tt ttVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f38746o = ttVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xt xtVar = this.f38746o.f40207a;
        xtVar.f41646k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
    }
}
