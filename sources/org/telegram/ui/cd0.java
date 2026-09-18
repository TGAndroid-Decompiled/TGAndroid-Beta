package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cd0 extends org.telegram.ui.ActionBar.o1 {
    public final kd0 f32762o;

    public cd0(kd0 kd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32762o = kd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f32762o.I0 = null;
    }
}
