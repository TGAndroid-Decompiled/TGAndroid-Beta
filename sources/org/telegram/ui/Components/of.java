package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class of extends org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f29395o;

    public of(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29395o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f29395o.J0.invalidate();
    }
}
