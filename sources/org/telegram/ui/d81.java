package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d81 implements View.OnClickListener {
    public final o81 f33046a;
    public final TLRPC.TL_authorization f33047b;
    public final SessionsActivity f33048c;
    public final f81 d;

    public d81(f81 f81Var, o81 o81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = f81Var;
        this.f33046a = o81Var;
        this.f33047b = tL_authorization;
        this.f33048c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f33585c.getParentActivity());
        alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new c7(this, this.f33046a, this.f33047b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f33048c;
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        sessionsActivity.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
        }
    }
}
