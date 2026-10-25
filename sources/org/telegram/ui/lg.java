package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class lg implements Utilities.Callback2 {
    public final int f41264a;
    public final int f41265b;
    public final Object f41266c;
    public final Object d;

    public lg(Object obj, int i10, TLObject tLObject, int i11) {
        this.f41264a = i11;
        this.f41266c = obj;
        this.f41265b = i10;
        this.d = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f41264a;
        int i11 = this.f41265b;
        Object obj3 = this.d;
        Object obj4 = this.f41266c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.sb((un) obj4, this.f41265b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 17));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                sz szVar = (sz) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).lambda$processUpdates$379(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new sz(19, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new bi.sb(launchActivity, szVar, tL_error, updates, this.f41265b, 26));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f35601b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.wc.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35600a.f32150g3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.wc.b0(passkeysActivity).g0(tL_error2, false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f35600a.f32150g3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.t7 t7Var = (org.telegram.ui.Wallet.t7) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                t7Var.f37287f1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.t7.e0(i11, cardVar2);
                    if (!t7Var.f37274a1) {
                        if (t7Var.f37282d1) {
                            t7Var.f37277b1 = cardVar2;
                            t7Var.f37280c1 = org.telegram.ui.Wallet.t7.T(cardVar2);
                            t7Var.Q();
                            return;
                        }
                        t7Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.t7.e0(i11, cardVar);
                }
                if (!t7Var.f37274a1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.wc.b0(t7Var.f37272a).g0(tL_error3, false);
                    }
                    t7Var.f37282d1 = false;
                    TL_wallet.card cardVar3 = t7Var.f37277b1;
                    if (cardVar3 != null) {
                        t7Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lg(LaunchActivity launchActivity, sz szVar, int i10) {
        this.f41264a = 1;
        this.f41266c = launchActivity;
        this.d = szVar;
        this.f41265b = i10;
    }
}
