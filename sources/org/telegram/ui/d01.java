package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class d01 extends AnimatorListenerAdapter {
    public final int f32979a;
    public final ProfileActivity f32980b;

    public d01(ProfileActivity profileActivity, int i10) {
        this.f32979a = i10;
        this.f32980b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32979a) {
            case 2:
                ProfileActivity profileActivity = this.f32980b;
                profileActivity.O1 = false;
                profileActivity.f31251a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32979a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f32980b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f32980b;
                AnimatorSet animatorSet = profileActivity.f31405w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f31405w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f32980b;
                profileActivity2.O1 = false;
                profileActivity2.f31251a.N0 = true;
                profileActivity2.f31319j2.removeListener(this);
                profileActivity2.f31275d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f31342n0.setVisibility(0);
                profileActivity2.f31342n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f32980b;
                profileActivity3.f31319j2.removeListener(this);
                profileActivity3.f31342n0.setVisibility(8);
                profileActivity3.f31342n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f32980b;
                profileActivity4.f31406w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32979a) {
            case 2:
                ProfileActivity profileActivity = this.f32980b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f31342n0.setAnimatedFileMaybe(profileActivity.f31281e0.getImageReceiver().getAnimation());
                profileActivity.f31342n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
