package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class d01 extends AnimatorListenerAdapter {
    public final int f36590a;
    public final ProfileActivity f36591b;

    public d01(ProfileActivity profileActivity, int i10) {
        this.f36590a = i10;
        this.f36591b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36590a) {
            case 2:
                ProfileActivity profileActivity = this.f36591b;
                profileActivity.O1 = false;
                profileActivity.f34048a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36590a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36591b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36591b;
                AnimatorSet animatorSet = profileActivity.f34203w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34203w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36591b;
                profileActivity2.O1 = false;
                profileActivity2.f34048a.O0 = true;
                profileActivity2.f34117j2.removeListener(this);
                profileActivity2.f34072d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34140n0.setVisibility(0);
                profileActivity2.f34140n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36591b;
                profileActivity3.f34117j2.removeListener(this);
                profileActivity3.f34140n0.setVisibility(8);
                profileActivity3.f34140n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36591b;
                profileActivity4.f34204w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36590a) {
            case 2:
                ProfileActivity profileActivity = this.f36591b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34140n0.setAnimatedFileMaybe(profileActivity.f34079e0.getImageReceiver().getAnimation());
                profileActivity.f34140n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
