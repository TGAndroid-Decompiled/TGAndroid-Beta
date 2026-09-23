package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class eb0 implements OnBackInvokedCallback {
    public final LaunchActivity f32883a;

    public eb0(LaunchActivity launchActivity) {
        this.f32883a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f32883a.onBackPressed();
        } else if (!this.f32883a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32883a;
            ActionBarLayout actionBarLayout = launchActivity.f30815q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18358c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18358c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
