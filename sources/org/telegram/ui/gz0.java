package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f37357a;
    public final ProfileActivity f37358b;

    public gz0(ProfileActivity profileActivity, int i10) {
        this.f37357a = i10;
        this.f37358b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37357a) {
            case 2:
                ProfileActivity profileActivity = this.f37358b;
                profileActivity.P1 = false;
                profileActivity.f33568a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37357a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37358b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37358b;
                AnimatorSet animatorSet = profileActivity.f33723w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f33723w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37358b;
                profileActivity2.P1 = false;
                profileActivity2.f33568a.O0 = true;
                profileActivity2.f33643k2.removeListener(this);
                profileActivity2.f33599e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33667o0.setVisibility(0);
                profileActivity2.f33667o0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37358b;
                profileActivity3.f33643k2.removeListener(this);
                profileActivity3.f33667o0.setVisibility(8);
                profileActivity3.f33667o0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37358b;
                profileActivity4.f33732x0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37357a) {
            case 2:
                ProfileActivity profileActivity = this.f37358b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33667o0.setAnimatedFileMaybe(profileActivity.f33606f0.getImageReceiver().getAnimation());
                profileActivity.f33667o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
