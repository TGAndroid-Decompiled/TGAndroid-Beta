package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37053a;

    public hb0(LaunchActivity launchActivity) {
        this.f37053a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37053a.onBackPressed();
        } else if (!this.f37053a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37053a;
            ActionBarLayout actionBarLayout = launchActivity.f33817q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20324c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20324c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
