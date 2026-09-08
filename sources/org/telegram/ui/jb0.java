package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackInvokedCallback {
    public final LaunchActivity f37770a;

    public jb0(LaunchActivity launchActivity) {
        this.f37770a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f37770a.onBackPressed();
        } else if (!this.f37770a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37770a;
            ActionBarLayout actionBarLayout = launchActivity.f33480q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20172c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20172c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
