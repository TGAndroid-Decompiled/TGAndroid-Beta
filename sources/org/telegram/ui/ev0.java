package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class ev0 extends AnimatorListenerAdapter {
    public final int f47354a;
    public final ProfileActivity f47355b;

    public ev0(ProfileActivity profileActivity, int i7) {
        this.f47354a = i7;
        this.f47355b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47354a) {
            case 1:
                this.f47355b.U5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f47355b;
                profileActivity.O1 = false;
                profileActivity.f43518a.P0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ri.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        int i7 = this.f47354a;
        ProfileActivity profileActivity = this.f47355b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.g2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                if (profileActivity.f43632q2) {
                    w02 = 1090519039;
                } else if (profileActivity.f43616n6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29387f8, profileActivity.A0);
                }
                kVar.F(w02, false);
                av0 av0Var = profileActivity.f43557f0;
                ImageReceiver imageReceiver = av0Var.V;
                org.telegram.ui.Components.c6 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(av0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.ic icVar = av0Var.f53942a0;
                if (icVar != null) {
                    icVar.a();
                    av0Var.f53942a0 = null;
                }
                av0Var.W = 0.0f;
                av0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.P5(false);
                return;
            case 1:
                if (profileActivity.U5 != null && !profileActivity.X5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.V5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f43628p5, 1.0f));
                    profileActivity.V5.setDuration(100L);
                    profileActivity.V5.addListener(new ay(this, 22));
                    profileActivity.V5.start();
                }
                profileActivity.P5(false);
                profileActivity.U5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.Z6;
                profileActivity.B4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f43672w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f43672w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.f43518a.P0 = true;
                profileActivity.f43593k2.removeListener(this);
                profileActivity.f43543d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.f43617o0.setVisibility(0);
                profileActivity.f43617o0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f43593k2.removeListener(this);
                profileActivity.f43617o0.setVisibility(8);
                profileActivity.f43617o0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f43681x0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f47354a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f47355b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f43617o0.setAnimatedFileMaybe(profileActivity.f43557f0.getImageReceiver().m());
                profileActivity.f43617o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
