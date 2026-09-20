package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class kb0 implements OnBackAnimationCallback {
    public boolean f35079b;
    public boolean e;
    public final LaunchActivity f35081f;
    public final AnimationNotificationsLocker f35078a = new AnimationNotificationsLocker();
    public boolean f35080c = false;
    public boolean d = false;

    public kb0(LaunchActivity launchActivity) {
        this.f35081f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f35080c = false;
        this.d = false;
        if (this.f35079b) {
            this.f35078a.unlock();
            this.f35079b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f35081f.f31128q0) != null && actionBarLayout.f18603c1) {
            actionBarLayout.f18603c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f35079b) {
            this.f35078a.unlock();
            this.f35079b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f35081f.onBackPressed();
        } else if (!this.f35081f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f35081f;
            ActionBarLayout actionBarLayout = launchActivity.f31128q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18603c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18603c1 = false;
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
        this.f35080c = true;
        this.d = false;
        this.e = false;
    }
}
