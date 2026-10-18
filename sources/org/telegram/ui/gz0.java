package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class gz0 extends AnimatorListenerAdapter {
    public final int f37395a;
    public final ProfileActivity f37396b;

    public gz0(ProfileActivity profileActivity, int i10) {
        this.f37395a = i10;
        this.f37396b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37395a) {
            case 2:
                ProfileActivity profileActivity = this.f37396b;
                profileActivity.P1 = false;
                profileActivity.f33575a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37395a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37396b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37396b;
                AnimatorSet animatorSet = profileActivity.f33730w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f33730w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37396b;
                profileActivity2.P1 = false;
                profileActivity2.f33575a.O0 = true;
                profileActivity2.f33650k2.removeListener(this);
                profileActivity2.f33606e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33674o0.setVisibility(0);
                profileActivity2.f33674o0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37396b;
                profileActivity3.f33650k2.removeListener(this);
                profileActivity3.f33674o0.setVisibility(8);
                profileActivity3.f33674o0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37396b;
                profileActivity4.f33739x0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37395a) {
            case 2:
                ProfileActivity profileActivity = this.f37396b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33674o0.setAnimatedFileMaybe(profileActivity.f33613f0.getImageReceiver().getAnimation());
                profileActivity.f33674o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
