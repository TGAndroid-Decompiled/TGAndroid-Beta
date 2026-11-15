package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hs extends org.telegram.ui.ActionBar.g1 {
    public final js f47807o;

    public hs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f47807o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f47807o.f48406a;
        nsVar.f49655k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
