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
public final class dl0 implements Utilities.Callback2 {
    public final int f33046a;
    public final Serializable f33047b;
    public final Object f33048c;
    public final Object d;
    public final Object e;

    public dl0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.f33046a = i10;
        this.f33048c = obj;
        this.d = obj2;
        this.f33047b = serializable;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        CharSequence replaceSingleLinkBold;
        int i10 = this.f33046a;
        Object obj3 = this.e;
        Serializable serializable = this.f33047b;
        Object obj4 = this.d;
        Object obj5 = this.f33048c;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    il0.f34689a = f3Var;
                    f3Var.show();
                    return;
                }
                org.telegram.ui.ActionBar.f3 f3Var2 = il0.f34689a;
                if (f3Var2 != null) {
                    f3Var2.dismiss();
                    il0.f34689a = null;
                }
                org.telegram.ui.Components.vc a2 = il0.a();
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
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj5;
                ai.da daVar = (ai.da) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = d1Var.e;
                if (updates != null) {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.d1.B(str2, "req_id"));
                    long j3 = d1Var.U.f18256id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f18256id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(d1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = d1Var.f38903c;
                    if (h0Var != null) {
                        h0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error2 != null) {
                    new org.telegram.ui.Components.vc(d1Var, e6Var2).d0(tL_error2, false);
                    d1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.vc(d1Var, e6Var2).c0("UNKNOWN_BUTTON", false);
                    d1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                    return;
                }
            default:
                yh.z3.c0((yh.z3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
