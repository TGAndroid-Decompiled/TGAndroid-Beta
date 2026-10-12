package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k81 extends org.telegram.ui.ActionBar.e3 {
    public static final int f39377e = 0;
    public TLRPC.TL_authorization f39378b;
    public SessionsActivity f39379c;
    public org.telegram.ui.Components.ik0 d;

    public static void o(k81 k81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(12, k81Var, str));
        alertDialog$Builder.o();
    }

    public static void p(k81 k81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = k81Var.f39378b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(k81Var.currentAccount).sendRequest(changeauthorizationsettings, new ai.v7(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
