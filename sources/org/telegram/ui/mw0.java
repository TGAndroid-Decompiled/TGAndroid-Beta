package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class mw0 extends AnimatorListenerAdapter {
    public final int f39626a;
    public final ProfileActivity f39627b;

    public mw0(ProfileActivity profileActivity, int i10) {
        this.f39626a = i10;
        this.f39627b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39626a) {
            case 1:
                this.f39627b.O5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f39627b;
                profileActivity.N1 = false;
                profileActivity.f33779a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ei.r rVar;
        org.telegram.ui.ActionBar.l lVar;
        int w02;
        int i10 = this.f39626a;
        ProfileActivity profileActivity = this.f39627b;
        switch (i10) {
            case 0:
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
                rVar.g();
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                if (profileActivity.f33880o2) {
                    w02 = 1090519039;
                } else if (profileActivity.f33830g6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20968f8, profileActivity.f33957z0);
                }
                lVar.C(w02, false);
                iw0 iw0Var = profileActivity.f33809e0;
                ImageReceiver imageReceiver = iw0Var.U;
                org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(iw0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.lc lcVar = iw0Var.W;
                if (lcVar != null) {
                    lcVar.a();
                    iw0Var.W = null;
                }
                iw0Var.V = 0.0f;
                iw0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.L5(false);
                return;
            case 1:
                if (profileActivity.O5 != null && !profileActivity.R5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.P5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33850j5, 1.0f));
                    profileActivity.P5.setDuration(100L);
                    profileActivity.P5.addListener(new ms0(this, 2));
                    profileActivity.P5.start();
                }
                profileActivity.L5(false);
                profileActivity.O5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.S6;
                profileActivity.y4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f33934w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f33934w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.N1 = false;
                profileActivity.f33779a.O0 = true;
                profileActivity.f33840i2.removeListener(this);
                profileActivity.f33796c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f33871n0.setVisibility(0);
                profileActivity.f33871n0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f33840i2.removeListener(this);
                profileActivity.f33871n0.setVisibility(8);
                profileActivity.f33871n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f33935w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39626a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f39627b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f33871n0.setAnimatedFileMaybe(profileActivity.f33809e0.getImageReceiver().m());
                profileActivity.f33871n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
