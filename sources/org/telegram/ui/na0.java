package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class na0 implements OnBackAnimationCallback {
    public boolean f40680b;
    public boolean f40682e;
    public final LaunchActivity f40683f;
    public final AnimationNotificationsLocker f40679a = new AnimationNotificationsLocker();
    public boolean f40681c = false;
    public boolean d = false;

    public na0(LaunchActivity launchActivity) {
        this.f40683f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f40681c = false;
        this.d = false;
        if (this.f40680b) {
            this.f40679a.unlock();
            this.f40680b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f40683f.m0) != null && actionBarLayout.Y0) {
            actionBarLayout.Y0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f40680b) {
            this.f40679a.unlock();
            this.f40680b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f40683f.onBackPressed();
        } else if (!this.f40683f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f40683f;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.na0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f40681c = true;
        this.d = false;
        this.f40682e = false;
    }
}
