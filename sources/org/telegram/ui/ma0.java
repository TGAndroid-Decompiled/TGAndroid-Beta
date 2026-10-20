package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ma0 implements OnBackInvokedCallback {
    public final LaunchActivity f39166a;

    public ma0(LaunchActivity launchActivity) {
        this.f39166a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f39166a.onBackPressed();
        } else if (!this.f39166a.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39166a;
            ActionBarLayout actionBarLayout = launchActivity.f33185q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20554c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20554c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
