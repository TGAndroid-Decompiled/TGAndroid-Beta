package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class lf1 extends org.telegram.ui.Components.yk0 {

    public final Context f40075c;
    public final TwoStepVerificationActivity d;

    public lf1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f40075c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.C || twoStepVerificationActivity.E == null) {
            return 0;
        }
        return twoStepVerificationActivity.P;
    }

    @Override
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i10 == twoStepVerificationActivity.L || i10 == twoStepVerificationActivity.O) ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == twoStepVerificationActivity.L) {
                x8Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                return;
            } else {
                if (i10 == twoStepVerificationActivity.O) {
                    x8Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        x9Var.setTag(Integer.valueOf(i12));
        x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        if (i10 == twoStepVerificationActivity.changePasswordRow) {
            x9Var.b(LocaleController.getString(R.string.ChangePassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.K) {
            x9Var.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
            return;
        }
        if (i10 == twoStepVerificationActivity.turnPasswordOffRow) {
            x9Var.b(LocaleController.getString(R.string.TurnPasswordOff), true);
        } else if (i10 == twoStepVerificationActivity.N) {
            x9Var.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
        } else if (i10 == twoStepVerificationActivity.M) {
            x9Var.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x9Var;
        Context context = this.f40075c;
        if (i10 != 0) {
            x9Var = new org.telegram.ui.Cells.x8(context);
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
            x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        }
        return new org.telegram.ui.Components.lk0(x9Var);
    }
}
