package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class re extends org.telegram.ui.ActionBar.f1 {
    public final ChatActivityEnterView f37711o;

    public re(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f37711o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f37711o.K0.invalidate();
    }
}
