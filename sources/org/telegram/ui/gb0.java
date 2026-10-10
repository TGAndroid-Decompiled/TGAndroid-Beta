package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gb0 implements OnBackAnimationCallback {
    public boolean f38012b;
    public boolean f38014e;
    public final LaunchActivity f38015f;
    public final AnimationNotificationsLocker f38011a = new AnimationNotificationsLocker();
    public boolean f38013c = false;
    public boolean d = false;

    public gb0(LaunchActivity launchActivity) {
        this.f38015f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f38013c = false;
        this.d = false;
        if (this.f38012b) {
            this.f38011a.unlock();
            this.f38012b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f38015f.f33845q0) != null && actionBarLayout.f20325c1) {
            actionBarLayout.f20325c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f38012b) {
            this.f38011a.unlock();
            this.f38012b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f38015f.onBackPressed();
        } else if (!this.f38015f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f38015f;
            ActionBarLayout actionBarLayout = launchActivity.f33845q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f20325c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f20325c1 = false;
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
        this.f38013c = true;
        this.d = false;
        this.f38014e = false;
    }
}
