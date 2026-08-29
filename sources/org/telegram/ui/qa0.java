package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qa0 implements OnBackAnimationCallback {
    public boolean f41606b;
    public boolean f41608e;
    public final LaunchActivity f41609f;
    public final AnimationNotificationsLocker f41605a = new AnimationNotificationsLocker();
    public boolean f41607c = false;
    public boolean d = false;

    public qa0(LaunchActivity launchActivity) {
        this.f41609f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f41607c = false;
        this.d = false;
        if (this.f41606b) {
            this.f41605a.unlock();
            this.f41606b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f41609f.m0) != null && actionBarLayout.Y0) {
            actionBarLayout.Y0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f41606b) {
            this.f41605a.unlock();
            this.f41606b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f41609f.onBackPressed();
        } else if (!this.f41609f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f41609f;
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Y0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qa0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f41607c = true;
        this.d = false;
        this.f41608e = false;
    }
}
