package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g81 extends org.telegram.ui.ActionBar.e3 {
    public static final int f38022e = 0;
    public TLRPC.TL_authorization f38023b;
    public SessionsActivity f38024c;
    public org.telegram.ui.Components.gk0 d;

    public static void o(g81 g81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(12, g81Var, str));
        alertDialog$Builder.o();
    }

    public static void p(g81 g81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = g81Var.f38023b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(g81Var.currentAccount).sendRequest(changeauthorizationsettings, new ai.v7(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
