package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lf extends org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f28356o;

    public lf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f28356o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f28356o.J0.invalidate();
    }
}
