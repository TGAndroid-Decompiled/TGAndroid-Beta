package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gl0 implements Utilities.Callback2 {
    public final int f36739a;
    public final Serializable f36740b;
    public final Object f36741c;
    public final Object d;
    public final Object f36742e;

    public gl0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f36739a = i10;
        this.f36741c = obj;
        this.d = obj2;
        this.f36740b = serializable;
        this.f36742e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f36739a;
        Object obj3 = this.f36742e;
        Serializable serializable = this.f36740b;
        Object obj4 = this.d;
        Object obj5 = this.f36741c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    ll0.f38430a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var2 = ll0.f38430a;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    ll0.f38430a = null;
                }
                org.telegram.ui.Components.yc a2 = ll0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            case 1:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj5;
                bi.k9 k9Var = (bi.k9) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = d1Var.f42069e;
                if (updates != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(k9Var, "requested_chat_sent", org.telegram.ui.web.d1.B(str2, "req_id"));
                    long j3 = d1Var.U.f20043id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20043id);
                    org.telegram.ui.web.g0 g0Var = new org.telegram.ui.web.g0(d1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(g0Var);
                    }
                    org.telegram.ui.web.i0 i0Var = d1Var.f42066c;
                    if (i0Var != null) {
                        i0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.yc(d1Var, f6Var2).d0(tL_error2, false);
                    d1Var.y(k9Var, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.yc(d1Var, f6Var2).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(k9Var, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                    return;
                }
            default:
                zh.w3.c0((zh.w3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
