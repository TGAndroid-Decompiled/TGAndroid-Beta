package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ds extends org.telegram.ui.ActionBar.f1 {
    public final es f44805o;

    public ds(es esVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44805o = esVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        is isVar = this.f44805o.f45025a;
        isVar.f46395k = null;
        isVar.K = false;
        if (isVar.R) {
            isVar.m();
        }
    }
}
