package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b81 implements View.OnClickListener {
    public final m81 f32087a;
    public final TLRPC.TL_authorization f32088b;
    public final SessionsActivity f32089c;
    public final d81 d;

    public b81(d81 d81Var, m81 m81Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = d81Var;
        this.f32087a = m81Var;
        this.f32088b = tL_authorization;
        this.f32089c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f32961c.getParentActivity());
        alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.TerminateSessionText);
        alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Terminate), new b7(this, this.f32087a, this.f32088b, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        SessionsActivity sessionsActivity = this.f32089c;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
        sessionsActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
        }
    }
}
