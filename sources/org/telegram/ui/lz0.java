package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class lz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f35112a;

    public lz0(ProfileActivity profileActivity) {
        this.f35112a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f35112a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f31316p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18826f8, profileActivity.f31383z0);
        }
        kVar.A(v02, false);
        hz0 hz0Var = profileActivity.f31239e0;
        ImageReceiver imageReceiver = hz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(hz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = hz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            hz0Var.W = null;
        }
        hz0Var.V = 0.0f;
        hz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
