package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;
public final class az0 extends AnimatorListenerAdapter {
    public final ProfileActivity f32743a;

    public az0(ProfileActivity profileActivity) {
        this.f32743a = profileActivity;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int v02;
        ProfileActivity profileActivity = this.f32743a;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (profileActivity.f32113m2) {
            v02 = 1090519039;
        } else if (profileActivity.N5 != null) {
            v02 = 553648127;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19944f8, profileActivity.f32181w0);
        }
        kVar.B(v02, false);
        wy0 wy0Var = profileActivity.f32036b0;
        ImageReceiver imageReceiver = wy0Var.R;
        org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(wy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = wy0Var.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            wy0Var.T = null;
        }
        wy0Var.S = 0.0f;
        wy0Var.invalidate();
        profileActivity.E0 = false;
        profileActivity.l5(false);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
