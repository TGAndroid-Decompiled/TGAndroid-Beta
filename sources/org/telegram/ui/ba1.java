package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ba1 extends org.telegram.ui.Components.sj0 {
    public final Context f44009c;
    public final TwoStepVerificationActivity d;

    public ba1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f44009c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.H && twoStepVerificationActivity.J != null) {
            return twoStepVerificationActivity.U;
        }
        return 0;
    }

    @Override
    public final int d(int i3) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i3 != twoStepVerificationActivity.Q && i3 != twoStepVerificationActivity.T) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i3 == twoStepVerificationActivity.Q) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131745558, null));
                    return;
                } else if (i3 == twoStepVerificationActivity.T) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131751143, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        v9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i3 == i10) {
            v9Var.b(org.telegram.messenger.bd.M0(2131752541, null), true);
        } else if (i3 != twoStepVerificationActivity.P) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i3 == i11) {
                v9Var.b(org.telegram.messenger.bd.M0(2131743952, null), true);
            } else if (i3 == twoStepVerificationActivity.S) {
                v9Var.b(org.telegram.messenger.bd.M0(2131752531, null), false);
            } else if (i3 == twoStepVerificationActivity.R) {
                v9Var.b(org.telegram.messenger.bd.M0(2131745525, null), false);
            }
        } else {
            v9Var.b(org.telegram.messenger.bd.M0(2131745559, null), true);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View v9Var;
        Context context = this.f44009c;
        if (i3 != 0) {
            v9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, v9Var, null);
        }
        return new u4.d1(v9Var);
    }
}
