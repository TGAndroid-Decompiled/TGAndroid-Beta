package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fo extends org.telegram.ui.ActionBar.n1 {
    public final ho f26550o;

    public fo(ho hoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f26550o = hoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.yn ynVar = this.f26550o.G;
        if (ynVar != null) {
            ynVar.getClass();
            ynVar.g8(false, true, 0.0f);
        }
    }
}
