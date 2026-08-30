package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jt extends org.telegram.ui.ActionBar.p1 {
    public final lt f35487o;

    public jt(lt ltVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f35487o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f35487o.f36133a;
        ptVar.f37523k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
