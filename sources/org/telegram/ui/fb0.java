package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fb0 implements OnBackAnimationCallback {
    public boolean f37630b;
    public boolean f37632e;
    public final LaunchActivity f37633f;
    public final AnimationNotificationsLocker f37629a = new AnimationNotificationsLocker();
    public boolean f37631c = false;
    public boolean d = false;

    public fb0(LaunchActivity launchActivity) {
        this.f37633f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37631c = false;
        this.d = false;
        if (this.f37630b) {
            this.f37629a.unlock();
            this.f37630b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37633f.f33835q0) != null && actionBarLayout.f20315c1) {
            actionBarLayout.f20315c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37630b) {
            this.f37629a.unlock();
            this.f37630b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37633f.onBackPressed();
        } else if (!this.f37633f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37633f;
            ActionBarLayout actionBarLayout = launchActivity.f33835q0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37631c = true;
        this.d = false;
        this.f37632e = false;
    }
}
