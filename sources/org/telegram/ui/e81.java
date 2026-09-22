package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e81 implements View.OnClickListener {
    public final q81 f33305a;
    public final TLRPC.TL_authorization f33306b;
    public final SessionsActivity f33307c;
    public final g81 d;

    public e81(g81 g81Var, q81 q81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = g81Var;
        this.f33305a = q81Var;
        this.f33306b = tL_authorization;
        this.f33307c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f33862c.getParentActivity());
        alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f33305a, this.f33306b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f33307c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
        }
    }
}
