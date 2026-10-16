package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37674a;

    public lb0(LaunchActivity launchActivity) {
        this.f37674a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37674a.onBackPressed();
        } else if (!this.f37674a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37674a;
            ActionBarLayout actionBarLayout = launchActivity.f31835q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f19197c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f19197c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
