package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mo extends org.telegram.ui.ActionBar.m1 {
    public final oo f28569o;

    public mo(oo ooVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28569o = ooVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.sn snVar = this.f28569o.G;
        if (snVar != null) {
            snVar.getClass();
            snVar.j8(false, true, 0.0f);
        }
    }
}
