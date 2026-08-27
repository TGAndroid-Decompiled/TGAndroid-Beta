package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class xe extends org.telegram.ui.ActionBar.n1 {

    public final ChatActivityEnterView f34607o;

    public xe(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34607o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34607o.F0.invalidate();
    }
}
