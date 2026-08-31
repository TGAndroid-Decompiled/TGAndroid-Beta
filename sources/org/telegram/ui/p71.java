package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p71 extends org.telegram.ui.ActionBar.h3 {
    public static final int f39940e = 0;
    public TLRPC.TL_authorization f39941b;
    public SessionsActivity f39942c;
    public org.telegram.ui.Components.lj0 d;

    public static void m(p71 p71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new dg.t1(11, p71Var, str));
        alertDialog$Builder.o();
    }

    public static void n(p71 p71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = p71Var.f39941b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(p71Var.currentAccount).sendRequest(changeauthorizationsettings, new oh.p5(17));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
