package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m71 implements View.OnClickListener {
    public final x71 f36226a;
    public final TLRPC.TL_authorization f36227b;
    public final SessionsActivity f36228c;
    public final o71 d;

    public m71(o71 o71Var, x71 x71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = o71Var;
        this.f36226a = x71Var;
        this.f36227b = tL_authorization;
        this.f36228c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f36809c.getParentActivity());
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new d7(this, this.f36226a, this.f36227b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f36228c;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        sessionsActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
        }
    }
}
