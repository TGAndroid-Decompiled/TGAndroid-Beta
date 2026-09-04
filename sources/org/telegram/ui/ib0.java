package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f37287b;
    public boolean f37289e;
    public final LaunchActivity f37290f;
    public final AnimationNotificationsLocker f37286a = new AnimationNotificationsLocker();
    public boolean f37288c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f37290f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f37288c = false;
        this.d = false;
        if (this.f37287b) {
            this.f37286a.unlock();
            this.f37287b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f37290f.f33453q0) != null && actionBarLayout.f20145c1) {
            actionBarLayout.f20145c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f37287b) {
            this.f37286a.unlock();
            this.f37287b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f37290f.onBackPressed();
        } else if (!this.f37290f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f37290f;
            ActionBarLayout actionBarLayout = launchActivity.f33453q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20145c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20145c1 = false;
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
        this.f37288c = true;
        this.d = false;
        this.f37289e = false;
    }
}
