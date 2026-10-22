package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements OnBackAnimationCallback {
    public boolean f38878b;
    public boolean e;
    public final LaunchActivity f38880f;
    public final AnimationNotificationsLocker f38877a = new AnimationNotificationsLocker();
    public boolean f38879c = false;
    public boolean d = false;

    public la0(LaunchActivity launchActivity) {
        this.f38880f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f38879c = false;
        this.d = false;
        if (this.f38878b) {
            this.f38877a.unlock();
            this.f38878b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f38880f.f33189q0) != null && actionBarLayout.f20557c1) {
            actionBarLayout.f20557c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f38878b) {
            this.f38877a.unlock();
            this.f38878b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f38880f.onBackPressed();
        } else if (!this.f38880f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38880f;
            ActionBarLayout actionBarLayout = launchActivity.f33189q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20557c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20557c1 = false;
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
        this.f38879c = true;
        this.d = false;
        this.e = false;
    }
}
