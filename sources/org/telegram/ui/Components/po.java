package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class po extends org.telegram.ui.ActionBar.m1 {
    public final ro f28082o;

    public po(ro roVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28082o = roVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.fo foVar = this.f28082o.G;
        if (foVar != null) {
            foVar.getClass();
            foVar.j8(false, true, 0.0f);
        }
    }
}
