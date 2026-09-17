package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f37315b;
    public boolean f37317e;
    public final LaunchActivity f37318f;
    public final AnimationNotificationsLocker f37314a = new AnimationNotificationsLocker();
    public boolean f37316c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f37318f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37316c = false;
        this.d = false;
        if (this.f37315b) {
            this.f37314a.unlock();
            this.f37315b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37318f.f33481q0) != null && actionBarLayout.f20173c1) {
            actionBarLayout.f20173c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37315b) {
            this.f37314a.unlock();
            this.f37315b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37318f.onBackPressed();
        } else if (!this.f37318f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37318f;
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

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37316c = true;
        this.d = false;
        this.f37317e = false;
    }
}
