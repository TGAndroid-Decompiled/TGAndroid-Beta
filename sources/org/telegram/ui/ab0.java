package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ab0 implements OnBackInvokedCallback {
    public final LaunchActivity f35110a;

    public ab0(LaunchActivity launchActivity) {
        this.f35110a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f35110a.onBackPressed();
        } else if (!this.f35110a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35110a;
            ActionBarLayout actionBarLayout = launchActivity.f34160n0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Z0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
