package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c81 implements View.OnClickListener {
    public final n81 f32707a;
    public final TLRPC.TL_authorization f32708b;
    public final SessionsActivity f32709c;
    public final e81 d;

    public c81(e81 e81Var, n81 n81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = e81Var;
        this.f32707a = n81Var;
        this.f32708b = tL_authorization;
        this.f32709c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f33227c.getParentActivity());
        alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f32707a, this.f32708b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f32709c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
        }
    }
}
