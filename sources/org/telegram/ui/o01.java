package org.telegram.ui;

import android.app.Activity;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class o01 implements Runnable {
    public final int f42064a;
    public final Object f42065b;
    public final Object f42066c;
    public final Object d;
    public final Object e;
    public final Object f42067f;

    public o01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f42064a = i10;
        this.f42065b = obj;
        this.f42066c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f42067f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.p0 p0Var;
        String h;
        byte[] bArr;
        String h10;
        String jSONObject;
        switch (this.f42064a) {
            case 0:
                u01 u01Var = (u01) this.f42065b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f42067f;
                org.telegram.ui.ActionBar.r2 r2Var = u01Var.e;
                if (((String) this.f42066c).equals(u01Var.f43970y)) {
                    if (!u01Var.f43968w && (r2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) r2Var).O.f28015b.getImageReceiver().startAnimation();
                            ((ProfileActivity) r2Var).O.d.setText(LocaleController.getString(R.string.SettingsNoResults));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    u01Var.f43968w = true;
                    u01Var.f43966r = arrayList;
                    u01Var.f43967s = arrayList2;
                    u01Var.f43965n = arrayList3;
                    u01Var.l();
                    if (r2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) r2Var).O.f28015b.getImageReceiver().startAnimation();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                c61 c61Var = (c61) this.f42065b;
                View view = (View) this.f42066c;
                c61Var.getClass();
                c61Var.p(view, Long.valueOf(((org.telegram.ui.Components.c6) this.d).documentId), (TLRPC.Document) this.e, ((l51) this.f42067f).v, null);
                return;
            case 2:
                m61 m61Var = (m61) this.f42065b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42066c;
                TLObject tLObject = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user = (TLRPC.User) this.f42067f;
                m61Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    m61Var.T(user, twoStepVerificationActivity.m0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f42065b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) this.f42067f;
                String str = (String) this.f42066c;
                try {
                    e2Var.dismiss();
                    if (i0Var != null && !i0Var.e()) {
                        TL_wallet.WalletState walletState = l0Var.e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = l0Var.f36809c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            l0Var.f36809c.p(UserConfig.getInstance(l0Var.f36807a).getClientUserId(), ((TL_wallet.TL_walletState) l0Var.e).public_key, i0Var, null);
                        }
                    }
                    dVar.run(i0Var, str);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 4:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.f42065b;
                JSONObject jSONObject2 = (JSONObject) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                String str2 = (String) this.f42066c;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f42067f;
                e2Var2.getClass();
                if (jSONObject2 == null) {
                    callback.run(str2);
                    return;
                } else {
                    e2Var2.C(a2Var.f36337a.f22290id, a2Var.f36338b, jSONObject2, callback);
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f42065b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.f42066c;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.d;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.e;
                bi.n3 n3Var = (bi.n3) this.f42067f;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto(i0Var2, a2Var2.f36337a, a2Var2.h, a2Var2.f36341g, new JSONObject().put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2))).getString("challengeAnswer"), 2);
                    h = null;
                } catch (Exception e11) {
                    h = org.telegram.ui.Wallet.e2.h("decrypt challenge", e11);
                    bArr = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.w6((Object) bArr, (Object) sVar, h, (Object) n3Var, 8));
                return;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.f42065b;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f42066c;
                org.telegram.ui.Wallet.a2 a2Var3 = (org.telegram.ui.Wallet.a2) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.f42067f;
                try {
                    jSONObject = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                } catch (Exception e12) {
                    h10 = org.telegram.ui.Wallet.e2.h("save transfer", e12);
                }
                if (MessagesController.getMainSettings(e2Var3.f36506a).edit().putString(org.telegram.ui.Wallet.e2.j(a2Var3.f36337a.f22290id, a2Var3.f36338b) + ".transfer", jSONObject).commit()) {
                    h10 = null;
                    AndroidUtilities.runOnUIThread(new bi.c3(e2Var3, h10, callback2, a2Var3, i0Var3, sendtransfer, 22));
                    return;
                }
                throw new IllegalStateException("Could not save signed transfer");
            case 7:
                ((WalletEngine2) this.f42065b).lambda$emulateSendNFT$19((AtomicBoolean) this.d, (Utilities.Callback2) this.e, (TL_wallet.walletTransaction) this.f42067f, (String) this.f42066c);
                return;
            case 8:
                ((WalletEngine2) this.f42065b).lambda$prepareSend$49((Utilities.Callback3) this.d, (TL_wallet.sendTransfer) this.e, (String) this.f42066c, (String) this.f42067f);
                return;
            case 9:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f42065b;
                Utilities.Callback callback3 = (Utilities.Callback) this.f42066c;
                TLObject tLObject2 = (TLObject) this.d;
                MessagesController messagesController = (MessagesController) this.e;
                Utilities.Callback callback4 = (Utilities.Callback) this.f42067f;
                if (tL_error2 != null) {
                    callback3.run(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    messagesController.putUsers(tL_premium_myBoosts.users, false);
                    messagesController.putChats(tL_premium_myBoosts.chats, false);
                    callback4.run(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 10:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f42065b;
                org.telegram.messenger.z zVar = (org.telegram.messenger.z) this.f42066c;
                TLObject tLObject3 = (TLObject) this.d;
                MessagesController messagesController2 = (MessagesController) this.e;
                org.telegram.messenger.l2 l2Var = (org.telegram.messenger.l2) this.f42067f;
                if (tL_error3 != null) {
                    zVar.run(tL_error3);
                    return;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                    messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                    l2Var.run(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 11:
                TLObject tLObject4 = (TLObject) this.f42065b;
                MessagesController messagesController3 = (MessagesController) this.f42066c;
                di.y2 y2Var = (di.y2) this.d;
                vg.g gVar = (vg.g) this.e;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f42067f;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    y2Var.run(tL_payments_checkedGiftCode);
                }
                gVar.run(tL_error4);
                return;
            case 12:
                vg.n1.R((vg.n1) this.f42065b, (TLObject) this.f42066c, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.e, (TLRPC.TL_error) this.f42067f);
                return;
            default:
                zh.y4 y4Var = (zh.y4) this.f42065b;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f42067f;
                int i10 = y4Var.Y;
                org.telegram.ui.ActionBar.r2 r2Var2 = y4Var.f26811n;
                if (((TLObject) this.f42066c) instanceof TLRPC.TL_boolTrue) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = r2Var2.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i10);
                    rf.b bVar = new rf.b(13, false);
                    bVar.R(y4Var.f53339e0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.E()));
                    return;
                } else if (tL_error5 != null) {
                    org.telegram.ui.Components.g5.e0(i10, tL_error5, r2Var2, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
        }
    }

    public o01(Object obj, Object obj2, Object obj3, Object obj4, String str, int i10) {
        this.f42064a = i10;
        this.f42065b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f42067f = obj4;
        this.f42066c = str;
    }

    public o01(Object obj, Object obj2, Object obj3, String str, Object obj4, int i10) {
        this.f42064a = i10;
        this.f42065b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f42066c = str;
        this.f42067f = obj4;
    }
}
