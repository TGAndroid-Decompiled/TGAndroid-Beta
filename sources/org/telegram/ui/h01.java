package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class h01 extends AnimatorListenerAdapter {
    public final int f36362a;
    public final ProfileActivity f36363b;

    public h01(ProfileActivity profileActivity, int i10) {
        this.f36362a = i10;
        this.f36363b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36362a) {
            case 2:
                ProfileActivity profileActivity = this.f36363b;
                profileActivity.O1 = false;
                profileActivity.f32230a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36362a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36363b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36363b;
                AnimatorSet animatorSet = profileActivity.f32385w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f32385w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36363b;
                profileActivity2.O1 = false;
                profileActivity2.f32230a.O0 = true;
                profileActivity2.f32298j2.removeListener(this);
                profileActivity2.f32254d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f32322n0.setVisibility(0);
                profileActivity2.f32322n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36363b;
                profileActivity3.f32298j2.removeListener(this);
                profileActivity3.f32322n0.setVisibility(8);
                profileActivity3.f32322n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36363b;
                profileActivity4.f32386w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36362a) {
            case 2:
                ProfileActivity profileActivity = this.f36363b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f32322n0.setAnimatedFileMaybe(profileActivity.f32260e0.getImageReceiver().getAnimation());
                profileActivity.f32322n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
