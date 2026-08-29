package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class of1 extends org.telegram.ui.Components.il0 {
    public final Context f41118c;
    public final TwoStepVerificationActivity d;

    public of1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f41118c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.C && twoStepVerificationActivity.E != null) {
            return twoStepVerificationActivity.P;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i10 != twoStepVerificationActivity.L && i10 != twoStepVerificationActivity.O) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == twoStepVerificationActivity.L) {
                    y8Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.O) {
                    y8Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        y9Var.setTag(Integer.valueOf(i14));
        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            y9Var.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.K) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                y9Var.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.N) {
                y9Var.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.M) {
                y9Var.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            y9Var.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y9Var;
        Context context = this.f41118c;
        if (i10 != 0) {
            y9Var = new org.telegram.ui.Cells.y8(context);
        } else {
            y9Var = new org.telegram.ui.Cells.y9(context);
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        }
        return new f2.n1(y9Var);
    }
}
