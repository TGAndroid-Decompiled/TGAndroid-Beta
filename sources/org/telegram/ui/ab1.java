package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ab1 extends org.telegram.ui.ActionBar.k {
    public final cb1 f43630a;

    public ab1(cb1 cb1Var) {
        this.f43630a = cb1Var;
    }

    @Override
    public final void b(int i7) {
        String M0;
        org.telegram.ui.ActionBar.r4 r4Var;
        cb1 cb1Var = this.f43630a;
        if (i7 == -1) {
            if (cb1Var.G >= 0) {
                r4Var = ((org.telegram.ui.ActionBar.f2) cb1Var).parentLayout;
                if (r4Var.getFragmentStack().size() == 1) {
                    cb1Var.N0();
                    return;
                }
            }
            cb1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cb1Var.getParentActivity());
            TL_account.Password password = cb1Var.U;
            if (password != null && password.has_password) {
                M0 = org.telegram.messenger.id.M0(2131752586, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131752578, null);
            }
            String M02 = org.telegram.messenger.id.M0(2131752585, null);
            String M03 = org.telegram.messenger.id.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new oi0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            cb1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
            }
        }
    }
}
