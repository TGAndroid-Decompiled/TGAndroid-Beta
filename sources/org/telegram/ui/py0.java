package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class py0 extends AnimatorListenerAdapter {
    public final ProfileActivity f41627a;

    public py0(ProfileActivity profileActivity) {
        this.f41627a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f41627a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f35999l2) {
            v02 = 1090519039;
        } else if (profileActivity.M5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23039f8, profileActivity.f36064v0);
        }
        kVar.A(v02, false);
        ly0 ly0Var = profileActivity.f35919a0;
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
