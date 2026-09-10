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
    public final int f32860a;
    public final Serializable f32861b;
    public final Object f32862c;
    public final Object d;
    public final Object e;

    public fl0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f32860a = i10;
        this.f32862c = obj;
        this.d = obj2;
        this.f32861b = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f32860a;
        Object obj3 = this.e;
        Serializable serializable = this.f32861b;
        Object obj4 = this.d;
        Object obj5 = this.f32862c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.d2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    kl0.f34413a = h3Var;
                    h3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.h3 h3Var2 = kl0.f34413a;
                if (h3Var2 != null) {
                    h3Var2.dismiss();
                    kl0.f34413a = null;
                }
                org.telegram.ui.Components.wc a2 = kl0.a();
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
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = c1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.z(a1Var, "requested_chat_sent", org.telegram.ui.web.c1.B(str2, "req_id"));
                    long j3 = c1Var.U.f17342id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f17342id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(c1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = c1Var.f37880c;
                    if (h0Var != null) {
                        h0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.wc(c1Var, f6Var2).d0(tL_error2, false);
                    c1Var.z(a1Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.wc(c1Var, f6Var2).c0("UNKNOWN_BUTTON", false);
                    c1Var.z(a1Var, "requested_chat_failed", org.telegram.ui.web.c1.B(str2, "req_id"));
                    return;
                }
            default:
                xh.x3.c0((xh.x3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
