package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f81 implements View.OnClickListener {
    public final r81 f37481a;
    public final TLRPC.TL_authorization f37482b;
    public final SessionsActivity f37483c;
    public final h81 d;

    public f81(h81 h81Var, r81 r81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = h81Var;
        this.f37481a = r81Var;
        this.f37482b = tL_authorization;
        this.f37483c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38230c.getParentActivity());
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new a7(this, this.f37481a, this.f37482b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37483c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
        }
    }
}
