package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f50313a;
    public final boolean f50314b;
    public final ProfileActivity f50315c;

    public nv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.f50313a = i7;
        this.f50315c = profileActivity;
        this.f50314b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50313a) {
            case 1:
                this.f50315c.f43554g0 = null;
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
        switch (this.f50313a) {
            case 0:
                ProfileActivity profileActivity = this.f50315c;
                boolean z10 = this.f50314b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    if (h5Var.G.getWidth() != 0 && !h5Var.f29921e.isFocused()) {
                        h5Var.f29921e.requestFocus();
                        org.telegram.messenger.g0.I3(h5Var.f29921e);
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
                ProfileActivity profileActivity2 = this.f50315c;
                if (profileActivity2.f43554g0 != null && (c4Var = profileActivity2.f43561h0) != null) {
                    if (!this.f50314b) {
                        c4Var.setVisibility(4);
                    }
                    profileActivity2.f43554g0 = null;
                    return;
                }
                return;
        }
    }
}
