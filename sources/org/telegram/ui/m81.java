package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m81 implements View.OnClickListener {
    public final x81 f38188a;
    public final TLRPC.TL_authorization f38189b;
    public final SessionsActivity f38190c;
    public final o81 d;

    public m81(o81 o81Var, x81 x81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = o81Var;
        this.f38188a = x81Var;
        this.f38189b = tL_authorization;
        this.f38190c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38888c.getParentActivity());
        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new f7(this, this.f38188a, this.f38189b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f38190c;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        sessionsActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
        }
    }
}
