package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ez0 extends AnimatorListenerAdapter {
    public final int f36844a;
    public final ProfileActivity f36845b;

    public ez0(ProfileActivity profileActivity, int i10) {
        this.f36844a = i10;
        this.f36845b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36844a) {
            case 2:
                ProfileActivity profileActivity = this.f36845b;
                profileActivity.P1 = false;
                profileActivity.f33584a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36844a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36845b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36845b;
                AnimatorSet animatorSet = profileActivity.f33739w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f33739w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36845b;
                profileActivity2.P1 = false;
                profileActivity2.f33584a.O0 = true;
                profileActivity2.f33659k2.removeListener(this);
                profileActivity2.f33615e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33683o0.setVisibility(0);
                profileActivity2.f33683o0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36845b;
                profileActivity3.f33659k2.removeListener(this);
                profileActivity3.f33683o0.setVisibility(8);
                profileActivity3.f33683o0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36845b;
                profileActivity4.f33748x0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36844a) {
            case 2:
                ProfileActivity profileActivity = this.f36845b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33683o0.setAnimatedFileMaybe(profileActivity.f33622f0.getImageReceiver().getAnimation());
                profileActivity.f33683o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
