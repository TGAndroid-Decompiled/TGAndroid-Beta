package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackInvokedCallback {
    public final LaunchActivity f38834a;

    public ib0(LaunchActivity launchActivity) {
        this.f38834a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38834a.onBackPressed();
        } else if (!this.f38834a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38834a;
            ActionBarLayout actionBarLayout = launchActivity.f33644q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20088c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20088c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
