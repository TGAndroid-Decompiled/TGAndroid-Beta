package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gh1 extends org.telegram.ui.ActionBar.j {
    public final ih1 f38019a;

    public gh1(ih1 ih1Var) {
        this.f38019a = ih1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.d5 d5Var;
        ih1 ih1Var = this.f38019a;
        if (i10 == -1) {
            if (ih1Var.G >= 0) {
                d5Var = ((org.telegram.ui.ActionBar.n2) ih1Var).parentLayout;
                if (d5Var.getFragmentStack().size() == 1) {
                    ih1Var.I0();
                    return;
                }
            }
            ih1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ih1Var.getParentActivity());
            TL_account.Password password = ih1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new hq0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20374a;
            ih1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
            }
        }
    }
}
