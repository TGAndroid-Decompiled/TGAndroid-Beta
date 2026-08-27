package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

public final class py0 extends AnimatorListenerAdapter {

    public final ProfileActivity f41453a;

    public py0(ProfileActivity profileActivity) {
        this.f41453a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int iV0;
        ProfileActivity profileActivity = this.f41453a;
        org.telegram.ui.ActionBar.k kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f36002l2) {
            iV0 = 1090519039;
        } else {
            iV0 = profileActivity.M5 != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23092f8, profileActivity.f36067v0);
        }
        kVar.C(iV0, false);
        ly0 ly0Var = profileActivity.f35922a0;
        ImageReceiver imageReceiver = ly0Var.Q;
        org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ly0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ly0Var.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ly0Var.S = null;
        }
        ly0Var.R = 0.0f;
        ly0Var.invalidate();
        profileActivity.D0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
