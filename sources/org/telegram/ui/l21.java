package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l21 implements View.OnClickListener {
    public final w21 f49406a;
    public final TLRPC.TL_authorization f49407b;
    public final SessionsActivity f49408c;
    public final m21 d;

    public l21(m21 m21Var, w21 w21Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = m21Var;
        this.f49406a = w21Var;
        this.f49407b = tL_authorization;
        this.f49408c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.n1.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131743969, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.U = M0;
        u1Var.S = org.telegram.messenger.gd.M0(2131754071, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131743974, null), new z6(this, this.f49406a, this.f49407b, 21));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        this.f49408c.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
        }
    }
}
