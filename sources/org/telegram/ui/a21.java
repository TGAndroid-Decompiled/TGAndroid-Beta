package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a21 implements View.OnClickListener {
    public final k21 f43569a;
    public final TLRPC.TL_authorization f43570b;
    public final SessionsActivity f43571c;
    public final b21 d;

    public a21(b21 b21Var, k21 k21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = b21Var;
        this.f43569a = k21Var;
        this.f43570b = tL_authorization;
        this.f43571c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.k1.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131744214, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = M0;
        s1Var.S = org.telegram.messenger.bd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744219, null), new b7(this, this.f43569a, this.f43570b, 21));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        this.f43571c.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
    }
}
