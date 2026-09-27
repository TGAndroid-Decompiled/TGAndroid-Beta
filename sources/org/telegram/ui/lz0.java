package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class lz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f35482a;

    public lz0(ProfileActivity profileActivity) {
        this.f35482a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        int v02;
        ProfileActivity profileActivity = this.f35482a;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (profileActivity.f31633p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19094f8, profileActivity.f31700z0);
        }
        lVar.B(v02, false);
        hz0 hz0Var = profileActivity.f31556e0;
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
