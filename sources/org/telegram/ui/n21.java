package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n21 extends org.telegram.ui.ActionBar.w2 {
    public static final int f50074p1 = 0;
    public TLRPC.TL_authorization f50075m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.rh0 f50076o1;

    public static void J0(n21 n21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.N0(2131751755, null)}, new og.j(12, n21Var, str));
        alertDialog$Builder.p();
    }

    public static void K0(n21 n21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = n21Var.f50075m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(n21Var.f30173a).sendRequest(changeauthorizationsettings, new fi.l5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.f50076o1.d();
    }
}
