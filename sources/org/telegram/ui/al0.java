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
public final class al0 implements Utilities.Callback2 {
    public final int f32097a;
    public final Serializable f32098b;
    public final Object f32099c;
    public final Object d;
    public final Object e;

    public al0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f32097a = i10;
        this.f32099c = obj;
        this.d = obj2;
        this.f32098b = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f32097a;
        Object obj3 = this.e;
        Serializable serializable = this.f32098b;
        Object obj4 = this.d;
        Object obj5 = this.f32099c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.c2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    fl0.f33584a = g3Var;
                    g3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.g3 g3Var2 = fl0.f33584a;
                if (g3Var2 != null) {
                    g3Var2.dismiss();
                    fl0.f33584a = null;
                }
                org.telegram.ui.Components.xc a2 = fl0.a();
                int i11 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                if (TextUtils.isEmpty(str)) {
                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                } else {
                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, e6Var));
                }
                a2.M(string, replaceSingleLinkBold, i11).j();
                return;
            case 1:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                ai.da daVar = (ai.da) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.c1.B(str2, "req_id"));
                    long j3 = c1Var.U.f18476id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18476id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(c1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = c1Var.f38962c;
                    if (h0Var != null) {
                        h0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.xc(c1Var, e6Var2).d0(tL_error2, false);
                    c1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.xc(c1Var, e6Var2).c0("UNKNOWN_BUTTON", false);
                    c1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                }
            default:
                yh.x3.c0((yh.x3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
