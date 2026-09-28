package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f35433a;

    public lz(ExternalActionActivity externalActionActivity) {
        this.f35433a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f35433a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f31080c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
