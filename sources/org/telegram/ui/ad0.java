package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ad0 extends org.telegram.ui.ActionBar.n1 {
    public final id0 f34414o;

    public ad0(id0 id0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34414o = id0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34414o.I0 = null;
    }
}
