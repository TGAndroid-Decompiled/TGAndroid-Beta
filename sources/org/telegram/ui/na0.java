package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class na0 implements OnBackAnimationCallback {
    public boolean f39388b;
    public boolean e;
    public final LaunchActivity f39390f;
    public final AnimationNotificationsLocker f39387a = new AnimationNotificationsLocker();
    public boolean f39389c = false;
    public boolean d = false;

    public na0(LaunchActivity launchActivity) {
        this.f39390f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f39389c = false;
        this.d = false;
        if (this.f39388b) {
            this.f39387a.unlock();
            this.f39388b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f39390f.f33173q0) != null && actionBarLayout.f20550c1) {
            actionBarLayout.f20550c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f39388b) {
            this.f39387a.unlock();
            this.f39388b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f39390f.onBackPressed();
        } else if (!this.f39390f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39390f;
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
        this.f39389c = true;
        this.d = false;
        this.e = false;
    }
}
