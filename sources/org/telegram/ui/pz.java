package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f36725a;

    public pz(ExternalActionActivity externalActionActivity) {
        this.f36725a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f36725a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f31077c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
