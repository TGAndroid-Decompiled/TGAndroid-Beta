package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class te extends org.telegram.ui.ActionBar.g1 {
    public final ChatActivityEnterView f38390o;

    public te(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38390o = chatActivityEnterView;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f38390o.J0.invalidate();
    }
}
