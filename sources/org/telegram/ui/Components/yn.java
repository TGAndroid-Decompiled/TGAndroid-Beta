package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yn extends org.telegram.ui.ActionBar.h1 {
    public final ao f42546o;

    public yn(ao aoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f42546o = aoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.bn bnVar = this.f42546o.H;
        if (bnVar != null) {
            bnVar.getClass();
            bnVar.x8(false, true, 0.0f);
        }
    }
}
