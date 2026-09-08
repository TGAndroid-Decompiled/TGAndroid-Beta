package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class c01 extends AnimatorListenerAdapter {
    public final int f34991a;
    public final ProfileActivity f34992b;

    public c01(ProfileActivity profileActivity, int i10) {
        this.f34991a = i10;
        this.f34992b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34991a) {
            case 2:
                ProfileActivity profileActivity = this.f34992b;
                profileActivity.O1 = false;
                profileActivity.f33883a.N0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34991a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34992b.k4(true);
                return;
            case 1:
                ProfileActivity profileActivity = this.f34992b;
                AnimatorSet animatorSet = profileActivity.f34038w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.f34038w = null;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f34992b;
                profileActivity2.O1 = false;
                profileActivity2.f33883a.N0 = true;
                profileActivity2.f33952j2.removeListener(this);
                profileActivity2.f33907d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.f33975n0.setVisibility(0);
                profileActivity2.f33975n0.setAlpha(1.0f);
                return;
            case 3:
                ProfileActivity profileActivity3 = this.f34992b;
                profileActivity3.f33952j2.removeListener(this);
                profileActivity3.f33975n0.setVisibility(8);
                profileActivity3.f33975n0.setAlpha(1.0f);
                return;
            default:
                ProfileActivity profileActivity4 = this.f34992b;
                profileActivity4.f34039w0 = null;
                profileActivity4.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34991a) {
            case 2:
                ProfileActivity profileActivity = this.f34992b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.f33975n0.setAnimatedFileMaybe(profileActivity.f33914e0.getImageReceiver().getAnimation());
                profileActivity.f33975n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
