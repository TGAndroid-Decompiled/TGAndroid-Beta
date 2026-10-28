package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dg1 extends org.telegram.ui.ActionBar.j {
    public final fg1 f38609a;

    public dg1(fg1 fg1Var) {
        this.f38609a = fg1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.j5 j5Var;
        fg1 fg1Var = this.f38609a;
        if (i10 == -1) {
            if (fg1Var.G >= 0) {
                j5Var = ((org.telegram.ui.ActionBar.r2) fg1Var).parentLayout;
                if (j5Var.getFragmentStack().size() == 1) {
                    fg1Var.J0();
                    return;
                }
            }
            fg1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg1Var.getParentActivity());
            TL_account.Password password = fg1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.T = string;
            e2Var.R = string2;
            alertDialog$Builder.k(string3, new jl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22369a;
            fg1Var.showDialog(e2Var2);
            TextView textView = (TextView) e2Var2.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
            }
        }
    }
}
