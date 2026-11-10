package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n21 implements View.OnClickListener {
    public final y21 f48099a;
    public final TLRPC.TL_authorization f48100b;
    public final SessionsActivity f48101c;
    public final o21 d;

    public n21(o21 o21Var, y21 y21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = o21Var;
        this.f48099a = y21Var;
        this.f48100b = tL_authorization;
        this.f48101c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f48379m1.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131744204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744209, null), new a7(this, this.f48099a, this.f48100b, 21));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        this.f48101c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
        }
    }
}
