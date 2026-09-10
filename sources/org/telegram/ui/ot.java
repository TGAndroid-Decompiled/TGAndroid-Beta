package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ot extends org.telegram.ui.ActionBar.p1 {
    public final pt f35596o;

    public ot(pt ptVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35596o = ptVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        tt ttVar = this.f35596o.f35899a;
        ttVar.f37025k = null;
        ttVar.K = false;
        if (ttVar.R) {
            ttVar.n();
        }
    }
}
