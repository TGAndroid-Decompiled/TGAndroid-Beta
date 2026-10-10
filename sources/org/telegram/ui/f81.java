package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f81 implements View.OnClickListener {
    public final r81 f37527a;
    public final TLRPC.TL_authorization f37528b;
    public final SessionsActivity f37529c;
    public final h81 d;

    public f81(h81 h81Var, r81 r81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = h81Var;
        this.f37527a = r81Var;
        this.f37528b = tL_authorization;
        this.f37529c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f38276c.getParentActivity());
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new a7(this, this.f37527a, this.f37528b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f37529c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
        }
    }
}
