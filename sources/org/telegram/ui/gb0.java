package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f36549b;
    public boolean f36551e;
    public final LaunchActivity f36552f;
    public final AnimationNotificationsLocker f36548a = new AnimationNotificationsLocker();
    public boolean f36550c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f36552f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f36550c = false;
        this.d = false;
        if (this.f36549b) {
            this.f36548a.unlock();
            this.f36549b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f36552f.f33798q0) != null && actionBarLayout.f20315c1) {
            actionBarLayout.f20315c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f36549b) {
            this.f36548a.unlock();
            this.f36549b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f36552f.onBackPressed();
        } else if (!this.f36552f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f36552f;
            ActionBarLayout actionBarLayout = launchActivity.f33798q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20315c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20315c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f36550c = true;
        this.d = false;
        this.f36551e = false;
    }
}
