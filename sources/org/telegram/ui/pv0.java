package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class pv0 extends AnimatorListenerAdapter {
    public final int f48817a;
    public final boolean f48818b;
    public final ProfileActivity f48819c;

    public pv0(ProfileActivity profileActivity, boolean z9, int i7) {
        this.f48817a = i7;
        this.f48819c = profileActivity;
        this.f48818b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f48817a) {
            case 1:
                this.f48819c.f41737f0 = null;
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
        switch (this.f48817a) {
            case 0:
                ProfileActivity profileActivity = this.f48819c;
                boolean z9 = this.f48818b;
                ProfileActivity.y1(profileActivity, z9);
                profileActivity.X.setClickable(true);
                if (z9) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var.F.getWidth() != 0 && !f5Var.f28430e.isFocused()) {
                        f5Var.f28430e.requestFocus();
                        org.telegram.messenger.g0.K3(f5Var.f28430e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z9) {
                    profileActivity.U4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    profileActivity.O.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f48819c;
                if (profileActivity2.f41737f0 != null && (b4Var = profileActivity2.f41744g0) != null) {
                    if (!this.f48818b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f41737f0 = null;
                    return;
                }
                return;
        }
    }
}
