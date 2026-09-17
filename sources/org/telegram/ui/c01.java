package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class c01 extends AnimatorListenerAdapter {
    public final int f34965a;
    public final ProfileActivity f34966b;

    public c01(ProfileActivity profileActivity, int i10) {
        this.f34965a = i10;
        this.f34966b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34965a) {
            case 2:
                ProfileActivity profileActivity = this.f34966b;
                profileActivity.O1 = false;
                profileActivity.f33857a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34965a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34966b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f34966b;
                AnimatorSet animatorSet = profileActivity.f34012w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34012w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f34966b;
                profileActivity2.O1 = false;
                profileActivity2.f33857a.N0 = true;
                profileActivity2.f33926j2.removeListener(this);
                profileActivity2.f33881d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33949n0.setVisibility(0);
                profileActivity2.f33949n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f34966b;
                profileActivity3.f33926j2.removeListener(this);
                profileActivity3.f33949n0.setVisibility(8);
                profileActivity3.f33949n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f34966b;
                profileActivity4.f34013w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34965a) {
            case 2:
                ProfileActivity profileActivity = this.f34966b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33949n0.setAnimatedFileMaybe(profileActivity.f33888e0.getImageReceiver().getAnimation());
                profileActivity.f33949n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
