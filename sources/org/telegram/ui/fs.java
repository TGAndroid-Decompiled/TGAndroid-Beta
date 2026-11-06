package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fs extends org.telegram.ui.ActionBar.g1 {
    public final gs f45693o;

    public fs(gs gsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45693o = gsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ks ksVar = this.f45693o.f46062a;
        ksVar.f47256k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
