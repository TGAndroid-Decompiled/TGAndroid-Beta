package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f37259a;
    public final ProfileActivity f37260b;

    public pz0(ProfileActivity profileActivity, int i10) {
        this.f37259a = i10;
        this.f37260b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37259a) {
            case 2:
                ProfileActivity profileActivity = this.f37260b;
                profileActivity.L1 = false;
                profileActivity.f32002a.K0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37259a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37260b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37260b;
                AnimatorSet animatorSet = profileActivity.f32154w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f32154w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37260b;
                profileActivity2.L1 = false;
                profileActivity2.f32002a.K0 = true;
                profileActivity2.f32047g2.removeListener(this);
                profileActivity2.f32004a1.setBackgroundColor(-16777216);
                profileActivity2.V.setVisibility(8);
                profileActivity2.f32073k0.setVisibility(0);
                profileActivity2.f32073k0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37260b;
                profileActivity3.f32047g2.removeListener(this);
                profileActivity3.f32073k0.setVisibility(8);
                profileActivity3.f32073k0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37260b;
                profileActivity4.f32136t0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37259a) {
            case 2:
                ProfileActivity profileActivity = this.f37260b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f32073k0.setAnimatedFileMaybe(profileActivity.f32010b0.getImageReceiver().getAnimation());
                profileActivity.f32073k0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
