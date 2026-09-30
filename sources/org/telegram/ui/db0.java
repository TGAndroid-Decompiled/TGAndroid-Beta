package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class db0 implements OnBackInvokedCallback {
    public final LaunchActivity f33150a;

    public db0(LaunchActivity launchActivity) {
        this.f33150a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f33150a.onBackPressed();
        } else if (!this.f33150a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f33150a;
            ActionBarLayout actionBarLayout = launchActivity.f31204q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18627c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18627c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
