package org.telegram.ui;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class eu0 implements Runnable {
    public final int f47626a;
    public final Object f47627b;
    public final Object f47628c;
    public final Object d;
    public final Object f47629e;
    public final Object f47630f;

    public eu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f47626a = i7;
        this.f47627b = obj;
        this.f47628c = obj2;
        this.f47629e = obj3;
        this.f47630f = obj4;
        this.d = obj5;
    }

    @Override
    public final void run() {
        String p10;
        org.telegram.ui.Wallet.a1 a1Var;
        String i7;
        byte[] bArr;
        int i10 = this.f47626a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f47630f;
        Object obj3 = this.f47629e;
        Object obj4 = this.f47627b;
        Object obj5 = this.f47628c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLObject tLObject = (TLObject) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                jv0 jv0Var = (jv0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
                    if (profileActivity.f43666e1 != 0) {
                        profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43666e1));
                    } else {
                        profileActivity.getMessagesController().O0(Long.valueOf(profileActivity.f43674f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = org.telegram.messenger.gd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(jv0Var.f43002x1, profileActivity.A0);
                    if (TextUtils.isEmpty(f11)) {
                        p10 = "";
                    } else {
                        p10 = a8.p0.p("(", f11, ")");
                    }
                    org.telegram.ui.Components.fc w10 = kcVar.w(2131231184, org.telegram.messenger.g0.b4(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750502, str2, format, f10, p10)), new mp0(15, profileActivity, tL_collectibleInfo)));
                    ig0 ig0Var = new ig0(7, profileActivity, tL_collectibleInfo);
                    org.telegram.ui.Components.kb kbVar = w10.f35087e;
                    if (kbVar != null) {
                        kbVar.setOnClickListener(ig0Var);
                    }
                    w10.k(false);
                    return;
                }
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.Components.kc.e0(tL_error);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject2 = (TLObject) obj5;
                String str3 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                RectF rectF2 = ProfileActivity.Z6;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    l00.a(profileActivity2.getParentActivity(), 1, str3, user, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.A0);
                    return;
                } else {
                    org.telegram.ui.Components.kc.e0(tL_error2);
                    return;
                }
            case 2:
                ProfileActivity.o0((ProfileActivity) obj4, (TLObject) obj5, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 3:
                uw0 uw0Var = (uw0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = uw0Var.f52743e;
                if (((String) obj5).equals(uw0Var.E)) {
                    if (!uw0Var.f52749x && (g2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) g2Var).P.f37551b.getImageReceiver().Q0(false);
                            ((ProfileActivity) g2Var).P.d.setText(org.telegram.messenger.gd.N0(2131745280, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    uw0Var.f52749x = true;
                    uw0Var.f52746r = arrayList;
                    uw0Var.f52747s = arrayList2;
                    uw0Var.f52745n = arrayList3;
                    uw0Var.f();
                    if (g2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) g2Var).P.f37551b.getImageReceiver().Q0(false);
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                q11 q11Var = (q11) obj4;
                q11Var.getClass();
                q11Var.p((View) obj5, Long.valueOf(((org.telegram.ui.Components.x5) obj3).documentId), (TLRPC.Document) obj2, ((a11) obj).f45554w, null);
                return;
            case 5:
                a21 a21Var = (a21) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                a21Var.getClass();
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    a21Var.f1(user2, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj4;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj5;
                org.telegram.ui.Wallet.e eVar = (org.telegram.ui.Wallet.e) obj2;
                String str4 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                    if (s0Var != null && !s0Var.d()) {
                        TL_wallet.WalletState walletState = v0Var.f45258e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (a1Var = v0Var.f45257c) != null && !a1Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            v0Var.f45257c.q(org.telegram.messenger.i10.i(v0Var.f45255a).e(), ((TL_wallet.TL_walletState) v0Var.f45258e).public_key, s0Var, null);
                        }
                    }
                    eVar.a(s0Var, str4);
                    if (s0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (s0Var != null) {
                        s0Var.close();
                    }
                }
            case 7:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) obj4;
                JSONObject jSONObject = (JSONObject) obj5;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj;
                m2Var.getClass();
                if (jSONObject == null) {
                    w10Var.a(str5);
                    return;
                } else {
                    m2Var.E(i2Var.f44461a.f28754id, i2Var.f44462b, jSONObject, w10Var);
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.i2 i2Var2 = (org.telegram.ui.Wallet.i2) obj5;
                a31 a31Var = (a31) obj2;
                di.x2 x2Var = (di.x2) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.s0) obj4, i2Var2.f44461a, i2Var2.h, i2Var2.f44466g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e12) {
                    i7 = org.telegram.ui.Wallet.m2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.w7((Object) bArr, (Object) a31Var, i7, (Object) x2Var, 6));
                return;
            case 9:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) obj4;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                org.telegram.ui.Wallet.i2 i2Var3 = (org.telegram.ui.Wallet.i2) obj3;
                org.telegram.messenger.w10 w10Var2 = (org.telegram.messenger.w10) obj2;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.mp.u1(m2Var2.f44648a).h7.edit().putString(org.telegram.ui.Wallet.m2.l(i2Var3.f44461a.f28754id, i2Var3.f44462b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str = org.telegram.ui.Wallet.m2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.g3(new bi.n2(m2Var2, str, w10Var2, i2Var3, s0Var2, sendtransfer));
                return;
            case 10:
                ((WalletEngine2) obj4).lambda$emulateSendNFT$22((AtomicBoolean) obj5, (org.telegram.messenger.p10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 11:
                ((WalletEngine2) obj4).lambda$prepareSend$52((org.telegram.messenger.r10) obj5, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 12:
                ((p4.g) obj5).run().b(new yd0((ab.c0) obj4, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 29), m9.r.f21045a);
                return;
            case 13:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj4;
                TLObject tLObject4 = (TLObject) obj5;
                org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj2;
                if (tL_error4 != null) {
                    g1Var.a(tL_error4);
                    return;
                } else if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject4;
                    mpVar.f4(tL_premium_myBoosts.users, false);
                    mpVar.Z3(tL_premium_myBoosts.chats, false);
                    e3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 14:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.messenger.w10 w10Var3 = (org.telegram.messenger.w10) obj4;
                TLObject tLObject5 = (TLObject) obj5;
                org.telegram.messenger.mp mpVar2 = (org.telegram.messenger.mp) obj3;
                org.telegram.messenger.w10 w10Var4 = (org.telegram.messenger.w10) obj2;
                if (tL_error5 != null) {
                    w10Var3.a(tL_error5);
                    return;
                } else if (tLObject5 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject5;
                    mpVar2.f4(tL_premium_myBoosts2.users, false);
                    mpVar2.Z3(tL_premium_myBoosts2.chats, false);
                    w10Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            default:
                TLObject tLObject6 = (TLObject) obj5;
                org.telegram.messenger.mp mpVar3 = (org.telegram.messenger.mp) obj4;
                bi.o2 o2Var = (bi.o2) obj3;
                wg.e eVar2 = (wg.e) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (tLObject6 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject6;
                    mpVar3.Z3(tL_payments_checkedGiftCode.chats, false);
                    mpVar3.f4(tL_payments_checkedGiftCode.users, false);
                    o2Var.a(tL_payments_checkedGiftCode);
                }
                eVar2.a(tL_error6);
                return;
        }
    }

    public eu0(TLObject tLObject, org.telegram.messenger.mp mpVar, bi.o2 o2Var, wg.e eVar, TLRPC.TL_error tL_error) {
        this.f47626a = 15;
        this.f47628c = tLObject;
        this.f47627b = mpVar;
        this.f47629e = o2Var;
        this.f47630f = eVar;
        this.d = tL_error;
    }

    public eu0(TLRPC.TL_error tL_error, org.telegram.messenger.w10 w10Var, TLObject tLObject, org.telegram.messenger.mp mpVar, org.telegram.messenger.w10 w10Var2, int i7) {
        this.f47626a = i7;
        this.d = tL_error;
        this.f47627b = w10Var;
        this.f47628c = tLObject;
        this.f47629e = mpVar;
        this.f47630f = w10Var2;
    }

    public eu0(a21 a21Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f47626a = 5;
        this.f47627b = a21Var;
        this.d = tL_error;
        this.f47628c = tLObject;
        this.f47629e = twoStepVerificationActivity;
        this.f47630f = user;
    }
}
