package org.telegram.ui;

import android.view.ViewGroup;
public final class lt extends org.telegram.ui.ActionBar.m1 {
    public final qt f39842o;

    public lt(qt qtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f39842o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f39842o.f41433a;
        utVar.f42579k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
