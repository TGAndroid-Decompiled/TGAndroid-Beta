package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pt extends org.telegram.ui.ActionBar.o1 {
    public final qt f36731o;

    public pt(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f36731o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f36731o.f37022a;
        utVar.f38212k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
