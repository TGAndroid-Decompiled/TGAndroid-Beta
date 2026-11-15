package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h21 implements View.OnClickListener {
    public final s21 f47592a;
    public final TLRPC.TL_authorization f47593b;
    public final SessionsActivity f47594c;
    public final i21 d;

    public h21(i21 i21Var, s21 s21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = i21Var;
        this.f47592a = s21Var;
        this.f47593b = tL_authorization;
        this.f47594c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744204, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = M0;
        t1Var.S = org.telegram.messenger.hd.M0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744209, null), new a7(this, this.f47592a, this.f47593b, 21));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        this.f47594c.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
    }
}
