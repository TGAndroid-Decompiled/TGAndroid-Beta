package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mh1 extends org.telegram.ui.ActionBar.j {
    public final oh1 f38266a;

    public mh1(oh1 oh1Var) {
        this.f38266a = oh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.b5 b5Var;
        oh1 oh1Var = this.f38266a;
        if (i10 == -1) {
            if (oh1Var.G >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.m2) oh1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    oh1Var.I0();
                    return;
                }
            }
            oh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
            TL_account.Password password = oh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.T = string;
            a2Var.R = string2;
            alertDialog$Builder.k(string3, new nq0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19548a;
            oh1Var.showDialog(a2Var2);
            TextView textView = (TextView) a2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
            }
        }
    }
}
