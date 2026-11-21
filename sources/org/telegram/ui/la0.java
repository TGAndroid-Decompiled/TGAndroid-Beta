package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class la0 extends org.telegram.ui.ActionBar.g1 {
    public final qa0 f49538o;

    public la0(qa0 qa0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f49538o = qa0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f49538o.P0 = null;
    }
}
