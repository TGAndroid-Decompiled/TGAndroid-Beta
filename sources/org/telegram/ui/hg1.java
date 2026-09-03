package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg1 extends org.telegram.ui.Components.ql0 {
    public final Context f34671c;
    public final TwoStepVerificationActivity d;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f34671c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.D && twoStepVerificationActivity.F != null) {
            return twoStepVerificationActivity.Q;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i10 != twoStepVerificationActivity.M && i10 != twoStepVerificationActivity.P) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == twoStepVerificationActivity.M) {
                    z8Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.P) {
                    z8Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        z9Var.setTag(Integer.valueOf(i14));
        z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            z9Var.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.L) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                z9Var.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.O) {
                z9Var.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.N) {
                z9Var.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            z9Var.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z9Var;
        Context context = this.f34671c;
        if (i10 != 0) {
            z9Var = new org.telegram.ui.Cells.z8(context);
        } else {
            z9Var = new org.telegram.ui.Cells.z9(context);
            z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        }
        return new f2.l1(z9Var);
    }
}
