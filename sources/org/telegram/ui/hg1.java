package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg1 extends org.telegram.ui.Components.rl0 {
    public final Context f37378c;
    public final TwoStepVerificationActivity d;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f37378c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == twoStepVerificationActivity.M) {
                    a9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.P) {
                    a9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        aaVar.setTag(Integer.valueOf(i14));
        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            aaVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.L) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                aaVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.O) {
                aaVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.N) {
                aaVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            aaVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View aaVar;
        Context context = this.f37378c;
        if (i10 != 0) {
            aaVar = new org.telegram.ui.Cells.a9(context);
        } else {
            aaVar = new org.telegram.ui.Cells.aa(context);
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        }
        return new f2.m1(aaVar);
    }
}
