package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements OnBackAnimationCallback {
    public boolean f38879b;
    public boolean e;
    public final LaunchActivity f38881f;
    public final AnimationNotificationsLocker f38878a = new AnimationNotificationsLocker();
    public boolean f38880c = false;
    public boolean d = false;

    public la0(LaunchActivity launchActivity) {
        this.f38881f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f38880c = false;
        this.d = false;
        if (this.f38879b) {
            this.f38878a.unlock();
            this.f38879b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f38881f.f33190q0) != null && actionBarLayout.f20558c1) {
            actionBarLayout.f20558c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f38879b) {
            this.f38878a.unlock();
            this.f38879b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f38881f.onBackPressed();
        } else if (!this.f38881f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38881f;
            ActionBarLayout actionBarLayout = launchActivity.f33190q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20558c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20558c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f38880c = true;
        this.d = false;
        this.e = false;
    }
}
