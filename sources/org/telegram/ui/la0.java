package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements OnBackAnimationCallback {
    public boolean f38875b;
    public boolean e;
    public final LaunchActivity f38877f;
    public final AnimationNotificationsLocker f38874a = new AnimationNotificationsLocker();
    public boolean f38876c = false;
    public boolean d = false;

    public la0(LaunchActivity launchActivity) {
        this.f38877f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f38876c = false;
        this.d = false;
        if (this.f38875b) {
            this.f38874a.unlock();
            this.f38875b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f38877f.f33186q0) != null && actionBarLayout.f20554c1) {
            actionBarLayout.f20554c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f38875b) {
            this.f38874a.unlock();
            this.f38875b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f38877f.onBackPressed();
        } else if (!this.f38877f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38877f;
            ActionBarLayout actionBarLayout = launchActivity.f33186q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20554c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20554c1 = false;
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
        this.f38876c = true;
        this.d = false;
        this.e = false;
    }
}
