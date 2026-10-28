package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jc0 extends org.telegram.ui.ActionBar.o1 {
    public final rc0 f40508o;

    public jc0(rc0 rc0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40508o = rc0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f40508o.H0 = null;
    }
}
