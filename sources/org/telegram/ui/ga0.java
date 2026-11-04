package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ga0 extends org.telegram.ui.ActionBar.f1 {
    public final la0 f45612o;

    public ga0(la0 la0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f45612o = la0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f45612o.K0 = null;
    }
}
