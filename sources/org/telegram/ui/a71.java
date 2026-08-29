package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a71 extends org.telegram.ui.ActionBar.f3 {
    public static final int f36448e = 0;
    public TLRPC.TL_authorization f36449b;
    public SessionsActivity f36450c;
    public org.telegram.ui.Components.aj0 d;

    public static void m(a71 a71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ag.y1(11, a71Var, str));
        alertDialog$Builder.o();
    }

    public static void n(a71 a71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = a71Var.f36449b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(a71Var.currentAccount).sendRequest(changeauthorizationsettings, new lh.o5(18));
    }

    @Override
    public final void show() {
        super.show();
        this.d.d();
    }
}
