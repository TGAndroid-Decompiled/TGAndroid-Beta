package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lb0 implements OnBackAnimationCallback {
    public boolean f37909b;
    public boolean e;
    public final LaunchActivity f37911f;
    public final AnimationNotificationsLocker f37908a = new AnimationNotificationsLocker();
    public boolean f37910c = false;
    public boolean d = false;

    public lb0(LaunchActivity launchActivity) {
        this.f37911f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37910c = false;
        this.d = false;
        if (this.f37909b) {
            this.f37908a.unlock();
            this.f37909b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37911f.f32133q0) != null && actionBarLayout.f19497c1) {
            actionBarLayout.f19497c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37909b) {
            this.f37908a.unlock();
            this.f37909b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37911f.onBackPressed();
        } else if (!this.f37911f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37911f;
            ActionBarLayout actionBarLayout = launchActivity.f32133q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f19497c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f19497c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37910c = true;
        this.d = false;
        this.e = false;
    }
}
