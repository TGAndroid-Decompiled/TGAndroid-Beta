package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class mz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f38777a;

    public mz0(ProfileActivity profileActivity) {
        this.f38777a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f38777a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (profileActivity.f34329p2) {
            v02 = 1090519039;
        } else if (profileActivity.Q5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20865f8, profileActivity.f34396z0);
        }
        kVar.z(v02, false);
        iz0 iz0Var = profileActivity.f34252e0;
        ImageReceiver imageReceiver = iz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(iz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = iz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            iz0Var.W = null;
        }
        iz0Var.V = 0.0f;
        iz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
