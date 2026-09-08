package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fh1 extends org.telegram.ui.ActionBar.j {
    public final hh1 f36434a;

    public fh1(hh1 hh1Var) {
        this.f36434a = hh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.d5 d5Var;
        hh1 hh1Var = this.f36434a;
        if (i10 == -1) {
            if (hh1Var.G >= 0) {
                d5Var = ((org.telegram.ui.ActionBar.n2) hh1Var).parentLayout;
                if (d5Var.getFragmentStack().size() == 1) {
                    hh1Var.I0();
                    return;
                }
            }
            hh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
            TL_account.Password password = hh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new vl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20225a;
            hh1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
            }
        }
    }
}
