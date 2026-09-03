package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class pz0 extends AnimatorListenerAdapter {
    public final int f40282a;
    public final ProfileActivity f40283b;

    public pz0(ProfileActivity profileActivity, int i10) {
        this.f40282a = i10;
        this.f40283b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40282a) {
            case 2:
                ProfileActivity profileActivity = this.f40283b;
                profileActivity.L1 = false;
                profileActivity.f34560a.K0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40282a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40283b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f40283b;
                AnimatorSet animatorSet = profileActivity.f34713w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34713w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f40283b;
                profileActivity2.L1 = false;
                profileActivity2.f34560a.K0 = true;
                profileActivity2.f34606g2.removeListener(this);
                profileActivity2.f34562a1.setBackgroundColor(-16777216);
                profileActivity2.V.setVisibility(8);
                profileActivity2.f34632k0.setVisibility(0);
                profileActivity2.f34632k0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f40283b;
                profileActivity3.f34606g2.removeListener(this);
                profileActivity3.f34632k0.setVisibility(8);
                profileActivity3.f34632k0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f40283b;
                profileActivity4.f34695t0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40282a) {
            case 2:
                ProfileActivity profileActivity = this.f40283b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34632k0.setAnimatedFileMaybe(profileActivity.f34568b0.getImageReceiver().getAnimation());
                profileActivity.f34632k0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
