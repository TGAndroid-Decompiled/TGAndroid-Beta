package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kt extends org.telegram.ui.ActionBar.p1 {
    public final mt f38421o;

    public kt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38421o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f38421o.f39067a;
        qtVar.f40656k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
