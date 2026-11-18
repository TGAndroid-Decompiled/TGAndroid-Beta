package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hs extends org.telegram.ui.ActionBar.h1 {
    public final js f48472o;

    public hs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48472o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f48472o.f49050a;
        nsVar.f50286k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
