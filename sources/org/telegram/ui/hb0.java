package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37028a;

    public hb0(LaunchActivity launchActivity) {
        this.f37028a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37028a.onBackPressed();
        } else if (!this.f37028a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37028a;
            ActionBarLayout actionBarLayout = launchActivity.f33797q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20314c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20314c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
