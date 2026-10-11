package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f40409a;

    public nz(ExternalActionActivity externalActionActivity) {
        this.f40409a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f40409a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33815c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
