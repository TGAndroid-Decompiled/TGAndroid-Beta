package org.telegram.ui;

import android.view.ViewGroup;
public final class kt extends org.telegram.ui.ActionBar.p1 {
    public final pt f34457o;

    public kt(pt ptVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34457o = ptVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        tt ttVar = this.f34457o.f35899a;
        ttVar.f37025k = null;
        ttVar.K = false;
        if (ttVar.R) {
            ttVar.n();
        }
    }
}
