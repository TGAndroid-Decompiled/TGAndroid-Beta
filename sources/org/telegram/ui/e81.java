package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e81 implements View.OnClickListener {
    public final q81 f35974a;
    public final TLRPC.TL_authorization f35975b;
    public final SessionsActivity f35976c;
    public final g81 d;

    public e81(g81 g81Var, q81 q81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = g81Var;
        this.f35974a = q81Var;
        this.f35975b = tL_authorization;
        this.f35976c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f36599c.getParentActivity());
        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f35974a, this.f35975b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f35976c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
        }
    }
}
