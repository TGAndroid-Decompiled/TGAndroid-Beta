package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f35853a;

    public kz(ExternalActionActivity externalActionActivity) {
        this.f35853a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f35853a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f31591c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
