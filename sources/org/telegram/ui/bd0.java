package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bd0 extends org.telegram.ui.ActionBar.n1 {
    public final jd0 f32344o;

    public bd0(jd0 jd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32344o = jd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f32344o.I0 = null;
    }
}
