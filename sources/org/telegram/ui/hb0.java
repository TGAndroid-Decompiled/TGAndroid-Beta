package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37029a;

    public hb0(LaunchActivity launchActivity) {
        this.f37029a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37029a.onBackPressed();
        } else if (!this.f37029a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37029a;
            ActionBarLayout actionBarLayout = launchActivity.f33798q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20315c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20315c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
