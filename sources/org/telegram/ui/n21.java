package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n21 extends org.telegram.ui.ActionBar.v2 {
    public static final int l1 = 0;
    public TLRPC.TL_authorization f48063i1;
    public SessionsActivity f48064j1;
    public org.telegram.ui.Components.dh0 f48065k1;

    public static void I0(n21 n21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751767, null)}, new og.j(12, n21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(n21 n21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = n21Var.f48063i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(n21Var.f28621a).sendRequest(changeauthorizationsettings, new di.v5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.f48065k1.d();
    }
}
