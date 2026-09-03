package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ab0 implements OnBackAnimationCallback {
    public boolean f32541b;
    public boolean e;
    public final LaunchActivity f32543f;
    public final AnimationNotificationsLocker f32540a = new AnimationNotificationsLocker();
    public boolean f32542c = false;
    public boolean d = false;

    public ab0(LaunchActivity launchActivity) {
        this.f32543f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32542c = false;
        this.d = false;
        if (this.f32541b) {
            this.f32540a.unlock();
            this.f32541b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32543f.f31612n0) != null && actionBarLayout.Z0) {
            actionBarLayout.Z0 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32541b) {
            this.f32540a.unlock();
            this.f32541b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32543f.onBackPressed();
        } else if (!this.f32543f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32543f;
            ActionBarLayout actionBarLayout = launchActivity.f31612n0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.Z0) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ab0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f32542c = true;
        this.d = false;
        this.e = false;
    }
}
