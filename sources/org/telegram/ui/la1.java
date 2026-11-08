package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class la1 extends org.telegram.ui.Components.oj0 {
    public final Context f47494c;
    public final TwoStepVerificationActivity d;

    public la1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f47494c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 0) {
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
    public final int d(int i7) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i7 != twoStepVerificationActivity.P && i7 != twoStepVerificationActivity.S) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        int i12 = d1Var.f57047f;
        View view = d1Var.f57043a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == twoStepVerificationActivity.P) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131745551, null));
                    return;
                } else if (i7 == twoStepVerificationActivity.S) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131751143, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        w9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            w9Var.b(org.telegram.messenger.id.M0(2131752541, null), true);
        } else if (i7 != twoStepVerificationActivity.O) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i7 == i11) {
                w9Var.b(org.telegram.messenger.id.M0(2131743945, null), true);
            } else if (i7 == twoStepVerificationActivity.R) {
                w9Var.b(org.telegram.messenger.id.M0(2131752531, null), false);
            } else if (i7 == twoStepVerificationActivity.Q) {
                w9Var.b(org.telegram.messenger.id.M0(2131745518, null), false);
            }
        } else {
            w9Var.b(org.telegram.messenger.id.M0(2131745552, null), true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View w9Var;
        Context context = this.f47494c;
        if (i7 != 0) {
            w9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, w9Var, null);
        }
        return new v4.d1(w9Var);
    }
}
