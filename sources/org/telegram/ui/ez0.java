package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class ez0 extends AnimatorListenerAdapter {
    public final ProfileActivity f39113a;

    public ez0(ProfileActivity profileActivity) {
        this.f39113a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f39113a;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        if (profileActivity.f36080p2) {
            w02 = 1090519039;
        } else if (profileActivity.X5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23395f8, profileActivity.f36150z0);
        }
        kVar.x(w02, false);
        az0 az0Var = profileActivity.f36002e0;
        ImageReceiver imageReceiver = az0Var.U;
        org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(az0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = az0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            az0Var.W = null;
        }
        az0Var.V = 0.0f;
        az0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.x5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
