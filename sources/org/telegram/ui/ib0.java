package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f37314b;
    public boolean f37316e;
    public final LaunchActivity f37317f;
    public final AnimationNotificationsLocker f37313a = new AnimationNotificationsLocker();
    public boolean f37315c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f37317f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37315c = false;
        this.d = false;
        if (this.f37314b) {
            this.f37313a.unlock();
            this.f37314b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37317f.f33480q0) != null && actionBarLayout.f20172c1) {
            actionBarLayout.f20172c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37314b) {
            this.f37313a.unlock();
            this.f37314b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37317f.onBackPressed();
        } else if (!this.f37317f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37317f;
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

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37315c = true;
        this.d = false;
        this.f37316e = false;
    }
}
