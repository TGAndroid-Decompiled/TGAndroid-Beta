package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ad0 extends org.telegram.ui.ActionBar.p1 {
    public final id0 f30900o;

    public ad0(id0 id0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30900o = id0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f30900o.I0 = null;
    }
}
