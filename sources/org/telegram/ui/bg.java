package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class bg implements Utilities.Callback2 {

    public final int f36811a;

    public final int f36812b;

    public final Object f36813c;
    public final Object d;

    public bg(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLObject tLObject, int i11) {
        this.f36811a = i11;
        this.f36813c = n2Var;
        this.f36812b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f36811a;
        Object obj3 = this.d;
        Object obj4 = this.f36813c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new gh.e1((rn) obj4, this.f36812b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 13));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                a30 a30Var = (a30) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.f35496x1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.K).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new a30(9, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new gh.e1(launchActivity, a30Var, tL_error, updates, this.f36812b, 23));
                break;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f35580b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f36812b;
                if (z10) {
                    org.telegram.ui.Components.mc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35579a.U2.N(true);
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.mc.a0(passkeysActivity).d0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35579a.U2.N(true);
                }
                break;
        }
    }

    public bg(LaunchActivity launchActivity, a30 a30Var, int i10) {
        this.f36811a = 1;
        this.f36813c = launchActivity;
        this.d = a30Var;
        this.f36812b = i10;
    }
}
