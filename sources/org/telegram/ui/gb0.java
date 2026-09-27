package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackInvokedCallback {
    public final LaunchActivity f33895a;

    public gb0(LaunchActivity launchActivity) {
        this.f33895a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f33895a.onBackPressed();
        } else if (!this.f33895a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f33895a;
            ActionBarLayout actionBarLayout = launchActivity.f31132q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18604c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18604c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
