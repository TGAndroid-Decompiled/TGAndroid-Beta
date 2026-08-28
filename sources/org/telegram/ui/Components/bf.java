package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bf extends org.telegram.ui.ActionBar.o1 {
    public final ChatActivityEnterView f27193o;

    public bf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f27193o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f27193o.F0.invalidate();
    }
}
