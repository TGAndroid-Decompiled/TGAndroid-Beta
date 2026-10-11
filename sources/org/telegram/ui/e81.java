package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e81 implements View.OnClickListener {
    public final q81 f37236a;
    public final TLRPC.TL_authorization f37237b;
    public final SessionsActivity f37238c;
    public final g81 d;

    public e81(g81 g81Var, q81 q81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = g81Var;
        this.f37236a = q81Var;
        this.f37237b = tL_authorization;
        this.f37238c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f37990c.getParentActivity());
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new z6(this, this.f37236a, this.f37237b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37238c;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        sessionsActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
        }
    }
}
