package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class na0 implements OnBackAnimationCallback {
    public boolean f39429b;
    public boolean e;
    public final LaunchActivity f39431f;
    public final AnimationNotificationsLocker f39428a = new AnimationNotificationsLocker();
    public boolean f39430c = false;
    public boolean d = false;

    public na0(LaunchActivity launchActivity) {
        this.f39431f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f39430c = false;
        this.d = false;
        if (this.f39429b) {
            this.f39428a.unlock();
            this.f39429b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f39431f.f33180q0) != null && actionBarLayout.f20557c1) {
            actionBarLayout.f20557c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f39429b) {
            this.f39428a.unlock();
            this.f39429b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f39431f.onBackPressed();
        } else if (!this.f39431f.d0(true)) {
        } else {
            LaunchActivity launchActivity = this.f39431f;
            ActionBarLayout actionBarLayout = launchActivity.f33180q0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.na0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f39430c = true;
        this.d = false;
        this.e = false;
    }
}
