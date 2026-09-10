package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f33603b;
    public boolean e;
    public final LaunchActivity f33605f;
    public final AnimationNotificationsLocker f33602a = new AnimationNotificationsLocker();
    public boolean f33604c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f33605f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f33604c = false;
        this.d = false;
        if (this.f33603b) {
            this.f33602a.unlock();
            this.f33603b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f33605f.f29957q0) != null && actionBarLayout.f17477c1) {
            actionBarLayout.f17477c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f33603b) {
            this.f33602a.unlock();
            this.f33603b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f33605f.onBackPressed();
        } else if (!this.f33605f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f33605f;
            ActionBarLayout actionBarLayout = launchActivity.f29957q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f17477c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f17477c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ib0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f33604c = true;
        this.d = false;
        this.e = false;
    }
}
