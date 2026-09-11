package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ad0 extends org.telegram.ui.ActionBar.n1 {
    public final id0 f34387o;

    public ad0(id0 id0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34387o = id0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34387o.I0 = null;
    }
}
