package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kb0 implements OnBackInvokedCallback {
    public final LaunchActivity f35030a;

    public kb0(LaunchActivity launchActivity) {
        this.f35030a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f35030a.onBackPressed();
        } else if (!this.f35030a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35030a;
            ActionBarLayout actionBarLayout = launchActivity.f31088q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18571c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18571c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
