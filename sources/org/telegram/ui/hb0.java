package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f38246a;

    public hb0(LaunchActivity launchActivity) {
        this.f38246a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38246a.onBackPressed();
        } else if (!this.f38246a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38246a;
            ActionBarLayout actionBarLayout = launchActivity.f33807q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20321c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20321c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
