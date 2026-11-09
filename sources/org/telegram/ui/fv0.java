package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class fv0 extends AnimatorListenerAdapter {
    public final int f45796a;
    public final ProfileActivity f45797b;

    public fv0(ProfileActivity profileActivity, int i7) {
        this.f45796a = i7;
        this.f45797b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45796a) {
            case 1:
                this.f45797b.Q5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f45797b;
                profileActivity.N1 = false;
                profileActivity.f41698a.O0 = true;
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
        int i7 = this.f45796a;
        ProfileActivity profileActivity = this.f45797b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (profileActivity.f41799o2) {
                    w02 = 1090519039;
                } else if (profileActivity.f41770j6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27905f8, profileActivity.f41876z0);
                }
                kVar.D(w02, false);
                bv0 bv0Var = profileActivity.f41729e0;
                ImageReceiver imageReceiver = bv0Var.U;
                org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(bv0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.jc jcVar = bv0Var.W;
                if (jcVar != null) {
                    jcVar.a();
                    bv0Var.W = null;
                }
                bv0Var.V = 0.0f;
                bv0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.O5(false);
                return;
            case 1:
                if (profileActivity.Q5 != null && !profileActivity.T5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.R5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f41782l5, 1.0f));
                    profileActivity.R5.setDuration(100L);
                    profileActivity.R5.addListener(new f30(this, 21));
                    profileActivity.R5.start();
                }
                profileActivity.O5(false);
                profileActivity.Q5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.V6;
                profileActivity.B4(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.f41852w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f41852w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.N1 = false;
                profileActivity.f41698a.O0 = true;
                profileActivity.f41760i2.removeListener(this);
                profileActivity.f41716c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f41791n0.setVisibility(0);
                profileActivity.f41791n0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f41760i2.removeListener(this);
                profileActivity.f41791n0.setVisibility(8);
                profileActivity.f41791n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f41853w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45796a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f45797b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f41791n0.setAnimatedFileMaybe(profileActivity.f41729e0.getImageReceiver().m());
                profileActivity.f41791n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
