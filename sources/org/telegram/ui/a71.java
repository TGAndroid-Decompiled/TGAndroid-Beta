package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a71 implements View.OnClickListener {
    public final l71 f37704a;
    public final TLRPC.TL_authorization f37705b;
    public final SessionsActivity f37706c;
    public final c71 d;

    public a71(c71 c71Var, l71 l71Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = c71Var;
        this.f37704a = l71Var;
        this.f37705b = tL_authorization;
        this.f37706c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38210c.getParentActivity());
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new e7(this, this.f37704a, this.f37705b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37706c;
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        sessionsActivity.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
        }
    }
}
