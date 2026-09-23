package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class mz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f35409a;

    public mz(ExternalActionActivity externalActionActivity) {
        this.f35409a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f35409a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f30764c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
