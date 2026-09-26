package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class db0 implements OnBackInvokedCallback {
    public final LaunchActivity f33072a;

    public db0(LaunchActivity launchActivity) {
        this.f33072a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f33072a.onBackPressed();
        } else if (!this.f33072a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f33072a;
            ActionBarLayout actionBarLayout = launchActivity.f31130q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18610c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18610c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
