package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ko extends org.telegram.ui.ActionBar.m1 {
    public final mo f28040o;

    public ko(mo moVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28040o = moVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.sn snVar = this.f28040o.G;
        if (snVar != null) {
            snVar.getClass();
            snVar.j8(false, true, 0.0f);
        }
    }
}
