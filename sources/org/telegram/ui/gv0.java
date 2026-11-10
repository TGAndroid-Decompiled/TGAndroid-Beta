package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
public final class gv0 extends AnimatorListenerAdapter {
    public final int f46163a;
    public final ProfileActivity f46164b;

    public gv0(ProfileActivity profileActivity, int i7) {
        this.f46163a = i7;
        this.f46164b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46163a) {
            case 1:
                this.f46164b.Q5 = null;
                return;
            case 4:
                ProfileActivity profileActivity = this.f46164b;
                profileActivity.N1 = false;
                profileActivity.f41689a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oi.q qVar;
        org.telegram.ui.ActionBar.l lVar;
        int w02;
        int i7 = this.f46163a;
        ProfileActivity profileActivity = this.f46164b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
                qVar.g();
                lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (profileActivity.f41790o2) {
                    w02 = 1090519039;
                } else if (profileActivity.f41761j6 != null) {
                    w02 = 553648127;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27930f8, profileActivity.f41867z0);
                }
                lVar.E(w02, false);
                cv0 cv0Var = profileActivity.f41720e0;
                ImageReceiver imageReceiver = cv0Var.U;
                org.telegram.ui.Components.u5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(cv0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.jc jcVar = cv0Var.W;
                if (jcVar != null) {
                    jcVar.a();
                    cv0Var.W = null;
                }
                cv0Var.V = 0.0f;
                cv0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.O5(false);
                return;
            case 1:
                if (profileActivity.Q5 != null && !profileActivity.T5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.R5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f41773l5, 1.0f));
                    profileActivity.R5.setDuration(100L);
                    profileActivity.R5.addListener(new g30(this, 21));
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
                AnimatorSet animatorSet2 = profileActivity.f41843w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.f41843w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.N1 = false;
                profileActivity.f41689a.O0 = true;
                profileActivity.f41751i2.removeListener(this);
                profileActivity.f41707c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f41782n0.setVisibility(0);
                profileActivity.f41782n0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.f41751i2.removeListener(this);
                profileActivity.f41782n0.setVisibility(8);
                profileActivity.f41782n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f41844w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46163a) {
            case 0:
                return;
            case 4:
                ProfileActivity profileActivity = this.f46164b;
                ProfileActivity.G3(profileActivity, false);
                profileActivity.f41782n0.setAnimatedFileMaybe(profileActivity.f41720e0.getImageReceiver().m());
                profileActivity.f41782n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
