package org.telegram.ui;

import android.app.Activity;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class c01 implements Runnable {
    public final int f44516a;
    public final Object f44517b;
    public final Object f44518c;
    public final Object d;
    public final Object f44519e;
    public final Object f44520f;

    public c01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f44516a = i7;
        this.f44517b = obj;
        this.f44518c = obj2;
        this.d = obj3;
        this.f44519e = obj4;
        this.f44520f = obj5;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        String i7;
        byte[] bArr;
        String str;
        int i10 = this.f44516a;
        String str2 = null;
        Object obj = this.f44520f;
        Object obj2 = this.f44519e;
        Object obj3 = this.d;
        Object obj4 = this.f44518c;
        Object obj5 = this.f44517b;
        switch (i10) {
            case 0:
                q11 q11Var = (q11) obj5;
                q11Var.getClass();
                q11Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.r5) obj3).documentId), (TLRPC.Document) obj2, ((a11) obj).f43538w, null);
                return;
            case 1:
                a21 a21Var = (a21) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                a21Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    a21Var.e1(user, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj5;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj2;
                String str3 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                    if (k0Var != null && !k0Var.d()) {
                        TL_wallet.WalletState walletState = n0Var.f42796e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (r0Var = n0Var.f42795c) != null && !r0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            n0Var.f42795c.p(org.telegram.messenger.p10.i(n0Var.f42793a).e(), ((TL_wallet.TL_walletState) n0Var.f42796e).public_key, k0Var, null);
                        }
                    }
                    dVar.a(k0Var, str3);
                    if (k0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (k0Var != null) {
                        k0Var.close();
                    }
                }
            case 3:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) obj;
                f2Var.getClass();
                if (jSONObject == null) {
                    c20Var.a(str4);
                    return;
                } else {
                    f2Var.E(b2Var.f42122a.f27214id, b2Var.f42123b, jSONObject, c20Var);
                    return;
                }
            case 4:
                org.telegram.ui.Wallet.b2 b2Var2 = (org.telegram.ui.Wallet.b2) obj4;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) obj2;
                bi.n3 n3Var = (bi.n3) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.k0) obj5, b2Var2.f42122a, b2Var2.h, b2Var2.f42127g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e10) {
                    i7 = org.telegram.ui.Wallet.f2.i("decrypt challenge", e10);
                    bArr = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g7((Object) bArr, (Object) tVar, i7, (Object) n3Var, 7));
                return;
            case 5:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.b2 b2Var3 = (org.telegram.ui.Wallet.b2) obj3;
                org.telegram.messenger.c20 c20Var2 = (org.telegram.messenger.c20) obj2;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.qp.s1(f2Var2.f42460a).f24759e7.edit().putString(org.telegram.ui.Wallet.f2.l(b2Var3.f42122a.f27214id, b2Var3.f42123b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e11) {
                    str2 = org.telegram.ui.Wallet.f2.i("save transfer", e11);
                }
                org.telegram.messenger.g0.h3(new bi.a3(f2Var2, str2, c20Var2, b2Var3, k0Var2, sendtransfer, 22));
                return;
            case 6:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (org.telegram.messenger.v10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 7:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.x10) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 8:
                ((p4.g) obj4).run().b(new jo0((ui.e) obj5, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 21), m9.r.f19991a);
                return;
            case 9:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) obj2;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) obj;
                if (tL_error2 != null) {
                    g1Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    qpVar.Y3(tL_premium_myBoosts.users, false);
                    qpVar.S3(tL_premium_myBoosts.chats, false);
                    d3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 10:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.c20 c20Var3 = (org.telegram.messenger.c20) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                org.telegram.messenger.qp qpVar2 = (org.telegram.messenger.qp) obj2;
                org.telegram.messenger.c20 c20Var4 = (org.telegram.messenger.c20) obj;
                if (tL_error3 != null) {
                    c20Var3.a(tL_error3);
                    return;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    qpVar2.Y3(tL_premium_myBoosts2.users, false);
                    qpVar2.S3(tL_premium_myBoosts2.chats, false);
                    c20Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 11:
                TLObject tLObject4 = (TLObject) obj5;
                org.telegram.messenger.qp qpVar3 = (org.telegram.messenger.qp) obj4;
                di.s2 s2Var = (di.s2) obj3;
                wg.e eVar = (wg.e) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    qpVar3.S3(tL_payments_checkedGiftCode.chats, false);
                    qpVar3.Y3(tL_payments_checkedGiftCode.users, false);
                    s2Var.a(tL_payments_checkedGiftCode);
                }
                eVar.a(tL_error4);
                return;
            case 12:
                wg.f1 f1Var = (wg.f1) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                FrameLayout frameLayout = f1Var.W1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.cc Q = new org.telegram.ui.Components.hc(frameLayout, f1Var.I0).Q(2131623989, 36, org.telegram.messenger.hd.M0(2131746855, null));
                    Q.f32527j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    org.telegram.messenger.yr.a0(f1Var.f28612a).j2(userFull, false);
                }
                if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (f1Var.getContext() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f1Var.getContext(), f1Var.I0);
                        String M0 = org.telegram.messenger.hd.M0(2131746851, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.M0(2131746852, null);
                        jg.g.C(null, 2131747830, alertDialog$Builder, null);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.o(null, 2131743880, new org.telegram.ui.Components.hc(frameLayout, f1Var.I0), 2131624011, 36);
                return;
            default:
                zh.b4 b4Var = (zh.b4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i11 = b4Var.Q1;
                org.telegram.ui.ActionBar.f2 f2Var3 = b4Var.f36224o1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity = f2Var3.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                    q4.q qVar = new q4.q(20, false);
                    qVar.g(b4Var.W1.h);
                    i12.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(qVar.a()));
                    return;
                } else if (tL_error6 != null) {
                    org.telegram.ui.Components.v4.c0(i11, tL_error6, f2Var3, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
        }
    }
}
