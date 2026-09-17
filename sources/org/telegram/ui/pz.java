package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f39658a;

    public pz(ExternalActionActivity externalActionActivity) {
        this.f39658a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f39658a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33400c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
