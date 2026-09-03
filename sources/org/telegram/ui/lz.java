package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f38820a;

    public lz(ExternalActionActivity externalActionActivity) {
        this.f38820a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f38820a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f34110c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
