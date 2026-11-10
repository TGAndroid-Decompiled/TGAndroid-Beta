package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o21 extends org.telegram.ui.ActionBar.w2 {
    public static final int f48378o1 = 0;
    public TLRPC.TL_authorization l1;
    public SessionsActivity f48379m1;
    public org.telegram.ui.Components.ch0 n1;

    public static void I0(o21 o21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751767, null)}, new og.j(12, o21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(o21 o21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = o21Var.l1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(o21Var.f28669a).sendRequest(changeauthorizationsettings, new di.v5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.n1.d();
    }
}
