package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class g01 extends AnimatorListenerAdapter {
    public final int f32956a;
    public final boolean f32957b;
    public final ProfileActivity f32958c;

    public g01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f32956a = i10;
        this.f32958c = profileActivity;
        this.f32957b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32956a) {
            case 1:
                this.f32958c.f30388f0 = null;
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
        switch (this.f32956a) {
            case 0:
                ProfileActivity profileActivity = this.f32958c;
                boolean z10 = this.f32957b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                    if (w0Var.F.getWidth() != 0 && !w0Var.e.isFocused()) {
                        w0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f32958c;
                if (profileActivity2.f30388f0 != null && (y3Var = profileActivity2.f30395g0) != null) {
                    if (!this.f32957b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f30388f0 = null;
                    return;
                }
                return;
        }
    }
}
