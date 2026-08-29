package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class az implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f36636a;

    public az(ExternalActionActivity externalActionActivity) {
        this.f36636a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f36636a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f35536c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
