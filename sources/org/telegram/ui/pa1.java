package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pa1 extends org.telegram.ui.ActionBar.j {
    public final ra1 f48503a;

    public pa1(ra1 ra1Var) {
        this.f48503a = ra1Var;
    }

    @Override
    public final void b(int i3) {
        String M0;
        org.telegram.ui.ActionBar.q4 q4Var;
        ra1 ra1Var = this.f48503a;
        if (i3 == -1) {
            if (ra1Var.H >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.d2) ra1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    ra1Var.N0();
                    return;
                }
            }
            ra1Var.finishFragment();
        } else if (i3 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
            TL_account.Password password = ra1Var.V;
            if (password != null && password.has_password) {
                M0 = org.telegram.messenger.bd.M0(2131752586, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131752578, null);
            }
            String M02 = org.telegram.messenger.bd.M0(2131752585, null);
            String M03 = org.telegram.messenger.bd.M0(2131754950, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = M0;
            s1Var.S = M02;
            alertDialog$Builder.k(M03, new ci0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            ra1Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        }
    }
}
