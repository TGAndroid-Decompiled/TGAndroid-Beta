package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ag1 extends org.telegram.ui.ActionBar.k {
    public final cg1 f36548a;

    public ag1(cg1 cg1Var) {
        this.f36548a = cg1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.b5 b5Var;
        cg1 cg1Var = this.f36548a;
        if (i10 == -1) {
            if (cg1Var.C >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.o2) cg1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    cg1Var.I0();
                    return;
                }
            }
            cg1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cg1Var.getParentActivity());
            TL_account.Password password = cg1Var.Q;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = string;
            c2Var.N = string2;
            alertDialog$Builder.k(string3, new zk0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
            cg1Var.showDialog(c2Var2);
            TextView textView = (TextView) c2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        }
    }
}
