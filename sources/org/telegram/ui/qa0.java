package org.telegram.ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qa0 implements OnBackAnimationCallback {
    public boolean f42795b;
    public boolean e;
    public final LaunchActivity f42797f;
    public final AnimationNotificationsLocker f42794a = new AnimationNotificationsLocker();
    public boolean f42796c = false;
    public boolean d = false;

    public qa0(LaunchActivity launchActivity) {
        this.f42797f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.f42796c = false;
        this.d = false;
        if (this.f42795b) {
            this.f42794a.unlock();
            this.f42795b = false;
        }
        if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f42797f.f35553q0) != null && actionBarLayout.f22324i1) {
            actionBarLayout.f22324i1 = false;
            actionBarLayout.e(true);
        }
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.f42795b) {
            this.f42794a.unlock();
            this.f42795b = false;
        }
        if (AndroidUtilities.isTablet()) {
            this.f42797f.onBackPressed();
        } else if (!this.f42797f.e0(true)) {
        } else {
            LaunchActivity launchActivity = this.f42797f;
            ActionBarLayout actionBarLayout = launchActivity.f35553q0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.f22324i1) {
                    actionBarLayout.H();
                    return;
                }
                actionBarLayout.f22324i1 = false;
                actionBarLayout.e(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (!this.f42796c || !this.d) {
            float progress = backEvent.getProgress();
            boolean z10 = false;
            if (!this.e && progress > 0.015f) {
                this.e = true;
                if (!AndroidUtilities.isTablet() && this.f42797f.e0(false) && (actionBarLayout2 = this.f42797f.f35553q0) != null && actionBarLayout2.I(backEvent.getTouchX(), backEvent.getTouchY()) && !this.f42795b) {
                    this.f42794a.lock();
                    this.f42795b = true;
                }
            }
            float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
            if (!AndroidUtilities.isTablet() && (actionBarLayout = this.f42797f.f35553q0) != null && actionBarLayout.f22324i1) {
                float interpolation = org.telegram.ui.Components.ds.f27591l.getInterpolation(max) * AndroidUtilities.dp(56.0f);
                if (max > 0.0f) {
                    z10 = true;
                }
                actionBarLayout.f22328k1 = z10;
                actionBarLayout.f22343s.setTranslationX(interpolation);
                actionBarLayout.setInnerTranslationX(interpolation);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f42796c = true;
        this.d = false;
        this.e = false;
    }
}
