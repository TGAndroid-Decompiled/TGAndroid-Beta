package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oa0 implements OnBackInvokedCallback {
    public final LaunchActivity f41036a;

    public oa0(LaunchActivity launchActivity) {
        this.f41036a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f41036a.onBackPressed();
        } else if (!this.f41036a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f41036a;
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Y0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
