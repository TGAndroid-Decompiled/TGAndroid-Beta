package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ja1 extends org.telegram.ui.Components.tj0 {
    public final Context f48289c;
    public final TwoStepVerificationActivity d;

    public ja1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f48289c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
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
    public final int d(int i7) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i7 != twoStepVerificationActivity.Q && i7 != twoStepVerificationActivity.T) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i7 == twoStepVerificationActivity.Q) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131745548, null));
                    return;
                } else if (i7 == twoStepVerificationActivity.T) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131751142, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        v9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            v9Var.b(org.telegram.messenger.hd.M0(2131752541, null), true);
        } else if (i7 != twoStepVerificationActivity.P) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i7 == i11) {
                v9Var.b(org.telegram.messenger.hd.M0(2131743942, null), true);
            } else if (i7 == twoStepVerificationActivity.S) {
                v9Var.b(org.telegram.messenger.hd.M0(2131752531, null), false);
            } else if (i7 == twoStepVerificationActivity.R) {
                v9Var.b(org.telegram.messenger.hd.M0(2131745515, null), false);
            }
        } else {
            v9Var.b(org.telegram.messenger.hd.M0(2131745549, null), true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View v9Var;
        Context context = this.f48289c;
        if (i7 != 0) {
            v9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, v9Var, null);
        }
        return new v4.e1(v9Var);
    }
}
