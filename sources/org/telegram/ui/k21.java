package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k21 implements View.OnClickListener {
    public final v21 f49284a;
    public final TLRPC.TL_authorization f49285b;
    public final SessionsActivity f49286c;
    public final l21 d;

    public k21(l21 l21Var, v21 v21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = l21Var;
        this.f49284a = v21Var;
        this.f49285b = tL_authorization;
        this.f49286c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131743959, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.U = N0;
        t1Var.S = org.telegram.messenger.gd.N0(2131754070, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131743964, null), new a7(this, this.f49284a, this.f49285b, 21));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        this.f49286c.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
        }
    }
}
