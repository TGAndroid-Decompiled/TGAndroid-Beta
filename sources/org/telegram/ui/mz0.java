package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
public final class mz0 extends AnimatorListenerAdapter {
    public final int f41725a;
    public final ProfileActivity f41726b;

    public mz0(ProfileActivity profileActivity, int i10) {
        this.f41725a = i10;
        this.f41726b = profileActivity;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41725a) {
            case 0:
                this.f41726b.I5 = null;
                return;
            case 3:
                ProfileActivity profileActivity = this.f41726b;
                profileActivity.O1 = false;
                profileActivity.f35945a.O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f41725a;
        ProfileActivity profileActivity = this.f41726b;
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
                        animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f36056p5, 1.0f));
                        profileActivity.J5.setDuration(100L);
                        profileActivity.J5.addListener(new i50(this, 22));
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
                profileActivity.f35945a.O0 = true;
                profileActivity.f36013j2.removeListener(this);
                profileActivity.f35969d1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.f36037n0.setVisibility(0);
                profileActivity.f36037n0.setAlpha(1.0f);
                return;
            case 4:
                profileActivity.f36013j2.removeListener(this);
                profileActivity.f36037n0.setVisibility(8);
                profileActivity.f36037n0.setAlpha(1.0f);
                return;
            default:
                profileActivity.f36101w0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41725a) {
            case 3:
                ProfileActivity profileActivity = this.f41726b;
                ProfileActivity.z3(profileActivity, false);
                profileActivity.f36037n0.setAnimatedFileMaybe(profileActivity.f35975e0.getImageReceiver().getAnimation());
                profileActivity.f36037n0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
