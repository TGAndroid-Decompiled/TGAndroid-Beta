package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f50320a;
    public final boolean f50321b;
    public final ProfileActivity f50322c;

    public nv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.f50320a = i7;
        this.f50322c = profileActivity;
        this.f50321b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50320a) {
            case 1:
                this.f50322c.f43595g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.Cells.c4 c4Var;
        switch (this.f50320a) {
            case 0:
                ProfileActivity profileActivity = this.f50322c;
                boolean z10 = this.f50321b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    if (g5Var.G.getWidth() != 0 && !g5Var.f29904e.isFocused()) {
                        g5Var.f29904e.requestFocus();
                        org.telegram.messenger.g0.I3(g5Var.f29904e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Y4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f50322c;
                if (profileActivity2.f43595g0 != null && (c4Var = profileActivity2.f43602h0) != null) {
                    if (!this.f50321b) {
                        c4Var.setVisibility(4);
                    }
                    profileActivity2.f43595g0 = null;
                    return;
                }
                return;
        }
    }
}
