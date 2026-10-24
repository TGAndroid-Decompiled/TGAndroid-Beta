package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f38082a;
    public final ProfileActivity f38083b;

    public hz0(ProfileActivity profileActivity, int i10) {
        this.f38082a = i10;
        this.f38083b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38082a) {
            case 2:
                ProfileActivity profileActivity = this.f38083b;
                profileActivity.P1 = false;
                profileActivity.f33884a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38082a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38083b.m4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f38083b;
                AnimatorSet animatorSet = profileActivity.f34039w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34039w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f38083b;
                profileActivity2.P1 = false;
                profileActivity2.f33884a.O0 = true;
                profileActivity2.f33959k2.removeListener(this);
                profileActivity2.f33915e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33983o0.setVisibility(0);
                profileActivity2.f33983o0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f38083b;
                profileActivity3.f33959k2.removeListener(this);
                profileActivity3.f33983o0.setVisibility(8);
                profileActivity3.f33983o0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f38083b;
                profileActivity4.f34048x0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38082a) {
            case 2:
                ProfileActivity profileActivity = this.f38083b;
                ProfileActivity.t3(profileActivity, false);
                profileActivity.f33983o0.setAnimatedFileMaybe(profileActivity.f33922f0.getImageReceiver().getAnimation());
                profileActivity.f33983o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
