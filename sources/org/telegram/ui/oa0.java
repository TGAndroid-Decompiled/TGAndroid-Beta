package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oa0 implements OnBackInvokedCallback {
    public final LaunchActivity f39712a;

    public oa0(LaunchActivity launchActivity) {
        this.f39712a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f39712a.onBackPressed();
        } else if (!this.f39712a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39712a;
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
