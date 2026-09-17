package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ot extends org.telegram.ui.ActionBar.o1 {
    public final qt f36421o;

    public ot(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36421o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f36421o.f37017a;
        utVar.f38207k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
