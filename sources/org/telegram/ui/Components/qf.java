package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qf extends org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f29828o;

    public qf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29828o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f29828o.J0.invalidate();
    }
}
