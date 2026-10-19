package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ma0 implements OnBackInvokedCallback {
    public final LaunchActivity f39195a;

    public ma0(LaunchActivity launchActivity) {
        this.f39195a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f39195a.onBackPressed();
        } else if (!this.f39195a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39195a;
            ActionBarLayout actionBarLayout = launchActivity.f33179q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20553c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20553c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
