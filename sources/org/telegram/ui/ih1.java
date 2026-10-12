package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ih1 extends org.telegram.ui.ActionBar.j {
    public final kh1 f38910a;

    public ih1(kh1 kh1Var) {
        this.f38910a = kh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.b5 b5Var;
        kh1 kh1Var = this.f38910a;
        if (i10 == -1) {
            if (kh1Var.G >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.m2) kh1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    kh1Var.I0();
                    return;
                }
            }
            kh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kh1Var.getParentActivity());
            TL_account.Password password = kh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
            a2Var.T = string;
            a2Var.R = string2;
            alertDialog$Builder.k(string3, new jq0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20141a;
            kh1Var.showDialog(a2Var2);
            TextView textView = (TextView) a2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
            }
        }
    }
}
