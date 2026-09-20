package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class c01 extends AnimatorListenerAdapter {
    public final int f32575a;
    public final boolean f32576b;
    public final ProfileActivity f32577c;

    public c01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f32575a = i10;
        this.f32577c = profileActivity;
        this.f32576b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32575a) {
            case 1:
                this.f32577c.f31560f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.a4 a4Var;
        switch (this.f32575a) {
            case 0:
                ProfileActivity profileActivity = this.f32577c;
                boolean z10 = this.f32576b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.e.isFocused()) {
                        v0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f32577c;
                if (profileActivity2.f31560f0 != null && (a4Var = profileActivity2.f31567g0) != null) {
                    if (!this.f32576b) {
                        a4Var.setVisibility(4);
                    }
                    profileActivity2.f31560f0 = null;
                    return;
                }
                return;
        }
    }
}
