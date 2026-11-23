package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf extends org.telegram.ui.ActionBar.g1 {
    public final ChatActivityEnterView f34195o;

    public cf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f34195o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f34195o.K0.invalidate();
    }
}
