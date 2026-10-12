package org.telegram.ui;

import android.view.ViewGroup;
public final class lt extends org.telegram.ui.ActionBar.m1 {
    public final qt f39839o;

    public lt(qt qtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f39839o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f39839o.f41429a;
        utVar.f42577k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
