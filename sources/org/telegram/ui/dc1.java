package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class dc1 extends org.telegram.ui.Components.tk0 {
    public final Context f36558c;
    public final TwoStepVerificationActivity d;

    public dc1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f36558c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.G && twoStepVerificationActivity.I != null) {
            return twoStepVerificationActivity.T;
        }
        return 0;
    }

    @Override
    public final int d(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i10 != twoStepVerificationActivity.P && i10 != twoStepVerificationActivity.S) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i10 == twoStepVerificationActivity.P) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131745565, null));
                    return;
                } else if (i10 == twoStepVerificationActivity.S) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131751143, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        x9Var.setTag(Integer.valueOf(i14));
        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), i14, null);
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            x9Var.b(org.telegram.messenger.dd.L0(2131752541, null), true);
        } else if (i10 != twoStepVerificationActivity.O) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                x9Var.b(org.telegram.messenger.dd.L0(2131743967, null), true);
            } else if (i10 == twoStepVerificationActivity.R) {
                x9Var.b(org.telegram.messenger.dd.L0(2131752531, null), false);
            } else if (i10 == twoStepVerificationActivity.Q) {
                x9Var.b(org.telegram.messenger.dd.L0(2131745532, null), false);
            }
        } else {
            x9Var.b(org.telegram.messenger.dd.L0(2131745566, null), true);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View x9Var;
        Context context = this.f36558c;
        if (i10 != 0) {
            x9Var = new org.telegram.ui.Cells.b9(context);
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, x9Var, null);
        }
        return new s4.c1(x9Var);
    }
}
