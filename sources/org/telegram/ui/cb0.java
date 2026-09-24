package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements OnBackAnimationCallback {
    public boolean f32607b;
    public boolean e;
    public final LaunchActivity f32609f;
    public final AnimationNotificationsLocker f32606a = new AnimationNotificationsLocker();
    public boolean f32608c = false;
    public boolean d = false;

    public cb0(LaunchActivity launchActivity) {
        this.f32609f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f32608c = false;
        this.d = false;
        if (this.f32607b) {
            this.f32606a.unlock();
            this.f32607b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f32609f.f31116q0) != null && actionBarLayout.f18596c1) {
            actionBarLayout.f18596c1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f32607b) {
            this.f32606a.unlock();
            this.f32607b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f32609f.onBackPressed();
        } else if (!this.f32609f.c0(true)) {
        } else {
            LaunchActivity launchActivity = this.f32609f;
            ActionBarLayout actionBarLayout = launchActivity.f31116q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f18596c1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.f18596c1 = false;
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
        this.f32608c = true;
        this.d = false;
        this.e = false;
    }
}
