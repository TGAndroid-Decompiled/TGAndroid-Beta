package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pt extends org.telegram.ui.ActionBar.o1 {
    public final qt f36726o;

    public pt(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36726o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f36726o.f37017a;
        utVar.f38207k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
