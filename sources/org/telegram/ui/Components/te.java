package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class te extends org.telegram.ui.ActionBar.g1 {
    public final ChatActivityEnterView f39679o;

    public te(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39679o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f39679o.K0.invalidate();
    }
}
