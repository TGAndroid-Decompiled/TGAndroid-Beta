package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fh1 extends org.telegram.ui.ActionBar.j {
    public final hh1 f37682a;

    public fh1(hh1 hh1Var) {
        this.f37682a = hh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.b5 b5Var;
        hh1 hh1Var = this.f37682a;
        if (i10 == -1) {
            if (hh1Var.G >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.m2) hh1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
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
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.T = string;
            a2Var.R = string2;
            alertDialog$Builder.k(string3, new gq0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20368a;
            hh1Var.showDialog(a2Var2);
            TextView textView = (TextView) a2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
            }
        }
    }
}
