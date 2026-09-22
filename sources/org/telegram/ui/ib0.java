package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ib0 implements OnBackAnimationCallback {
    public boolean f34593b;
    public boolean e;
    public final LaunchActivity f34595f;
    public final AnimationNotificationsLocker f34592a = new AnimationNotificationsLocker();
    public boolean f34594c = false;
    public boolean d = false;

    public ib0(LaunchActivity launchActivity) {
        this.f34595f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f34594c = false;
        this.d = false;
        if (this.f34593b) {
            this.f34592a.unlock();
            this.f34593b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f34595f.f30841q0) != null && actionBarLayout.f18384c1) {
            actionBarLayout.f18384c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f34593b) {
            this.f34592a.unlock();
            this.f34593b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f34595f.onBackPressed();
        } else if (!this.f34595f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f34595f;
            ActionBarLayout actionBarLayout = launchActivity.f30841q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18384c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18384c1 = false;
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
        this.f34594c = true;
        this.d = false;
        this.e = false;
    }
}
