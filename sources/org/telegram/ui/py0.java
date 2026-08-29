package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class py0 extends AnimatorListenerAdapter {
    public final ProfileActivity f41491a;

    public py0(ProfileActivity profileActivity) {
        this.f41491a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        int v02;
        ProfileActivity profileActivity = this.f41491a;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f36064l2) {
            v02 = 1090519039;
        } else if (profileActivity.M5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23101f8, profileActivity.f36129v0);
        }
        lVar.B(v02, false);
        ly0 ly0Var = profileActivity.f35985a0;
        ImageReceiver imageReceiver = ly0Var.Q;
        org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
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
