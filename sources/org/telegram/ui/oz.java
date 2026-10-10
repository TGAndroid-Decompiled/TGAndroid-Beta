package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f40667a;

    public oz(ExternalActionActivity externalActionActivity) {
        this.f40667a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f40667a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33791c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
