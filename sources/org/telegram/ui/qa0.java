package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qa0 implements OnBackAnimationCallback {
    public boolean f42792b;
    public boolean e;
    public final LaunchActivity f42794f;
    public final AnimationNotificationsLocker f42791a = new AnimationNotificationsLocker();
    public boolean f42793c = false;
    public boolean d = false;

    public qa0(LaunchActivity launchActivity) {
        this.f42794f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f42793c = false;
        this.d = false;
        if (this.f42792b) {
            this.f42791a.unlock();
            this.f42792b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f42794f.f35550q0) != null && actionBarLayout.f22322i1) {
            actionBarLayout.f22322i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f42792b) {
            this.f42791a.unlock();
            this.f42792b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f42794f.onBackPressed();
        } else if (!this.f42794f.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f42794f;
            ActionBarLayout actionBarLayout = launchActivity.f35550q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22322i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22322i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f42793c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.e && progress > 0.015f) {
                this.e = true;
                if (!AndroidUtilities.isTablet() && this.f42794f.e0(false) && (actionBarLayout2 = this.f42794f.f35550q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f42792b) {
                    this.f42791a.lock();
                    this.f42792b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f42794f.f35550q0) != null && actionBarLayout.f22322i1) {
                float interpolation = org.telegram.ui.Components.ds.f27589l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f22326k1 = z10;
                actionBarLayout.f22341s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f42793c = true;
        this.d = false;
        this.e = false;
    }
}
