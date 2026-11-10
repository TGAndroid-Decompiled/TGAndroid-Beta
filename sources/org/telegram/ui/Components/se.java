package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class se extends org.telegram.ui.ActionBar.g1 {
    public final ChatActivityEnterView f37964o;

    public se(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37964o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f37964o.J0.invalidate();
    }
}
