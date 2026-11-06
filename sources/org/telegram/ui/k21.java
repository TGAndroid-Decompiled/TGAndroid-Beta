package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k21 implements View.OnClickListener {
    public final v21 f47083a;
    public final TLRPC.TL_authorization f47084b;
    public final SessionsActivity f47085c;
    public final l21 d;

    public k21(l21 l21Var, v21 v21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = l21Var;
        this.f47083a = v21Var;
        this.f47084b = tL_authorization;
        this.f47085c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f47391j1.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744205, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.hd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744210, null), new a7(this, this.f47083a, this.f47084b, 21));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        this.f47085c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, null);
        }
    }
}
