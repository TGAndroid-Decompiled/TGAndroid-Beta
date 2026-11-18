package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cf extends org.telegram.ui.ActionBar.h1 {
    public final ChatActivityEnterView f33985o;

    public cf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33985o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f33985o.K0.invalidate();
    }
}
