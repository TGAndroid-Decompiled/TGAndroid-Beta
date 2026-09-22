package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cd0 extends org.telegram.ui.ActionBar.n1 {
    public final kd0 f32732o;

    public cd0(kd0 kd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32732o = kd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f32732o.I0 = null;
    }
}
