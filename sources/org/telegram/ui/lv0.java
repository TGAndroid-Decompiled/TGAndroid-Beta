package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class lv0 extends AnimatorListenerAdapter {
    public final int f49046a;
    public final boolean f49047b;
    public final ProfileActivity f49048c;

    public lv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.f49046a = i7;
        this.f49048c = profileActivity;
        this.f49047b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f49046a) {
            case 1:
                this.f49048c.f43108g0 = null;
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
        switch (this.f49046a) {
            case 0:
                ProfileActivity profileActivity = this.f49048c;
                boolean z10 = this.f49047b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                    if (d5Var.G.getWidth() != 0 && !d5Var.f29502e.isFocused()) {
                        d5Var.f29502e.requestFocus();
                        org.telegram.messenger.g0.J3(d5Var.f29502e);
                    }
                }
                profileActivity.A4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.W4 = true;
                    profileActivity.V4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.e2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f49048c;
                if (profileActivity2.f43108g0 != null && (b4Var = profileActivity2.f43115h0) != null) {
                    if (!this.f49047b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f43108g0 = null;
                    return;
                }
                return;
        }
    }
}
