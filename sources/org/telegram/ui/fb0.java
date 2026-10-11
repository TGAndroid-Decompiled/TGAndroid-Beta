package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fb0 implements OnBackAnimationCallback {
    public boolean f37664b;
    public boolean f37666e;
    public final LaunchActivity f37667f;
    public final AnimationNotificationsLocker f37663a = new AnimationNotificationsLocker();
    public boolean f37665c = false;
    public boolean d = false;

    public fb0(LaunchActivity launchActivity) {
        this.f37667f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37665c = false;
        this.d = false;
        if (this.f37664b) {
            this.f37663a.unlock();
            this.f37664b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37667f.f33869q0) != null && actionBarLayout.f20351c1) {
            actionBarLayout.f20351c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37664b) {
            this.f37663a.unlock();
            this.f37664b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37667f.onBackPressed();
        } else if (!this.f37667f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37667f;
            ActionBarLayout actionBarLayout = launchActivity.f33869q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20351c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20351c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37665c = true;
        this.d = false;
        this.f37666e = false;
    }
}
