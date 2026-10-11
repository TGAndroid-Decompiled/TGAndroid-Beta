package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ExternalActionActivity f40375a;

    public nz(ExternalActionActivity externalActionActivity) {
        this.f40375a = externalActionActivity;
    }

    @Override
    public final void onGlobalLayout() {
        ExternalActionActivity externalActionActivity = this.f40375a;
        externalActionActivity.f();
        ActionBarLayout actionBarLayout = externalActionActivity.f33781c;
        if (actionBarLayout != null) {
            actionBarLayout.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
