package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f36548b;
    public boolean f36550e;
    public final LaunchActivity f36551f;
    public final AnimationNotificationsLocker f36547a = new AnimationNotificationsLocker();
    public boolean f36549c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f36551f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f36549c = false;
        this.d = false;
        if (this.f36548b) {
            this.f36547a.unlock();
            this.f36548b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f36551f.f33797q0) != null && actionBarLayout.f20314c1) {
            actionBarLayout.f20314c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f36548b) {
            this.f36547a.unlock();
            this.f36548b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f36551f.onBackPressed();
        } else if (!this.f36551f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f36551f;
            ActionBarLayout actionBarLayout = launchActivity.f33797q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20314c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20314c1 = false;
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
        this.f36549c = true;
        this.d = false;
        this.f36550e = false;
    }
}
