package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f50329a;
    public final boolean f50330b;
    public final ProfileActivity f50331c;

    public nv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.f50329a = i7;
        this.f50331c = profileActivity;
        this.f50330b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50329a) {
            case 1:
                this.f50331c.f43554g0 = null;
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
        switch (this.f50329a) {
            case 0:
                ProfileActivity profileActivity = this.f50331c;
                boolean z10 = this.f50330b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    if (h5Var.G.getWidth() != 0 && !h5Var.f29923e.isFocused()) {
                        h5Var.f29923e.requestFocus();
                        org.telegram.messenger.g0.I3(h5Var.f29923e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Y4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) profileActivity).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f50331c;
                if (profileActivity2.f43554g0 != null && (b4Var = profileActivity2.f43561h0) != null) {
                    if (!this.f50330b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f43554g0 = null;
                    return;
                }
                return;
        }
    }
}
