package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class nw0 extends AnimatorListenerAdapter {
    public final int f40062a;
    public final ProfileActivity f40063b;

    public nw0(ProfileActivity profileActivity, int i10) {
        this.f40062a = i10;
        this.f40063b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40062a) {
            case 1:
                this.f40063b.N5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f40063b;
                profileActivity.N1 = false;
                profileActivity.f33772a.O0 = true;
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
        int i10 = this.f40062a;
        ProfileActivity profileActivity = this.f40063b;
        switch (i10) {
            case 0:
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
                rVar.g();
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                if (profileActivity.f33873o2) {
                    w02 = 1090519039;
                } else if (profileActivity.f33816f6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20967f8, profileActivity.f33950z0);
                }
                lVar.C(w02, false);
                jw0 jw0Var = profileActivity.f33802e0;
                ImageReceiver imageReceiver = jw0Var.U;
                org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(jw0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.kc kcVar = jw0Var.W;
                if (kcVar != null) {
                    kcVar.a();
                    jw0Var.W = null;
                }
                jw0Var.V = 0.0f;
                jw0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.K5(false);
                return;
            case 1:
                if (profileActivity.N5 != null && !profileActivity.Q5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.O5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f33843j5, 1.0f));
                    profileActivity.O5.setDuration(100L);
                    profileActivity.O5.addListener(new ns0(this, 2));
                    profileActivity.O5.start();
                }
                profileActivity.K5(false);
                profileActivity.N5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.R6;
                profileActivity.x4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f33927w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f33927w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.N1 = false;
                profileActivity.f33772a.O0 = true;
                profileActivity.f33833i2.removeListener(this);
                profileActivity.f33789c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f33864n0.setVisibility(0);
                profileActivity.f33864n0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f33833i2.removeListener(this);
                profileActivity.f33864n0.setVisibility(8);
                profileActivity.f33864n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f33928w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40062a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f40063b;
                ProfileActivity.F3(profileActivity, false);
                profileActivity.f33864n0.setAnimatedFileMaybe(profileActivity.f33802e0.getImageReceiver().m());
                profileActivity.f33864n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
