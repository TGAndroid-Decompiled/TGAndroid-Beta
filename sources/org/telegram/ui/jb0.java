package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jb0 implements OnBackAnimationCallback {
    public boolean f34780b;
    public boolean e;
    public final LaunchActivity f34782f;
    public final AnimationNotificationsLocker f34779a = new AnimationNotificationsLocker();
    public boolean f34781c = false;
    public boolean d = false;

    public jb0(LaunchActivity launchActivity) {
        this.f34782f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f34781c = false;
        this.d = false;
        if (this.f34780b) {
            this.f34779a.unlock();
            this.f34780b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f34782f.f31088q0) != null && actionBarLayout.f18571c1) {
            actionBarLayout.f18571c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f34780b) {
            this.f34779a.unlock();
            this.f34780b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f34782f.onBackPressed();
        } else if (!this.f34782f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f34782f;
            ActionBarLayout actionBarLayout = launchActivity.f31088q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18571c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18571c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f34781c = true;
        this.d = false;
        this.e = false;
    }
}
