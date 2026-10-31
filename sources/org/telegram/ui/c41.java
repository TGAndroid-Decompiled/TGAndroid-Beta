package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c41 extends org.telegram.ui.ActionBar.z2 {
    public static final int l1 = 0;
    public TLRPC.TL_authorization f36384i1;
    public SessionsActivity f36385j1;
    public org.telegram.ui.Components.ei0 f36386k1;

    public static void I0(c41 c41Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c41Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131751767, null)}, new eg.j(13, c41Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(c41 c41Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = c41Var.f36384i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(c41Var.f21583a).sendRequest(changeauthorizationsettings, new ag.c3(23));
    }

    @Override
    public final void show() {
        super.show();
        this.f36386k1.d();
    }
}
