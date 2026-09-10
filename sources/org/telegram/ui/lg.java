package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lg implements Utilities.Callback2 {
    public final int f34709a;
    public final int f34710b;
    public final Object f34711c;
    public final Object d;

    public lg(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLObject tLObject, int i11) {
        this.f34709a = i11;
        this.f34711c = p2Var;
        this.f34710b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f34709a;
        Object obj3 = this.d;
        Object obj4 = this.f34711c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new di.o3((eo) obj4, this.f34710b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 15));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                h90 h90Var = (h90) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new h90(0, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new di.o3(launchActivity, h90Var, tL_error, updates, this.f34710b, 25));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f30008b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f34710b;
                if (z10) {
                    org.telegram.ui.Components.wc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f30007a.Y2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.wc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f30007a.Y2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public lg(LaunchActivity launchActivity, h90 h90Var, int i10) {
        this.f34709a = 1;
        this.f34711c = launchActivity;
        this.d = h90Var;
        this.f34710b = i10;
    }
}
