package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b21 extends org.telegram.ui.ActionBar.t2 {
    public static final int m1 = 0;
    public TLRPC.TL_authorization f43902j1;
    public SessionsActivity k1;
    public org.telegram.ui.Components.fh0 f43903l1;

    public static void I0(b21 b21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131751767, null)}, new u(11, b21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(b21 b21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = b21Var.f43902j1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(b21Var.f28583a).sendRequest(changeauthorizationsettings, new ei.u5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.f43903l1.d();
    }
}
