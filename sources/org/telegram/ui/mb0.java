package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class mb0 implements OnBackInvokedCallback {
    public final LaunchActivity f38213a;

    public mb0(LaunchActivity launchActivity) {
        this.f38213a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f38213a.onBackPressed();
        } else if (!this.f38213a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38213a;
            ActionBarLayout actionBarLayout = launchActivity.f32133q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f19497c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f19497c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
