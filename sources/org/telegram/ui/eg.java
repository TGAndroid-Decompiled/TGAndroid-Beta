package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eg implements Utilities.Callback2 {
    public final int f36487a;
    public final int f36488b;
    public final Object f36489c;
    public final Object d;

    public eg(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLObject tLObject, int i11) {
        this.f36487a = i11;
        this.f36489c = p2Var;
        this.f36488b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f36487a;
        Object obj3 = this.d;
        Object obj4 = this.f36489c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new eg.d3((xn) obj4, this.f36488b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                z10 z10Var = (z10) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.f34134y1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.L).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new z10(13, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new eg.d3(launchActivity, z10Var, tL_error, updates, this.f36488b, 22));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f34218b;
                boolean z4 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f36488b;
                if (z4) {
                    org.telegram.ui.Components.qc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f34217a.V2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.qc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f34217a.V2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public eg(LaunchActivity launchActivity, z10 z10Var, int i10) {
        this.f36487a = 1;
        this.f36489c = launchActivity;
        this.d = z10Var;
        this.f36488b = i10;
    }
}
