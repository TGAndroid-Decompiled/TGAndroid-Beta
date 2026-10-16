package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m81 implements View.OnClickListener {
    public final x81 f37934a;
    public final TLRPC.TL_authorization f37935b;
    public final SessionsActivity f37936c;
    public final o81 d;

    public m81(o81 o81Var, x81 x81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = o81Var;
        this.f37934a = x81Var;
        this.f37935b = tL_authorization;
        this.f37936c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38570c.getParentActivity());
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new f7(this, this.f37934a, this.f37935b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37936c;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        sessionsActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        }
    }
}
