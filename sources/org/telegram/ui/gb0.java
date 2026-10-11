package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackInvokedCallback {
    public final LaunchActivity f38004a;

    public gb0(LaunchActivity launchActivity) {
        this.f38004a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38004a.onBackPressed();
        } else if (!this.f38004a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38004a;
            ActionBarLayout actionBarLayout = launchActivity.f33835q0;
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
