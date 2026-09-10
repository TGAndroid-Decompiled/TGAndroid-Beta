package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class f01 extends AnimatorListenerAdapter {
    public final int f32661a;
    public final ProfileActivity f32662b;

    public f01(ProfileActivity profileActivity, int i10) {
        this.f32661a = i10;
        this.f32662b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32661a) {
            case 2:
                ProfileActivity profileActivity = this.f32662b;
                profileActivity.O1 = false;
                profileActivity.f30350a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32661a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f32662b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f32662b;
                AnimatorSet animatorSet = profileActivity.f30504w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f30504w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f32662b;
                profileActivity2.O1 = false;
                profileActivity2.f30350a.N0 = true;
                profileActivity2.f30418j2.removeListener(this);
                profileActivity2.f30374d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f30441n0.setVisibility(0);
                profileActivity2.f30441n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f32662b;
                profileActivity3.f30418j2.removeListener(this);
                profileActivity3.f30441n0.setVisibility(8);
                profileActivity3.f30441n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f32662b;
                profileActivity4.f30505w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32661a) {
            case 2:
                ProfileActivity profileActivity = this.f32662b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f30441n0.setAnimatedFileMaybe(profileActivity.f30380e0.getImageReceiver().getAnimation());
                profileActivity.f30441n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
