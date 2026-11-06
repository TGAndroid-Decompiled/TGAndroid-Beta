package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class cv0 extends AnimatorListenerAdapter {
    public final int f44878a;
    public final ProfileActivity f44879b;

    public cv0(ProfileActivity profileActivity, int i7) {
        this.f44878a = i7;
        this.f44879b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44878a) {
            case 1:
                this.f44879b.O5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f44879b;
                profileActivity.N1 = false;
                profileActivity.f41663a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int w02;
        int i7 = this.f44878a;
        ProfileActivity profileActivity = this.f44879b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (profileActivity.f41764o2) {
                    w02 = 1090519039;
                } else if (profileActivity.f41715g6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27888f8, profileActivity.f41841z0);
                }
                kVar.C(w02, false);
                yu0 yu0Var = profileActivity.f41694e0;
                ImageReceiver imageReceiver = yu0Var.U;
                org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(yu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.jc jcVar = yu0Var.W;
                if (jcVar != null) {
                    jcVar.a();
                    yu0Var.W = null;
                }
                yu0Var.V = 0.0f;
                yu0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.L5(false);
                return;
            case 1:
                if (profileActivity.O5 != null && !profileActivity.R5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.P5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f41734j5, 1.0f));
                    profileActivity.P5.setDuration(100L);
                    profileActivity.P5.addListener(new d30(this, 21));
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
                AnimatorSet animatorSet2 = profileActivity.f41817w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f41817w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.N1 = false;
                profileActivity.f41663a.O0 = true;
                profileActivity.f41725i2.removeListener(this);
                profileActivity.f41681c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f41756n0.setVisibility(0);
                profileActivity.f41756n0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f41725i2.removeListener(this);
                profileActivity.f41756n0.setVisibility(8);
                profileActivity.f41756n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f41818w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44878a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f44879b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f41756n0.setAnimatedFileMaybe(profileActivity.f41694e0.getImageReceiver().m());
                profileActivity.f41756n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
