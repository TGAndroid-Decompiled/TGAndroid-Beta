package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
public final class ng implements org.telegram.messenger.j20 {
    public final int f39933a;
    public final int f39934b;
    public final Object f39935c;
    public final Object d;

    public ng(Object obj, int i10, TLObject tLObject, int i11) {
        this.f39933a = i11;
        this.f39935c = obj;
        this.f39934b = i10;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.f39933a;
        int i11 = this.f39934b;
        Object obj3 = this.d;
        Object obj4 = this.f39935c;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new i2.g1((un) obj4, this.f39934b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 6));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                f70 f70Var = (f70) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.vp.r1(launchActivity.O).L3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.i0.g3(new f70(3, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.i0.g3(new i2.g1(launchActivity, f70Var, tL_error, updates, this.f39934b, 15));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.f33428b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    org.telegram.ui.Components.cc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f33427a.f30819f3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Components.cc.a0(passkeysActivity).f0(tL_error2, false);
                    arrayList.add(Utilities.j(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.f33427a.f30819f3.O(true);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                h8Var.f34641f1 = 0;
                if (cardVar2 != null) {
                    org.telegram.ui.Wallet.h8.e0(i11, cardVar2);
                    if (!h8Var.f34628a1) {
                        if (h8Var.f34636d1) {
                            h8Var.f34631b1 = cardVar2;
                            h8Var.f34634c1 = org.telegram.ui.Wallet.h8.T(cardVar2);
                            h8Var.Q();
                            return;
                        }
                        h8Var.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    org.telegram.ui.Wallet.h8.e0(i11, cardVar);
                }
                if (!h8Var.f34628a1) {
                    if (tL_error3 != null) {
                        org.telegram.ui.Components.cc.a0(h8Var.f34626a).f0(tL_error3, false);
                    }
                    h8Var.f34636d1 = false;
                    TL_wallet.card cardVar3 = h8Var.f34631b1;
                    if (cardVar3 != null) {
                        h8Var.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ng(LaunchActivity launchActivity, f70 f70Var, int i10) {
        this.f39933a = 1;
        this.f39935c = launchActivity;
        this.d = f70Var;
        this.f39934b = i10;
    }
}
