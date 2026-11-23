package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hs extends org.telegram.ui.ActionBar.g1 {
    public final js f48519o;

    public hs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48519o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f48519o.f49087a;
        nsVar.f50297k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
