package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class na0 implements OnBackAnimationCallback {
    public boolean f39403b;
    public boolean e;
    public final LaunchActivity f39405f;
    public final AnimationNotificationsLocker f39402a = new AnimationNotificationsLocker();
    public boolean f39404c = false;
    public boolean d = false;

    public na0(LaunchActivity launchActivity) {
        this.f39405f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f39404c = false;
        this.d = false;
        if (this.f39403b) {
            this.f39402a.unlock();
            this.f39403b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f39405f.f33173q0) != null && actionBarLayout.f20550c1) {
            actionBarLayout.f20550c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f39403b) {
            this.f39402a.unlock();
            this.f39403b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f39405f.onBackPressed();
        } else if (!this.f39405f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39405f;
            ActionBarLayout actionBarLayout = launchActivity.f33173q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20550c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20550c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.na0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f39404c = true;
        this.d = false;
        this.e = false;
    }
}
