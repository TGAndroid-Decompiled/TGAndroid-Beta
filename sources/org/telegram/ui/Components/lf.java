package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lf extends org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f26131o;

    public lf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f26131o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f26131o.J0.invalidate();
    }
}
