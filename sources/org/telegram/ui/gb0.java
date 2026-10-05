package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f36585b;
    public boolean f36587e;
    public final LaunchActivity f36588f;
    public final AnimationNotificationsLocker f36584a = new AnimationNotificationsLocker();
    public boolean f36586c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f36588f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f36586c = false;
        this.d = false;
        if (this.f36585b) {
            this.f36584a.unlock();
            this.f36585b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f36588f.f33817q0) != null && actionBarLayout.f20324c1) {
            actionBarLayout.f20324c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f36585b) {
            this.f36584a.unlock();
            this.f36585b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f36588f.onBackPressed();
        } else if (!this.f36588f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f36588f;
            ActionBarLayout actionBarLayout = launchActivity.f33817q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20324c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20324c1 = false;
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
        this.f36586c = true;
        this.d = false;
        this.f36587e = false;
    }
}
