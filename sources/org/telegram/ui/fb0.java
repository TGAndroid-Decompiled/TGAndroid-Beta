package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fb0 implements OnBackAnimationCallback {
    public boolean f33470b;
    public boolean e;
    public final LaunchActivity f33472f;
    public final AnimationNotificationsLocker f33469a = new AnimationNotificationsLocker();
    public boolean f33471c = false;
    public boolean d = false;

    public fb0(LaunchActivity launchActivity) {
        this.f33472f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f33471c = false;
        this.d = false;
        if (this.f33470b) {
            this.f33469a.unlock();
            this.f33470b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f33472f.f31132q0) != null && actionBarLayout.f18604c1) {
            actionBarLayout.f18604c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f33470b) {
            this.f33469a.unlock();
            this.f33470b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f33472f.onBackPressed();
        } else if (!this.f33472f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f33472f;
            ActionBarLayout actionBarLayout = launchActivity.f31132q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18604c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18604c1 = false;
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
        this.f33471c = true;
        this.d = false;
        this.e = false;
    }
}
