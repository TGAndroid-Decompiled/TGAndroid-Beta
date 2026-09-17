package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lb0 implements OnBackInvokedCallback {
    public final LaunchActivity f35492a;

    public lb0(LaunchActivity launchActivity) {
        this.f35492a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f35492a.onBackPressed();
        } else if (!this.f35492a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35492a;
            ActionBarLayout actionBarLayout = launchActivity.f30858q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18395c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18395c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
