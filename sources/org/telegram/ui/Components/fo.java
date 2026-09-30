package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fo extends org.telegram.ui.ActionBar.m1 {
    public final ho f24322o;

    public fo(ho hoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f24322o = hoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.f24322o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.g8(false, true, 0.0f);
        }
    }
}
