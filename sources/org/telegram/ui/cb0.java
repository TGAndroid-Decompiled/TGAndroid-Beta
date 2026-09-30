package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements OnBackAnimationCallback {
    public boolean f32709b;
    public boolean e;
    public final LaunchActivity f32711f;
    public final AnimationNotificationsLocker f32708a = new AnimationNotificationsLocker();
    public boolean f32710c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f32711f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32710c = false;
        this.d = false;
        if (this.f32709b) {
            this.f32708a.unlock();
            this.f32709b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32711f.f31204q0) != null && actionBarLayout.f18627c1) {
            actionBarLayout.f18627c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32709b) {
            this.f32708a.unlock();
            this.f32709b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32711f.onBackPressed();
        } else if (!this.f32711f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32711f;
            ActionBarLayout actionBarLayout = launchActivity.f31204q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18627c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18627c1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(android.window.BackEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cb0.onBackProgressed(android.window.BackEvent):void");
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f32710c = true;
        this.d = false;
        this.e = false;
    }
}
