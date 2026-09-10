package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kh1 extends org.telegram.ui.ActionBar.k {
    public final mh1 f34374a;

    public kh1(mh1 mh1Var) {
        this.f34374a = mh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.f5 f5Var;
        mh1 mh1Var = this.f34374a;
        if (i10 == -1) {
            if (mh1Var.G >= 0) {
                f5Var = ((org.telegram.ui.ActionBar.p2) mh1Var).parentLayout;
                if (f5Var.getFragmentStack().size() == 1) {
                    mh1Var.I0();
                    return;
                }
            }
            mh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh1Var.getParentActivity());
            TL_account.Password password = mh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.T = string;
            d2Var.R = string2;
            alertDialog$Builder.k(string3, new ul0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
            mh1Var.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        }
    }
}
