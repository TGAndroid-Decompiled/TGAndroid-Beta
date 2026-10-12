package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o81 extends org.telegram.ui.ActionBar.e3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f38887b;
    public SessionsActivity f38888c;
    public org.telegram.ui.Components.bk0 d;

    public static void n(o81 o81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(12, o81Var, str));
        alertDialog$Builder.o();
    }

    public static void o(o81 o81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = o81Var.f38887b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(o81Var.currentAccount).sendRequest(changeauthorizationsettings, new bi.g7(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
