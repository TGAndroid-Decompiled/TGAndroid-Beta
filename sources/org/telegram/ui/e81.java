package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e81 extends org.telegram.ui.ActionBar.f3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f33226b;
    public SessionsActivity f33227c;
    public org.telegram.ui.Components.aj0 d;

    public static void m(e81 e81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(11, e81Var, str));
        alertDialog$Builder.o();
    }

    public static void n(e81 e81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = e81Var.f33226b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(e81Var.currentAccount).sendRequest(changeauthorizationsettings, new ai.t7(21));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
