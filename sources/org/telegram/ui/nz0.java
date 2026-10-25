package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class nz0 extends AnimatorListenerAdapter {
    public final int f42037a;
    public final boolean f42038b;
    public final ProfileActivity f42039c;

    public nz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f42037a = i10;
        this.f42039c = profileActivity;
        this.f42038b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42037a) {
            case 1:
                this.f42039c.f35983f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.d4 d4Var;
        switch (this.f42037a) {
            case 0:
                ProfileActivity profileActivity = this.f42039c;
                boolean z10 = this.f42038b;
                ProfileActivity.q1(profileActivity, z10);
                profileActivity.X.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                    if (w0Var.F.getWidth() != 0 && !w0Var.e.isFocused()) {
                        w0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.e);
                    }
                }
                profileActivity.r4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.f35950a5 = true;
                    profileActivity.N4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.O.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f42039c;
                if (profileActivity2.f35983f0 != null && (d4Var = profileActivity2.f35990g0) != null) {
                    if (!this.f42038b) {
                        d4Var.setVisibility(4);
                    }
                    profileActivity2.f35983f0 = null;
                    return;
                }
                return;
        }
    }
}
