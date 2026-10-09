package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f38244a;

    public hb0(LaunchActivity launchActivity) {
        this.f38244a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38244a.onBackPressed();
        } else if (!this.f38244a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38244a;
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
