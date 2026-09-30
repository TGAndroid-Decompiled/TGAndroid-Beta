package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements OnBackAnimationCallback {
    public boolean f32623b;
    public boolean e;
    public final LaunchActivity f32625f;
    public final AnimationNotificationsLocker f32622a = new AnimationNotificationsLocker();
    public boolean f32624c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f32625f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32624c = false;
        this.d = false;
        if (this.f32623b) {
            this.f32622a.unlock();
            this.f32623b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32625f.f31132q0) != null && actionBarLayout.f18612c1) {
            actionBarLayout.f18612c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32623b) {
            this.f32622a.unlock();
            this.f32623b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32625f.onBackPressed();
        } else if (!this.f32625f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32625f;
            ActionBarLayout actionBarLayout = launchActivity.f31132q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18612c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18612c1 = false;
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
        this.f32624c = true;
        this.d = false;
        this.e = false;
    }
}
