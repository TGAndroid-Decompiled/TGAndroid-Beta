package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ag implements Utilities.Callback2 {
    public final int f36476a;
    public final int f36477b;
    public final Object f36478c;
    public final Object d;

    public ag(org.telegram.ui.ActionBar.o2 o2Var, int i9, TLObject tLObject, int i10) {
        this.f36476a = i10;
        this.f36478c = o2Var;
        this.f36477b = i9;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i9 = this.f36476a;
        Object obj3 = this.d;
        Object obj4 = this.f36478c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh.g1((qn) obj4, this.f36477b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 15));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                x20 x20Var = (x20) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.f35493x1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.K).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new x20(9, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new fh.g1(launchActivity, x20Var, tL_error, updates, this.f36477b, 25));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f35577b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i10 = this.f36477b;
                if (z10) {
                    org.telegram.ui.Components.oc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f35576a.U2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.oc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f35576a.U2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public ag(LaunchActivity launchActivity, x20 x20Var, int i9) {
        this.f36476a = 1;
        this.f36478c = launchActivity;
        this.d = x20Var;
        this.f36477b = i9;
    }
}
