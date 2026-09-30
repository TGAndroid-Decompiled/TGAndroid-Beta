package org.telegram.ui.ActionBar;

import android.view.ViewTreeObserver;
public final class h1 implements ViewTreeObserver.OnScrollChangedListener {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f18972a;

    public h1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f18972a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onScrollChanged() {
        this.f18972a.invalidate();
    }
}
