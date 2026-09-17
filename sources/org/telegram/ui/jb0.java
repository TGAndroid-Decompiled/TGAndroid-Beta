package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37771a;

    public jb0(LaunchActivity launchActivity) {
        this.f37771a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37771a.onBackPressed();
        } else if (!this.f37771a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37771a;
            ActionBarLayout actionBarLayout = launchActivity.f33481q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20173c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20173c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
