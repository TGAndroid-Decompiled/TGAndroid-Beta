package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements OnBackAnimationCallback {
    public boolean f32622b;
    public boolean e;
    public final LaunchActivity f32624f;
    public final AnimationNotificationsLocker f32621a = new AnimationNotificationsLocker();
    public boolean f32623c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f32624f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32623c = false;
        this.d = false;
        if (this.f32622b) {
            this.f32621a.unlock();
            this.f32622b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32624f.f31131q0) != null && actionBarLayout.f18611c1) {
            actionBarLayout.f18611c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32622b) {
            this.f32621a.unlock();
            this.f32622b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32624f.onBackPressed();
        } else if (!this.f32624f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32624f;
            ActionBarLayout actionBarLayout = launchActivity.f31131q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18611c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18611c1 = false;
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
        this.f32623c = true;
        this.d = false;
        this.e = false;
    }
}
