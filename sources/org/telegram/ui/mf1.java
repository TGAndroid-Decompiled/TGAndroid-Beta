package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mf1 extends org.telegram.ui.Components.vk0 {
    public final Context f40418c;
    public final TwoStepVerificationActivity d;

    public mf1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f40418c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
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
    public final int j(int i9) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i9 != twoStepVerificationActivity.L && i9 != twoStepVerificationActivity.O) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i12 != 0) {
            if (i12 == 1) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == twoStepVerificationActivity.L) {
                    b9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i9 == twoStepVerificationActivity.O) {
                    b9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        baVar.setTag(Integer.valueOf(i13));
        baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        i10 = twoStepVerificationActivity.changePasswordRow;
        if (i9 == i10) {
            baVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i9 != twoStepVerificationActivity.K) {
            i11 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i9 == i11) {
                baVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i9 == twoStepVerificationActivity.N) {
                baVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i9 == twoStepVerificationActivity.M) {
                baVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            baVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View baVar;
        Context context = this.f40418c;
        if (i9 != 0) {
            baVar = new org.telegram.ui.Cells.b9(context);
        } else {
            baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        }
        return new f2.q1(baVar);
    }
}
