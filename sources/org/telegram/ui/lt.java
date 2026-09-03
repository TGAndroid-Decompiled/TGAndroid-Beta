package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lt extends org.telegram.ui.ActionBar.p1 {
    public final mt f38770o;

    public lt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38770o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f38770o.f39067a;
        qtVar.f40656k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
