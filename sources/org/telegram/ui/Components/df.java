package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class df extends org.telegram.ui.ActionBar.g1 {
    public final ChatActivityEnterView f34316o;

    public df(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34316o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34316o.K0.invalidate();
    }
}
