package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mg1 extends org.telegram.ui.ActionBar.j {
    public final og1 f36303a;

    public mg1(og1 og1Var) {
        this.f36303a = og1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.e5 e5Var;
        og1 og1Var = this.f36303a;
        if (i10 == -1) {
            if (og1Var.D >= 0) {
                e5Var = ((org.telegram.ui.ActionBar.p2) og1Var).parentLayout;
                if (e5Var.getFragmentStack().size() == 1) {
                    og1Var.I0();
                    return;
                }
            }
            og1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og1Var.getParentActivity());
            TL_account.Password password = og1Var.R;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.Q = string;
            d2Var.O = string2;
            alertDialog$Builder.k(string3, new il0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f19503a;
            og1Var.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
        }
    }
}
