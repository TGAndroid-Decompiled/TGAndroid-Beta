package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37034a;

    public hb0(LaunchActivity launchActivity) {
        this.f37034a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37034a.onBackPressed();
        } else if (!this.f37034a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37034a;
            ActionBarLayout actionBarLayout = launchActivity.f33804q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20319c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20319c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
