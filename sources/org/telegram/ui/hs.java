package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hs extends org.telegram.ui.ActionBar.g1 {
    public final is f46402o;

    public hs(is isVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46402o = isVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ms msVar = this.f46402o.f46750a;
        msVar.f47969k = null;
        msVar.K = false;
        if (msVar.R) {
            msVar.m();
        }
    }
}
