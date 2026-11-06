package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f47859a;
    public final boolean f47860b;
    public final ProfileActivity f47861c;

    public mv0(ProfileActivity profileActivity, boolean z9, int i7) {
        this.f47859a = i7;
        this.f47861c = profileActivity;
        this.f47860b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f47859a) {
            case 1:
                this.f47861c.f41702f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.f47859a) {
            case 0:
                ProfileActivity profileActivity = this.f47861c;
                boolean z9 = this.f47860b;
                ProfileActivity.y1(profileActivity, z9);
                profileActivity.X.setClickable(true);
                if (z9) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var.F.getWidth() != 0 && !f5Var.f28425e.isFocused()) {
                        f5Var.f28425e.requestFocus();
                        org.telegram.messenger.g0.K3(f5Var.f28425e);
                    }
                }
                profileActivity.y4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z9) {
                    profileActivity.U4 = true;
                    profileActivity.T4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    profileActivity.O.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f47861c;
                if (profileActivity2.f41702f0 != null && (b4Var = profileActivity2.f41709g0) != null) {
                    if (!this.f47860b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f41702f0 = null;
                    return;
                }
                return;
        }
    }
}
