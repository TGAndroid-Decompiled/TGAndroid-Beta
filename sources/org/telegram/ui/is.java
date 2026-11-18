package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class is extends org.telegram.ui.ActionBar.h1 {
    public final js f48789o;

    public is(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f48789o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f48789o.f49050a;
        nsVar.f50286k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
