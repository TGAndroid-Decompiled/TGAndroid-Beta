package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f36554b;
    public boolean f36556e;
    public final LaunchActivity f36557f;
    public final AnimationNotificationsLocker f36553a = new AnimationNotificationsLocker();
    public boolean f36555c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f36557f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f36555c = false;
        this.d = false;
        if (this.f36554b) {
            this.f36553a.unlock();
            this.f36554b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f36557f.f33804q0) != null && actionBarLayout.f20319c1) {
            actionBarLayout.f20319c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f36554b) {
            this.f36553a.unlock();
            this.f36554b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f36557f.onBackPressed();
        } else if (!this.f36557f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f36557f;
            ActionBarLayout actionBarLayout = launchActivity.f33804q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20319c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20319c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f36555c = true;
        this.d = false;
        this.f36556e = false;
    }
}
