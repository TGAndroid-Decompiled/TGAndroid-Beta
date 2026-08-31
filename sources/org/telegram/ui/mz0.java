package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class mz0 extends AnimatorListenerAdapter {
    public final int f39246a;
    public final boolean f39247b;
    public final ProfileActivity f39248c;

    public mz0(ProfileActivity profileActivity, boolean z4, int i10) {
        this.f39246a = i10;
        this.f39248c = profileActivity;
        this.f39247b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39246a) {
            case 1:
                this.f39248c.f34576c0 = null;
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
        switch (this.f39246a) {
            case 0:
                ProfileActivity profileActivity = this.f39248c;
                boolean z4 = this.f39247b;
                ProfileActivity.n1(profileActivity, z4);
                profileActivity.V.setClickable(true);
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    if (w0Var.C.getWidth() != 0 && !w0Var.f22349e.isFocused()) {
                        w0Var.f22349e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.f22349e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.S1 = null;
                profileActivity.fragmentView.invalidate();
                if (z4) {
                    profileActivity.R4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.M.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f39248c;
                if (profileActivity2.f34576c0 != null && (y3Var = profileActivity2.f34582d0) != null) {
                    if (!this.f39247b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f34576c0 = null;
                    return;
                }
                return;
        }
    }
}
