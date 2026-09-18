package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class eh1 extends org.telegram.ui.ActionBar.j {
    public final gh1 f33281a;

    public eh1(gh1 gh1Var) {
        this.f33281a = gh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.d5 d5Var;
        gh1 gh1Var = this.f33281a;
        if (i10 == -1) {
            if (gh1Var.G >= 0) {
                d5Var = ((org.telegram.ui.ActionBar.n2) gh1Var).parentLayout;
                if (d5Var.getFragmentStack().size() == 1) {
                    gh1Var.I0();
                    return;
                }
            }
            gh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gh1Var.getParentActivity());
            TL_account.Password password = gh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new ol0(this, 25));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18622a;
            gh1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
            }
        }
    }
}
