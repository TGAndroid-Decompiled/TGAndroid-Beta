package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackInvokedCallback {
    public final LaunchActivity f38837a;

    public ib0(LaunchActivity launchActivity) {
        this.f38837a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38837a.onBackPressed();
        } else if (!this.f38837a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38837a;
            ActionBarLayout actionBarLayout = launchActivity.f33646q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20089c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20089c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
