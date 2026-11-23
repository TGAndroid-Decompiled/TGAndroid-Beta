package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class is extends org.telegram.ui.ActionBar.g1 {
    public final js f48815o;

    public is(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48815o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f48815o.f49087a;
        nsVar.f50297k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
