package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f37288b;
    public boolean f37290e;
    public final LaunchActivity f37291f;
    public final AnimationNotificationsLocker f37287a = new AnimationNotificationsLocker();
    public boolean f37289c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f37291f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37289c = false;
        this.d = false;
        if (this.f37288b) {
            this.f37287a.unlock();
            this.f37288b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37291f.f33454q0) != null && actionBarLayout.f20146c1) {
            actionBarLayout.f20146c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37288b) {
            this.f37287a.unlock();
            this.f37288b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37291f.onBackPressed();
        } else if (!this.f37291f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37291f;
            ActionBarLayout actionBarLayout = launchActivity.f33454q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20146c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20146c1 = false;
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
        this.f37289c = true;
        this.d = false;
        this.f37290e = false;
    }
}
