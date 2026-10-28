package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
public final class oz0 extends AnimatorListenerAdapter {
    public final int f42263a;
    public final ProfileActivity f42264b;

    public oz0(ProfileActivity profileActivity, int i10) {
        this.f42263a = i10;
        this.f42264b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42263a) {
            case 0:
                this.f42264b.I5 = null;
                return;
            case 3:
                ProfileActivity profileActivity = this.f42264b;
                profileActivity.O1 = false;
                profileActivity.f35972a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f42263a;
        ProfileActivity profileActivity = this.f42264b;
        switch (i10) {
            case 0:
                if (profileActivity.I5 != null) {
                    if (profileActivity.L5) {
                        if (profileActivity.L0) {
                            profileActivity.Q0.setVisibility(8);
                        }
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        profileActivity.T0.setVisibility(8);
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        profileActivity.J5 = animatorSet;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f36083p5, 1.0f));
                        profileActivity.J5.setDuration(100L);
                        profileActivity.J5.addListener(new k50(this, 22));
                        profileActivity.J5.start();
                    }
                }
                profileActivity.x5(false);
                profileActivity.I5 = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                int i11 = ProfileActivity.R6;
                profileActivity.r4(true);
                return;
            case 2:
                AnimatorSet animatorSet2 = profileActivity.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.v = null;
                    return;
                }
                return;
            case 3:
                profileActivity.O1 = false;
                profileActivity.f35972a.O0 = true;
                profileActivity.f36040j2.removeListener(this);
                profileActivity.f35996d1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f36064n0.setVisibility(0);
                profileActivity.f36064n0.setAlpha(1.0f);
                return;
            case 4:
                profileActivity.f36040j2.removeListener(this);
                profileActivity.f36064n0.setVisibility(8);
                profileActivity.f36064n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f36128w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42263a) {
            case 3:
                ProfileActivity profileActivity = this.f42264b;
                ProfileActivity.z3(profileActivity, false);
                profileActivity.f36064n0.setAnimatedFileMaybe(profileActivity.f36002e0.getImageReceiver().getAnimation());
                profileActivity.f36064n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
