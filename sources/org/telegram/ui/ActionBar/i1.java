package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
public final class i1 implements ViewTreeObserver.OnScrollChangedListener {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f20715a;

    public i1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f20715a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onScrollChanged() {
        this.f20715a.invalidate();
    }
}
