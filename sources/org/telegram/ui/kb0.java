package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kb0 implements OnBackAnimationCallback {
    public boolean f35101b;
    public boolean e;
    public final LaunchActivity f35103f;
    public final AnimationNotificationsLocker f35100a = new AnimationNotificationsLocker();
    public boolean f35102c = false;
    public boolean d = false;

    public kb0(LaunchActivity launchActivity) {
        this.f35103f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f35102c = false;
        this.d = false;
        if (this.f35101b) {
            this.f35100a.unlock();
            this.f35101b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f35103f.f31149q0) != null && actionBarLayout.f18618c1) {
            actionBarLayout.f18618c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f35101b) {
            this.f35100a.unlock();
            this.f35101b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f35103f.onBackPressed();
        } else if (!this.f35103f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35103f;
            ActionBarLayout actionBarLayout = launchActivity.f31149q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18618c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18618c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f35102c = true;
        this.d = false;
        this.e = false;
    }
}
