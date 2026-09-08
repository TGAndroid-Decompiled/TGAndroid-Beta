package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e81 implements View.OnClickListener {
    public final q81 f36001a;
    public final TLRPC.TL_authorization f36002b;
    public final SessionsActivity f36003c;
    public final g81 d;

    public e81(g81 g81Var, q81 q81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = g81Var;
        this.f36001a = q81Var;
        this.f36002b = tL_authorization;
        this.f36003c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f36626c.getParentActivity());
        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f36001a, this.f36002b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f36003c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
        }
    }
}
