package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m21 implements View.OnClickListener {
    public final x21 f49746a;
    public final TLRPC.TL_authorization f49747b;
    public final SessionsActivity f49748c;
    public final n21 d;

    public m21(n21 n21Var, x21 x21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = n21Var;
        this.f49746a = x21Var;
        this.f49747b = tL_authorization;
        this.f49748c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131743963, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        t1Var.U = N0;
        t1Var.S = org.telegram.messenger.gd.N0(2131754070, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743968, null), new z6(this, this.f49746a, this.f49747b, 21));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        this.f49748c.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, null);
        }
    }
}
