package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackInvokedCallback {
    public final LaunchActivity f34847a;

    public jb0(LaunchActivity launchActivity) {
        this.f34847a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f34847a.onBackPressed();
        } else if (!this.f34847a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f34847a;
            ActionBarLayout actionBarLayout = launchActivity.f30844q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18386c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18386c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
