package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackInvokedCallback {
    public final LaunchActivity f34070a;

    public jb0(LaunchActivity launchActivity) {
        this.f34070a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f34070a.onBackPressed();
        } else if (!this.f34070a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f34070a;
            ActionBarLayout actionBarLayout = launchActivity.f29957q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f17477c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f17477c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
