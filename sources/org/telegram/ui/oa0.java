package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oa0 implements OnBackInvokedCallback {
    public final LaunchActivity f39699a;

    public oa0(LaunchActivity launchActivity) {
        this.f39699a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f39699a.onBackPressed();
        } else if (!this.f39699a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39699a;
            ActionBarLayout actionBarLayout = launchActivity.f33173q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20550c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20550c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
