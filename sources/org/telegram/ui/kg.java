package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class kg implements Utilities.Callback2 {
    public final int f39329a;
    public final int f39330b;
    public final Object f39331c;
    public final Object d;

    public kg(org.telegram.ui.ActionBar.m2 m2Var, int i10, TLObject tLObject, int i11) {
        this.f39329a = i11;
        this.f39331c = m2Var;
        this.f39330b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f39329a;
        Object obj3 = this.d;
        Object obj4 = this.f39331c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.l3((zn) obj4, this.f39330b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 16));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                n70 n70Var = (n70) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).lambda$processUpdates$377(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new n70(7, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new ei.l3(launchActivity, n70Var, tL_error, updates, this.f39330b, 26));
                return;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f33889b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.f39330b;
                if (z10) {
                    org.telegram.ui.Components.ad.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f33888a.W2.N(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.ad.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f33888a.W2.N(true);
                    return;
                } else {
                    return;
                }
        }
    }

    public kg(LaunchActivity launchActivity, n70 n70Var, int i10) {
        this.f39329a = 1;
        this.f39331c = launchActivity;
        this.d = n70Var;
        this.f39330b = i10;
    }
}
