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
public final class fl0 implements Utilities.Callback2 {
    public final int f37810a;
    public final Serializable f37811b;
    public final Object f37812c;
    public final Object d;
    public final Object f37813e;

    public fl0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f37810a = i10;
        this.f37812c = obj;
        this.d = obj2;
        this.f37811b = serializable;
        this.f37813e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f37810a;
        Object obj3 = this.f37813e;
        Serializable serializable = this.f37811b;
        Object obj4 = this.d;
        Object obj5 = this.f37812c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.a2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    v51Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.e3 e3Var = nl0.f40430a;
                if (e3Var != null) {
                    e3Var.dismiss();
                    nl0.f40430a = null;
                }
                org.telegram.ui.Components.zc a2 = nl0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, c6Var));
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
                org.telegram.ui.ActionBar.c6 c6Var2 = b1Var.f43186e;
                if (updates != null) {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(eaVar, "requested_chat_sent", org.telegram.ui.web.b1.A(str2, "req_id"));
                    long j3 = b1Var.U.f19949id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19949id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(b1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = b1Var.f43183c;
                    if (g0Var != null) {
                        g0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.zc(b1Var, c6Var2).f0(tL_error2, false);
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.zc(b1Var, c6Var2).e0("UNKNOWN_BUTTON", false);
                    b1Var.x(eaVar, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                    return;
                }
            default:
                yh.s3.d0((yh.s3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
