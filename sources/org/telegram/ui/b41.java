package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b41 implements View.OnClickListener {
    public final m41 f35979a;
    public final TLRPC.TL_authorization f35980b;
    public final SessionsActivity f35981c;
    public final c41 d;

    public b41(c41 c41Var, m41 m41Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = c41Var;
        this.f35979a = m41Var;
        this.f35980b = tL_authorization;
        this.f35981c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f36385j1.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131744229, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744234, null), new a7(this, this.f35979a, this.f35980b, 21));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        this.f35981c.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
    }
}
