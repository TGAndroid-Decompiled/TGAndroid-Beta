package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class eo extends org.telegram.ui.ActionBar.m1 {
    public final go f24025o;

    public eo(go goVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f24025o = goVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.f24025o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.g8(false, true, 0.0f);
        }
    }
}
