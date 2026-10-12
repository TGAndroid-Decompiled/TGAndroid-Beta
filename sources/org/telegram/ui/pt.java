package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pt extends org.telegram.ui.ActionBar.m1 {
    public final qt f41093o;

    public pt(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f41093o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f41093o.f41433a;
        utVar.f42579k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
