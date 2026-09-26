package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class jz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f34900a;

    public jz0(ProfileActivity profileActivity) {
        this.f34900a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f34900a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (profileActivity.f31630p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19096f8, profileActivity.f31697z0);
        }
        kVar.A(v02, false);
        fz0 fz0Var = profileActivity.f31553e0;
        ImageReceiver imageReceiver = fz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(fz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = fz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            fz0Var.W = null;
        }
        fz0Var.V = 0.0f;
        fz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
