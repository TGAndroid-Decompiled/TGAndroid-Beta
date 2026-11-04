package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f48139a;

    public nx(ExternalActionActivity externalActionActivity) {
        this.f48139a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f48139a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f41257c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
