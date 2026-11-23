package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class la1 extends org.telegram.ui.Components.dk0 {
    public final Context f49677c;
    public final TwoStepVerificationActivity d;

    public la1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f49677c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 0) {
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        int i12 = f1Var.f59249f;
        View view = f1Var.f59245a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i7 == twoStepVerificationActivity.Q) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131745352, null));
                    return;
                } else if (i7 == twoStepVerificationActivity.T) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131751130, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        w9Var.setTag(Integer.valueOf(i13));
        org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), i13, null);
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i7 == i10) {
            w9Var.b(org.telegram.messenger.gd.N0(2131752529, null), true);
        } else if (i7 != twoStepVerificationActivity.P) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i7 == i11) {
                w9Var.b(org.telegram.messenger.gd.N0(2131743695, null), true);
            } else if (i7 == twoStepVerificationActivity.S) {
                w9Var.b(org.telegram.messenger.gd.N0(2131752519, null), false);
            } else if (i7 == twoStepVerificationActivity.R) {
                w9Var.b(org.telegram.messenger.gd.N0(2131745319, null), false);
            }
        } else {
            w9Var.b(org.telegram.messenger.gd.N0(2131745353, null), true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View w9Var;
        Context context = this.f49677c;
        if (i7 != 0) {
            w9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, w9Var, null);
        }
        return new v4.f1(w9Var);
    }
}
