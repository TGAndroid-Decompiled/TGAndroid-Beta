package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class b01 extends AnimatorListenerAdapter {
    public final int f32210a;
    public final ProfileActivity f32211b;

    public b01(ProfileActivity profileActivity, int i10) {
        this.f32210a = i10;
        this.f32211b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32210a) {
            case 2:
                ProfileActivity profileActivity = this.f32211b;
                profileActivity.O1 = false;
                profileActivity.f31482a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32210a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f32211b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f32211b;
                AnimatorSet animatorSet = profileActivity.f31636w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31636w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f32211b;
                profileActivity2.O1 = false;
                profileActivity2.f31482a.N0 = true;
                profileActivity2.f31550j2.removeListener(this);
                profileActivity2.f31506d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31573n0.setVisibility(0);
                profileActivity2.f31573n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f32211b;
                profileActivity3.f31550j2.removeListener(this);
                profileActivity3.f31573n0.setVisibility(8);
                profileActivity3.f31573n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f32211b;
                profileActivity4.f31637w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32210a) {
            case 2:
                ProfileActivity profileActivity = this.f32211b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31573n0.setAnimatedFileMaybe(profileActivity.f31512e0.getImageReceiver().getAnimation());
                profileActivity.f31573n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
