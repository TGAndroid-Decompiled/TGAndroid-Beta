package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class so extends org.telegram.ui.ActionBar.m1 {
    public final uo f30901o;

    public so(uo uoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30901o = uoVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.f30901o.G;
        if (znVar != null) {
            znVar.getClass();
            znVar.j8(false, true, 0.0f);
        }
    }
}
