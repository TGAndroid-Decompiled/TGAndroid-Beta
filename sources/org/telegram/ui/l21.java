package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l21 implements View.OnClickListener {
    public final w21 f49432a;
    public final TLRPC.TL_authorization f49433b;
    public final SessionsActivity f49434c;
    public final m21 d;

    public l21(m21 m21Var, w21 w21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = m21Var;
        this.f49432a = w21Var;
        this.f49433b = tL_authorization;
        this.f49434c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131743963, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.U = N0;
        t1Var.S = org.telegram.messenger.hd.N0(2131754070, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131743968, null), new z6(this, this.f49432a, this.f49433b, 21));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        this.f49434c.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
        }
    }
}
