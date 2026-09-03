package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bb0 implements OnBackInvokedCallback {
    public final LaunchActivity f32829a;

    public bb0(LaunchActivity launchActivity) {
        this.f32829a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f32829a.onBackPressed();
        } else if (!this.f32829a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32829a;
            ActionBarLayout actionBarLayout = launchActivity.f31612n0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Z0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
