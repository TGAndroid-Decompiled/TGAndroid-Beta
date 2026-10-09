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
public final class el0 implements Utilities.Callback2 {
    public final int f37287a;
    public final Serializable f37288b;
    public final Object f37289c;
    public final Object d;
    public final Object f37290e;

    public el0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f37287a = i10;
        this.f37289c = obj;
        this.d = obj2;
        this.f37288b = serializable;
        this.f37290e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f37287a;
        Object obj3 = this.f37290e;
        Serializable serializable = this.f37288b;
        Object obj4 = this.d;
        Object obj5 = this.f37289c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    q51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var = ml0.f39938a;
                if (f3Var != null) {
                    f3Var.dismiss();
                    ml0.f39938a = null;
                }
                org.telegram.ui.Components.ad a2 = ml0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, e6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            case 1:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj5;
                ai.ea eaVar = (ai.ea) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = b1Var.f43244e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(eaVar, "requested_chat_sent", org.telegram.ui.web.b1.A(str2, "req_id"));
                    long j3 = b1Var.U.f20185id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20185id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(b1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = b1Var.f43241c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.ad(b1Var, e6Var2).f0(tL_error2, false);
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.ad(b1Var, e6Var2).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                }
            default:
                yh.s3.d0((yh.s3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
