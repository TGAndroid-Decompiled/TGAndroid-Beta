package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f37968b;
    public boolean f37970e;
    public final LaunchActivity f37971f;
    public final AnimationNotificationsLocker f37967a = new AnimationNotificationsLocker();
    public boolean f37969c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f37971f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37969c = false;
        this.d = false;
        if (this.f37968b) {
            this.f37967a.unlock();
            this.f37968b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37971f.f33807q0) != null && actionBarLayout.f20321c1) {
            actionBarLayout.f20321c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37968b) {
            this.f37967a.unlock();
            this.f37968b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37971f.onBackPressed();
        } else if (!this.f37971f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37971f;
            ActionBarLayout actionBarLayout = launchActivity.f33807q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20321c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20321c1 = false;
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
        this.f37969c = true;
        this.d = false;
        this.f37970e = false;
    }
}
