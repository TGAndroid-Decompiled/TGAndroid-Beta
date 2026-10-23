package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mo extends org.telegram.ui.ActionBar.m1 {
    public final oo f28581o;

    public mo(oo ooVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28581o = ooVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.qn qnVar = this.f28581o.G;
        if (qnVar != null) {
            qnVar.getClass();
            qnVar.j8(false, true, 0.0f);
        }
    }
}
