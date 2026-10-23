package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class jz0 extends AnimatorListenerAdapter {
    public final int f38730a;
    public final boolean f38731b;
    public final ProfileActivity f38732c;

    public jz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f38730a = i10;
        this.f38732c = profileActivity;
        this.f38731b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38730a) {
            case 1:
                this.f38732c.f33927g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.f38730a) {
            case 0:
                ProfileActivity profileActivity = this.f38732c;
                boolean z10 = this.f38731b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                    if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                        u0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(u0Var.e);
                    }
                }
                profileActivity.m4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.W4 = true;
                    profileActivity.H4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f38732c;
                if (profileActivity2.f33927g0 != null && (y3Var = profileActivity2.f33934h0) != null) {
                    if (!this.f38731b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f33927g0 = null;
                    return;
                }
                return;
        }
    }
}
