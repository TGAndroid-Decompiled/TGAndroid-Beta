package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class i01 extends AnimatorListenerAdapter {
    public final int f37002a;
    public final ProfileActivity f37003b;

    public i01(ProfileActivity profileActivity, int i10) {
        this.f37002a = i10;
        this.f37003b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37002a) {
            case 2:
                ProfileActivity profileActivity = this.f37003b;
                profileActivity.O1 = false;
                profileActivity.f32528a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37002a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37003b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f37003b;
                AnimatorSet animatorSet = profileActivity.f32683w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f32683w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f37003b;
                profileActivity2.O1 = false;
                profileActivity2.f32528a.O0 = true;
                profileActivity2.f32596j2.removeListener(this);
                profileActivity2.f32552d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f32620n0.setVisibility(0);
                profileActivity2.f32620n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f37003b;
                profileActivity3.f32596j2.removeListener(this);
                profileActivity3.f32620n0.setVisibility(8);
                profileActivity3.f32620n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f37003b;
                profileActivity4.f32684w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37002a) {
            case 2:
                ProfileActivity profileActivity = this.f37003b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f32620n0.setAnimatedFileMaybe(profileActivity.f32558e0.getImageReceiver().getAnimation());
                profileActivity.f32620n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
