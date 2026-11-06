package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l21 extends org.telegram.ui.ActionBar.v2 {
    public static final int l1 = 0;
    public TLRPC.TL_authorization f47390i1;
    public SessionsActivity f47391j1;
    public org.telegram.ui.Components.ch0 f47392k1;

    public static void I0(l21 l21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751767, null)}, new og.j(12, l21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(l21 l21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = l21Var.f47390i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(l21Var.f28613a).sendRequest(changeauthorizationsettings, new di.u5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.f47392k1.d();
    }
}
