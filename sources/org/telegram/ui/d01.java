package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class d01 extends AnimatorListenerAdapter {
    public final int f36592a;
    public final ProfileActivity f36593b;

    public d01(ProfileActivity profileActivity, int i10) {
        this.f36592a = i10;
        this.f36593b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36592a) {
            case 2:
                ProfileActivity profileActivity = this.f36593b;
                profileActivity.O1 = false;
                profileActivity.f34050a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36592a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36593b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36593b;
                AnimatorSet animatorSet = profileActivity.f34205w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34205w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36593b;
                profileActivity2.O1 = false;
                profileActivity2.f34050a.O0 = true;
                profileActivity2.f34119j2.removeListener(this);
                profileActivity2.f34074d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34142n0.setVisibility(0);
                profileActivity2.f34142n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36593b;
                profileActivity3.f34119j2.removeListener(this);
                profileActivity3.f34142n0.setVisibility(8);
                profileActivity3.f34142n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36593b;
                profileActivity4.f34206w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36592a) {
            case 2:
                ProfileActivity profileActivity = this.f36593b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34142n0.setAnimatedFileMaybe(profileActivity.f34081e0.getImageReceiver().getAnimation());
                profileActivity.f34142n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
