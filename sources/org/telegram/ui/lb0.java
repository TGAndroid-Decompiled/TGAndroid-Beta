package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lb0 implements OnBackInvokedCallback {
    public final LaunchActivity f35396a;

    public lb0(LaunchActivity launchActivity) {
        this.f35396a = launchActivity;
    }

    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.f35396a.onBackPressed();
        } else if (!this.f35396a.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35396a;
            ActionBarLayout actionBarLayout = launchActivity.f31128q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18603c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18603c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}
