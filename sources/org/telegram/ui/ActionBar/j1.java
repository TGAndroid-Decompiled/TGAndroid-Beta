package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
public final class j1 implements ViewTreeObserver.OnScrollChangedListener {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f22728a;

    public j1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f22728a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onScrollChanged() {
        this.f22728a.invalidate();
    }
}
