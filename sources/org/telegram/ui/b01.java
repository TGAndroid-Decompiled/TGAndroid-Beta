package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class b01 extends AnimatorListenerAdapter {
    public final int f32247a;
    public final ProfileActivity f32248b;

    public b01(ProfileActivity profileActivity, int i10) {
        this.f32247a = i10;
        this.f32248b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32247a) {
            case 2:
                ProfileActivity profileActivity = this.f32248b;
                profileActivity.O1 = false;
                profileActivity.f31543a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32247a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f32248b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f32248b;
                AnimatorSet animatorSet = profileActivity.f31697w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31697w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f32248b;
                profileActivity2.O1 = false;
                profileActivity2.f31543a.N0 = true;
                profileActivity2.f31611j2.removeListener(this);
                profileActivity2.f31567d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31634n0.setVisibility(0);
                profileActivity2.f31634n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f32248b;
                profileActivity3.f31611j2.removeListener(this);
                profileActivity3.f31634n0.setVisibility(8);
                profileActivity3.f31634n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f32248b;
                profileActivity4.f31698w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32247a) {
            case 2:
                ProfileActivity profileActivity = this.f32248b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31634n0.setAnimatedFileMaybe(profileActivity.f31573e0.getImageReceiver().getAnimation());
                profileActivity.f31634n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
