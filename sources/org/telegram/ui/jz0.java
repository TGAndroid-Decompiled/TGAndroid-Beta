package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jz0 extends AnimatorListenerAdapter {
    public final int f35533a;
    public final ProfileActivity f35534b;

    public jz0(ProfileActivity profileActivity, int i10) {
        this.f35533a = i10;
        this.f35534b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35533a) {
            case 2:
                ProfileActivity profileActivity = this.f35534b;
                profileActivity.L1 = false;
                profileActivity.f32028a.K0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35533a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f35534b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f35534b;
                AnimatorSet animatorSet = profileActivity.f32180w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f32180w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f35534b;
                profileActivity2.L1 = false;
                profileActivity2.f32028a.K0 = true;
                profileActivity2.f32073g2.removeListener(this);
                profileActivity2.f32030a1.setBackgroundColor(-16777216);
                profileActivity2.V.setVisibility(8);
                profileActivity2.f32099k0.setVisibility(0);
                profileActivity2.f32099k0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f35534b;
                profileActivity3.f32073g2.removeListener(this);
                profileActivity3.f32099k0.setVisibility(8);
                profileActivity3.f32099k0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f35534b;
                profileActivity4.f32162t0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35533a) {
            case 2:
                ProfileActivity profileActivity = this.f35534b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f32099k0.setAnimatedFileMaybe(profileActivity.f32036b0.getImageReceiver().getAnimation());
                profileActivity.f32099k0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
