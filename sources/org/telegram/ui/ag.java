package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class ag implements org.telegram.messenger.v10 {
    public final int f43644a;
    public final int f43645b;
    public final Object f43646c;
    public final Object d;

    public ag(Object obj, int i7, TLObject tLObject, int i10) {
        this.f43644a = i10;
        this.f43646c = obj;
        this.f43645b = i7;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i7 = this.f43644a;
        int i10 = this.f43645b;
        Object obj3 = this.d;
        Object obj4 = this.f43646c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.ub((an) obj4, this.f43645b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 10));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                q10 q10Var = (q10) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.qp.s1(launchActivity.O).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new q10(10, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new bi.ub(launchActivity, q10Var, tL_error, updates, this.f43645b, 19));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f41337b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.hc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41336a.f37190f3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.hc.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.f41336a.f37190f3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                b8Var.f42232f1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.b8.e0(i10, cardVar2);
                    if (!b8Var.f42218a1) {
                        if (b8Var.f42226d1) {
                            b8Var.f42221b1 = cardVar2;
                            b8Var.f42224c1 = org.telegram.ui.Wallet.b8.T(cardVar2);
                            b8Var.Q();
                            return;
                        }
                        b8Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.b8.e0(i10, cardVar);
                }
                if (!b8Var.f42218a1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.hc.a0(b8Var.f42216a).f0(tL_error3, false);
                    }
                    b8Var.f42226d1 = false;
                    TL_wallet.card cardVar3 = b8Var.f42221b1;
                    if (cardVar3 != null) {
                        b8Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ag(LaunchActivity launchActivity, q10 q10Var, int i7) {
        this.f43644a = 1;
        this.f43646c = launchActivity;
        this.d = q10Var;
        this.f43645b = i7;
    }
}
