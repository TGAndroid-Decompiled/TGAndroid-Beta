package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n71 implements View.OnClickListener {
    public final y71 f39342a;
    public final TLRPC.TL_authorization f39343b;
    public final SessionsActivity f39344c;
    public final p71 d;

    public n71(p71 p71Var, y71 y71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = p71Var;
        this.f39342a = y71Var;
        this.f39343b = tL_authorization;
        this.f39344c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f39942c.getParentActivity());
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new d7(this, this.f39342a, this.f39343b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f39344c;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        sessionsActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
        }
    }
}
