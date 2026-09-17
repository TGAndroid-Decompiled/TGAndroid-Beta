package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37744a;

    public jb0(LaunchActivity launchActivity) {
        this.f37744a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37744a.onBackPressed();
        } else if (!this.f37744a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37744a;
            ActionBarLayout actionBarLayout = launchActivity.f33454q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20146c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20146c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
