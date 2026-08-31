package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class cz0 extends AnimatorListenerAdapter {
    public final ProfileActivity f35947a;

    public cz0(ProfileActivity profileActivity) {
        this.f35947a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f35947a;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (profileActivity.f34646m2) {
            v02 = 1090519039;
        } else if (profileActivity.N5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21698f8, profileActivity.f34714w0);
        }
        kVar.B(v02, false);
        yy0 yy0Var = profileActivity.f34568b0;
        ImageReceiver imageReceiver = yy0Var.R;
        org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(yy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = yy0Var.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            yy0Var.T = null;
        }
        yy0Var.S = 0.0f;
        yy0Var.invalidate();
        profileActivity.E0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
