package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lb0 implements OnBackInvokedCallback {
    public final LaunchActivity f35497a;

    public lb0(LaunchActivity launchActivity) {
        this.f35497a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f35497a.onBackPressed();
        } else if (!this.f35497a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35497a;
            ActionBarLayout actionBarLayout = launchActivity.f30861q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18396c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18396c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
