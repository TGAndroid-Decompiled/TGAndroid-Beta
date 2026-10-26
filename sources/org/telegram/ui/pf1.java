package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pf1 extends org.telegram.ui.Components.lm0 {
    public final Context f42495c;
    public final TwoStepVerificationActivity d;

    public pf1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f42495c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.G && twoStepVerificationActivity.I != null) {
            return twoStepVerificationActivity.T;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i10 != twoStepVerificationActivity.P && i10 != twoStepVerificationActivity.S) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13 = e1Var.f47741f;
        View view = e1Var.f47738a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == twoStepVerificationActivity.P) {
                    i9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.S) {
                    i9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        gaVar.setTag(Integer.valueOf(i14));
        org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), i14, null);
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            gaVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.O) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                gaVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.R) {
                gaVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.Q) {
                gaVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            gaVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View gaVar;
        Context context = this.f42495c;
        if (i10 != 0) {
            gaVar = new org.telegram.ui.Cells.i9(context);
        } else {
            gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, gaVar, null);
        }
        return new s4.e1(gaVar);
    }
}
