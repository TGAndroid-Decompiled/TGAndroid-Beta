package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ot extends org.telegram.ui.ActionBar.m1 {
    public final qt f40771o;

    public ot(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f40771o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f40771o.f41433a;
        utVar.f42579k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
