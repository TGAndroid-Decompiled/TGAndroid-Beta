package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class b01 extends AnimatorListenerAdapter {
    public final int f36127a;
    public final ProfileActivity f36128b;

    public b01(ProfileActivity profileActivity, int i10) {
        this.f36127a = i10;
        this.f36128b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36127a) {
            case 2:
                ProfileActivity profileActivity = this.f36128b;
                profileActivity.O1 = false;
                profileActivity.f34249a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36127a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36128b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36128b;
                AnimatorSet animatorSet = profileActivity.f34404w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34404w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36128b;
                profileActivity2.O1 = false;
                profileActivity2.f34249a.O0 = true;
                profileActivity2.f34318j2.removeListener(this);
                profileActivity2.f34273d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34341n0.setVisibility(0);
                profileActivity2.f34341n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36128b;
                profileActivity3.f34318j2.removeListener(this);
                profileActivity3.f34341n0.setVisibility(8);
                profileActivity3.f34341n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36128b;
                profileActivity4.f34405w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36127a) {
            case 2:
                ProfileActivity profileActivity = this.f36128b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34341n0.setAnimatedFileMaybe(profileActivity.f34280e0.getImageReceiver().getAnimation());
                profileActivity.f34341n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
