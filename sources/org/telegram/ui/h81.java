package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h81 implements View.OnClickListener {
    public final s81 f33323a;
    public final TLRPC.TL_authorization f33324b;
    public final SessionsActivity f33325c;
    public final j81 d;

    public h81(j81 j81Var, s81 s81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = j81Var;
        this.f33323a = s81Var;
        this.f33324b = tL_authorization;
        this.f33325c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f34054c.getParentActivity());
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new a7(this, this.f33323a, this.f33324b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f33325c;
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        sessionsActivity.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
        }
    }
}
