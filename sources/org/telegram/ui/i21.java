package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i21 extends org.telegram.ui.ActionBar.u2 {
    public static final int f47886p1 = 0;
    public TLRPC.TL_authorization f47887m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.fh0 f47888o1;

    public static void I0(i21 i21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751767, null)}, new og.j(12, i21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(i21 i21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = i21Var.f47887m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(i21Var.f29679a).sendRequest(changeauthorizationsettings, new fi.m5(28));
    }

    @Override
    public final void show() {
        super.show();
        this.f47888o1.d();
    }
}
