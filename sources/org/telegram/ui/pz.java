package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f39657a;

    public pz(ExternalActionActivity externalActionActivity) {
        this.f39657a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f39657a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33399c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
