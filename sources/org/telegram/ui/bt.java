package org.telegram.ui;

import android.view.ViewGroup;
public final class bt extends org.telegram.ui.ActionBar.k1 {
    public final gt f36299o;

    public bt(gt gtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f36299o = gtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lt ltVar = this.f36299o.f37643a;
        ltVar.f39395k = null;
        ltVar.K = false;
        if (ltVar.R) {
            ltVar.m();
        }
    }
}
