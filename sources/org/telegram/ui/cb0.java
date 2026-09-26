package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements OnBackAnimationCallback {
    public boolean f32620b;
    public boolean e;
    public final LaunchActivity f32622f;
    public final AnimationNotificationsLocker f32619a = new AnimationNotificationsLocker();
    public boolean f32621c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f32622f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32621c = false;
        this.d = false;
        if (this.f32620b) {
            this.f32619a.unlock();
            this.f32620b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32622f.f31129q0) != null && actionBarLayout.f18610c1) {
            actionBarLayout.f18610c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32620b) {
            this.f32619a.unlock();
            this.f32620b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32622f.onBackPressed();
        } else if (!this.f32622f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32622f;
            ActionBarLayout actionBarLayout = launchActivity.f31129q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18610c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18610c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f32621c = true;
        this.d = false;
        this.e = false;
    }
}
