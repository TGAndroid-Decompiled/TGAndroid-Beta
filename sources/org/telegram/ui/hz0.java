package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f37672a;
    public final boolean f37673b;
    public final ProfileActivity f37674c;

    public hz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f37672a = i10;
        this.f37674c = profileActivity;
        this.f37673b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37672a) {
            case 1:
                this.f37674c.f33613g0 = null;
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
        switch (this.f37672a) {
            case 0:
                ProfileActivity profileActivity = this.f37674c;
                boolean z10 = this.f37673b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                    if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                        u0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(u0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.W4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f37674c;
                if (profileActivity2.f33613g0 != null && (y3Var = profileActivity2.f33620h0) != null) {
                    if (!this.f37673b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f33613g0 = null;
                    return;
                }
                return;
        }
    }
}
