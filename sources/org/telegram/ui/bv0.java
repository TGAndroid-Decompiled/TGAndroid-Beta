package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class bv0 extends AnimatorListenerAdapter {
    public final int f45841a;
    public final ProfileActivity f45842b;

    public bv0(ProfileActivity profileActivity, int i7) {
        this.f45841a = i7;
        this.f45842b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45841a) {
            case 1:
                this.f45842b.S5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f45842b;
                profileActivity.O1 = false;
                profileActivity.f43062a.P0 = true;
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
        int i7 = this.f45841a;
        ProfileActivity profileActivity = this.f45842b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.e2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                if (profileActivity.f43176q2) {
                    w02 = 1090519039;
                } else if (profileActivity.f43147l6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28889f8, profileActivity.A0);
                }
                kVar.F(w02, false);
                xu0 xu0Var = profileActivity.f43101f0;
                ImageReceiver imageReceiver = xu0Var.V;
                org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(xu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.ic icVar = xu0Var.f52301a0;
                if (icVar != null) {
                    icVar.a();
                    xu0Var.f52301a0 = null;
                }
                xu0Var.W = 0.0f;
                xu0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.O5(false);
                return;
            case 1:
                if (profileActivity.S5 != null && !profileActivity.V5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.T5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f43159n5, 1.0f));
                    profileActivity.T5.setDuration(100L);
                    profileActivity.T5.addListener(new xx(this, 22));
                    profileActivity.T5.start();
                }
                profileActivity.O5(false);
                profileActivity.S5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.X6;
                profileActivity.A4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f43216w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f43216w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.f43062a.P0 = true;
                profileActivity.f43137k2.removeListener(this);
                profileActivity.f43087d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.f43161o0.setVisibility(0);
                profileActivity.f43161o0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f43137k2.removeListener(this);
                profileActivity.f43161o0.setVisibility(8);
                profileActivity.f43161o0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f43225x0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45841a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f45842b;
                ProfileActivity.F3(profileActivity, false);
                profileActivity.f43161o0.setAnimatedFileMaybe(profileActivity.f43101f0.getImageReceiver().m());
                profileActivity.f43161o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
