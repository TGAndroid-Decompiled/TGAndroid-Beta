package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o71 extends org.telegram.ui.ActionBar.g3 {
    public static final int e = 0;
    public TLRPC.TL_authorization f36808b;
    public SessionsActivity f36809c;
    public org.telegram.ui.Components.jj0 d;

    public static void m(o71 o71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new cg.u1(11, o71Var, str));
        alertDialog$Builder.o();
    }

    public static void n(o71 o71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = o71Var.f36808b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(o71Var.currentAccount).sendRequest(changeauthorizationsettings, new nh.p5(17));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
