package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kb0 implements OnBackAnimationCallback {
    public boolean f37338b;
    public boolean e;
    public final LaunchActivity f37340f;
    public final AnimationNotificationsLocker f37337a = new AnimationNotificationsLocker();
    public boolean f37339c = false;
    public boolean d = false;

    public kb0(LaunchActivity launchActivity) {
        this.f37340f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37339c = false;
        this.d = false;
        if (this.f37338b) {
            this.f37337a.unlock();
            this.f37338b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37340f.f31835q0) != null && actionBarLayout.f19197c1) {
            actionBarLayout.f19197c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37338b) {
            this.f37337a.unlock();
            this.f37338b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37340f.onBackPressed();
        } else if (!this.f37340f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37340f;
            ActionBarLayout actionBarLayout = launchActivity.f31835q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f19197c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f19197c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f37339c = true;
        this.d = false;
        this.e = false;
    }
}
