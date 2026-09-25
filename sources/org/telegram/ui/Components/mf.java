package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mf extends org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f26482o;

    public mf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f26482o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f26482o.J0.invalidate();
    }
}
