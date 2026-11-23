package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class na1 extends org.telegram.ui.Components.dk0 {
    public final Context f50150c;
    public final TwoStepVerificationActivity d;

    public na1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f50150c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 0) {
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
        int i12 = e1Var.f59115f;
        View view = e1Var.f59111a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i7 == twoStepVerificationActivity.Q) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131745352, null));
                    return;
                } else if (i7 == twoStepVerificationActivity.T) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131751130, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        x9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            x9Var.b(org.telegram.messenger.hd.N0(2131752529, null), true);
        } else if (i7 != twoStepVerificationActivity.P) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i7 == i11) {
                x9Var.b(org.telegram.messenger.hd.N0(2131743699, null), true);
            } else if (i7 == twoStepVerificationActivity.S) {
                x9Var.b(org.telegram.messenger.hd.N0(2131752519, null), false);
            } else if (i7 == twoStepVerificationActivity.R) {
                x9Var.b(org.telegram.messenger.hd.N0(2131745319, null), false);
            }
        } else {
            x9Var.b(org.telegram.messenger.hd.N0(2131745353, null), true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View x9Var;
        Context context = this.f50150c;
        if (i7 != 0) {
            x9Var = new org.telegram.ui.Cells.a9(context);
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, x9Var, null);
        }
        return new v4.e1(x9Var);
    }
}
