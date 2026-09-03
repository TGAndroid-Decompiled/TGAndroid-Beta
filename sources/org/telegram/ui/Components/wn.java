package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wn extends org.telegram.ui.ActionBar.p1 {
    public final yn f30320o;

    public wn(yn ynVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30320o = ynVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.f30320o.D;
        if (znVar != null) {
            znVar.getClass();
            znVar.g8(false, true, 0.0f);
        }
    }
}
