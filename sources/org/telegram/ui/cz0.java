package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class cz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f38699a;

    public cz0(ProfileActivity profileActivity) {
        this.f38699a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        ProfileActivity profileActivity = this.f38699a;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        if (profileActivity.f36053p2) {
            w02 = 1090519039;
        } else if (profileActivity.X5 != null) {
            w02 = 553648127;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23392f8, profileActivity.f36123z0);
        }
        kVar.x(w02, false);
        yy0 yy0Var = profileActivity.f35975e0;
        ImageReceiver imageReceiver = yy0Var.U;
        org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(yy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = yy0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            yy0Var.W = null;
        }
        yy0Var.V = 0.0f;
        yy0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.x5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
