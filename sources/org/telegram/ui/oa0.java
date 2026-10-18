package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oa0 implements OnBackInvokedCallback {
    public final LaunchActivity f39720a;

    public oa0(LaunchActivity launchActivity) {
        this.f39720a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f39720a.onBackPressed();
        } else if (!this.f39720a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39720a;
            ActionBarLayout actionBarLayout = launchActivity.f33180q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20557c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20557c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
