package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class cv0 extends AnimatorListenerAdapter {
    public final int f46883a;
    public final ProfileActivity f46884b;

    public cv0(ProfileActivity profileActivity, int i7) {
        this.f46883a = i7;
        this.f46884b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46883a) {
            case 1:
                this.f46884b.U5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f46884b;
                profileActivity.O1 = false;
                profileActivity.f43634a.P0 = true;
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
        int i7 = this.f46883a;
        ProfileActivity profileActivity = this.f46884b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.g2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                if (profileActivity.f43748q2) {
                    w02 = 1090519039;
                } else if (profileActivity.f43732n6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29491f8, profileActivity.A0);
                }
                kVar.E(w02, false);
                yu0 yu0Var = profileActivity.f43673f0;
                ImageReceiver imageReceiver = yu0Var.V;
                org.telegram.ui.Components.b6 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(yu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.hc hcVar = yu0Var.f53037a0;
                if (hcVar != null) {
                    hcVar.a();
                    yu0Var.f53037a0 = null;
                }
                yu0Var.W = 0.0f;
                yu0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.P5(false);
                return;
            case 1:
                if (profileActivity.U5 != null && !profileActivity.X5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.V5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f43744p5, 1.0f));
                    profileActivity.V5.setDuration(100L);
                    profileActivity.V5.addListener(new zx(this, 22));
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
                AnimatorSet animatorSet2 = profileActivity.f43788w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f43788w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.f43634a.P0 = true;
                profileActivity.f43709k2.removeListener(this);
                profileActivity.f43659d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.f43733o0.setVisibility(0);
                profileActivity.f43733o0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f43709k2.removeListener(this);
                profileActivity.f43733o0.setVisibility(8);
                profileActivity.f43733o0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f43797x0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46883a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f46884b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f43733o0.setAnimatedFileMaybe(profileActivity.f43673f0.getImageReceiver().m());
                profileActivity.f43733o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
