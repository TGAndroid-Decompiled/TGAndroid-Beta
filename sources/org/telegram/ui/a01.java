package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class a01 extends AnimatorListenerAdapter {
    public final int f35862a;
    public final ProfileActivity f35863b;

    public a01(ProfileActivity profileActivity, int i10) {
        this.f35862a = i10;
        this.f35863b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35862a) {
            case 2:
                ProfileActivity profileActivity = this.f35863b;
                profileActivity.O1 = false;
                profileActivity.f34273a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35862a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f35863b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f35863b;
                AnimatorSet animatorSet = profileActivity.f34428w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34428w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f35863b;
                profileActivity2.O1 = false;
                profileActivity2.f34273a.O0 = true;
                profileActivity2.f34342j2.removeListener(this);
                profileActivity2.f34297d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f34365n0.setVisibility(0);
                profileActivity2.f34365n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f35863b;
                profileActivity3.f34342j2.removeListener(this);
                profileActivity3.f34365n0.setVisibility(8);
                profileActivity3.f34365n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f35863b;
                profileActivity4.f34429w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35862a) {
            case 2:
                ProfileActivity profileActivity = this.f35863b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f34365n0.setAnimatedFileMaybe(profileActivity.f34304e0.getImageReceiver().getAnimation());
                profileActivity.f34365n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
