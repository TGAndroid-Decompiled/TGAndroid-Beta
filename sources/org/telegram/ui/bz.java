package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class bz implements ViewTreeObserver.OnGlobalLayoutListener {

    public final ExternalActionActivity f36897a;

    public bz(ExternalActionActivity externalActionActivity) {
        this.f36897a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f36897a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f35472c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
