package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f38290a;

    public hb0(LaunchActivity launchActivity) {
        this.f38290a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38290a.onBackPressed();
        } else if (!this.f38290a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38290a;
            ActionBarLayout actionBarLayout = launchActivity.f33845q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20325c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20325c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
