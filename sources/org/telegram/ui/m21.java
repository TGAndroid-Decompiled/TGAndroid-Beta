package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m21 implements View.OnClickListener {
    public final x21 f47727a;
    public final TLRPC.TL_authorization f47728b;
    public final SessionsActivity f47729c;
    public final n21 d;

    public m21(n21 n21Var, x21 x21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = n21Var;
        this.f47727a = x21Var;
        this.f47728b = tL_authorization;
        this.f47729c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f48064j1.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131744204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744209, null), new a7(this, this.f47727a, this.f47728b, 21));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        this.f47729c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
        }
    }
}
