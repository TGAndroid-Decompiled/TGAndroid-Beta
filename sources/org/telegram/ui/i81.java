package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i81 implements View.OnClickListener {
    public final t81 f38804a;
    public final TLRPC.TL_authorization f38805b;
    public final SessionsActivity f38806c;
    public final k81 d;

    public i81(k81 k81Var, t81 t81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = k81Var;
        this.f38804a = t81Var;
        this.f38805b = tL_authorization;
        this.f38806c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f39379c.getParentActivity());
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new d7(this, this.f38804a, this.f38805b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f38806c;
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        sessionsActivity.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
        }
    }
}
