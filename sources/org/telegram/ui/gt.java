package org.telegram.ui;

import android.view.ViewGroup;
public final class gt extends org.telegram.ui.ActionBar.m1 {
    public final mt f38193o;

    public gt(mt mtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f38193o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f38193o.f40107a;
        qtVar.f41277k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
