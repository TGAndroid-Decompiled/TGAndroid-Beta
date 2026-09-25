package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class co extends org.telegram.ui.ActionBar.m1 {
    public final fo f23367o;

    public co(fo foVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f23367o = foVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.f23367o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.g8(false, true, 0.0f);
        }
    }
}
