package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d81 implements View.OnClickListener {
    public final o81 f33050a;
    public final TLRPC.TL_authorization f33051b;
    public final SessionsActivity f33052c;
    public final f81 d;

    public d81(f81 f81Var, o81 o81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = f81Var;
        this.f33050a = o81Var;
        this.f33051b = tL_authorization;
        this.f33052c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f33589c.getParentActivity());
        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new c7(this, this.f33050a, this.f33051b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f33052c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
        }
    }
}
