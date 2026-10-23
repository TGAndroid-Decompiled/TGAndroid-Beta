package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ez0 extends AnimatorListenerAdapter {
    public final int f36845a;
    public final ProfileActivity f36846b;

    public ez0(ProfileActivity profileActivity, int i10) {
        this.f36845a = i10;
        this.f36846b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36845a) {
            case 2:
                ProfileActivity profileActivity = this.f36846b;
                profileActivity.P1 = false;
                profileActivity.f33585a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36845a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36846b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f36846b;
                AnimatorSet animatorSet = profileActivity.f33740w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f33740w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f36846b;
                profileActivity2.P1 = false;
                profileActivity2.f33585a.O0 = true;
                profileActivity2.f33660k2.removeListener(this);
                profileActivity2.f33616e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33684o0.setVisibility(0);
                profileActivity2.f33684o0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f36846b;
                profileActivity3.f33660k2.removeListener(this);
                profileActivity3.f33684o0.setVisibility(8);
                profileActivity3.f33684o0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f36846b;
                profileActivity4.f33749x0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36845a) {
            case 2:
                ProfileActivity profileActivity = this.f36846b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33684o0.setAnimatedFileMaybe(profileActivity.f33623f0.getImageReceiver().getAnimation());
                profileActivity.f33684o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
