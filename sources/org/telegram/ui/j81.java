package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j81 extends org.telegram.ui.ActionBar.h3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f34053b;
    public SessionsActivity f34054c;
    public org.telegram.ui.Components.kj0 d;

    public static void m(j81 j81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new kg.j(12, j81Var, str));
        alertDialog$Builder.o();
    }

    public static void n(j81 j81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = j81Var.f34053b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(j81Var.currentAccount).sendRequest(changeauthorizationsettings, new bi.g1(17));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
