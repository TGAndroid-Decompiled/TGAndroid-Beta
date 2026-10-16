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
public final class il0 implements Utilities.Callback2 {
    public final int f36833a;
    public final Serializable f36834b;
    public final Object f36835c;
    public final Object d;
    public final Object e;

    public il0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f36833a = i10;
        this.f36835c = obj;
        this.d = obj2;
        this.f36834b = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f36833a;
        Object obj3 = this.e;
        Serializable serializable = this.f36834b;
        Object obj4 = this.d;
        Object obj5 = this.f36835c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.a2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    m51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.e3 e3Var = ql0.f39184a;
                if (e3Var != null) {
                    e3Var.dismiss();
                    ql0.f39184a = null;
                }
                org.telegram.ui.Components.zc a2 = ql0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            case 1:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                bi.n9 n9Var = (bi.n9) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c6 c6Var2 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).lambda$processUpdates$377(updates, false);
                    c1Var.x(n9Var, "requested_chat_sent", org.telegram.ui.web.c1.A(str2, "req_id"));
                    long j10 = c1Var.U.f19063id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19063id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(c1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = c1Var.f40985c;
                    if (h0Var != null) {
                        h0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.zc(c1Var, c6Var2).f0(tL_error2, false);
                    c1Var.x(n9Var, "requested_chat_failed", org.telegram.ui.web.c1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.zc(c1Var, c6Var2).e0("UNKNOWN_BUTTON", false);
                    c1Var.x(n9Var, "requested_chat_failed", org.telegram.ui.web.c1.A(str2, "req_id"));
                    return;
                }
            default:
                zh.r3.d0((zh.r3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
