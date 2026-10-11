package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class a01 extends AnimatorListenerAdapter {
    public final int f35828a;
    public final ProfileActivity f35829b;

    public a01(ProfileActivity profileActivity, int i10) {
        this.f35828a = i10;
        this.f35829b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35828a) {
            case 2:
                ProfileActivity profileActivity = this.f35829b;
                profileActivity.O1 = false;
                profileActivity.f34239a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35828a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f35829b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f35829b;
                AnimatorSet animatorSet = profileActivity.f34394w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34394w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f35829b;
                profileActivity2.O1 = false;
                profileActivity2.f34239a.O0 = true;
                profileActivity2.f34308j2.removeListener(this);
                profileActivity2.f34263d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34331n0.setVisibility(0);
                profileActivity2.f34331n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f35829b;
                profileActivity3.f34308j2.removeListener(this);
                profileActivity3.f34331n0.setVisibility(8);
                profileActivity3.f34331n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f35829b;
                profileActivity4.f34395w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35828a) {
            case 2:
                ProfileActivity profileActivity = this.f35829b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34331n0.setAnimatedFileMaybe(profileActivity.f34270e0.getImageReceiver().getAnimation());
                profileActivity.f34331n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
