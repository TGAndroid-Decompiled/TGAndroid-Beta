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
public final class gu0 implements Runnable {
    public final int f48133a;
    public final Object f48134b;
    public final Object f48135c;
    public final Object d;
    public final Object f48136e;
    public final Object f48137f;

    public gu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f48133a = i7;
        this.f48134b = obj;
        this.f48135c = obj2;
        this.f48136e = obj3;
        this.f48137f = obj4;
        this.d = obj5;
    }

    @Override
    public final void run() {
        String p10;
        org.telegram.ui.Wallet.z0 z0Var;
        String i7;
        byte[] bArr;
        int i10 = this.f48133a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f48137f;
        Object obj3 = this.f48136e;
        Object obj4 = this.f48134b;
        Object obj5 = this.f48135c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLObject tLObject = (TLObject) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                lv0 lv0Var = (lv0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
                    if (profileActivity.f43550e1 != 0) {
                        profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1));
                    } else {
                        profileActivity.getMessagesController().O0(Long.valueOf(profileActivity.f43558f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = org.telegram.messenger.hd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(lv0Var.f33578x1, profileActivity.A0);
                    if (TextUtils.isEmpty(f11)) {
                        p10 = "";
                    } else {
                        p10 = a8.p0.p("(", f11, ")");
                    }
                    org.telegram.ui.Components.gc w10 = lcVar.w(2131231182, org.telegram.messenger.g0.b4(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750502, str2, format, f10, p10)), new ur0(9, profileActivity, tL_collectibleInfo)));
                    jg0 jg0Var = new jg0(7, profileActivity, tL_collectibleInfo);
                    org.telegram.ui.Components.lb lbVar = w10.f35485e;
                    if (lbVar != null) {
                        lbVar.setOnClickListener(jg0Var);
                    }
                    w10.k(false);
                    return;
                }
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.Components.lc.e0(tL_error);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject2 = (TLObject) obj5;
                String str3 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                RectF rectF2 = ProfileActivity.Z6;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    m00.a(profileActivity2.getParentActivity(), 1, str3, user, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.A0);
                    return;
                } else {
                    org.telegram.ui.Components.lc.e0(tL_error2);
                    return;
                }
            case 2:
                ProfileActivity.o0((ProfileActivity) obj4, (TLObject) obj5, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 3:
                ww0 ww0Var = (ww0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.g2 g2Var = ww0Var.f53461e;
                if (((String) obj5).equals(ww0Var.E)) {
                    if (!ww0Var.f53467x && (g2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) g2Var).P.f37960b.getImageReceiver().P0(false);
                            ((ProfileActivity) g2Var).P.d.setText(org.telegram.messenger.hd.N0(2131745280, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    ww0Var.f53467x = true;
                    ww0Var.f53464r = arrayList;
                    ww0Var.f53465s = arrayList2;
                    ww0Var.f53463n = arrayList3;
                    ww0Var.f();
                    if (g2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) g2Var).P.f37960b.getImageReceiver().P0(false);
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
                r11 r11Var = (r11) obj4;
                r11Var.getClass();
                r11Var.p((View) obj5, Long.valueOf(((org.telegram.ui.Components.y5) obj3).documentId), (TLRPC.Document) obj2, ((b11) obj).f45703w, null);
                return;
            case 5:
                b21 b21Var = (b21) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj5;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                b21Var.getClass();
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    b21Var.f1(user2, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj4;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj5;
                org.telegram.ui.Wallet.e eVar = (org.telegram.ui.Wallet.e) obj2;
                String str4 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                    if (r0Var != null && !r0Var.d()) {
                        TL_wallet.WalletState walletState = u0Var.f45096e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (z0Var = u0Var.f45095c) != null && !z0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            u0Var.f45095c.q(org.telegram.messenger.k10.i(u0Var.f45093a).e(), ((TL_wallet.TL_walletState) u0Var.f45096e).public_key, r0Var, null);
                        }
                    }
                    eVar.a(r0Var, str4);
                    if (r0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (r0Var != null) {
                        r0Var.close();
                    }
                }
            case 7:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj4;
                JSONObject jSONObject = (JSONObject) obj5;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj;
                l2Var.getClass();
                if (jSONObject == null) {
                    y10Var.a(str5);
                    return;
                } else {
                    l2Var.E(h2Var.f44299a.f28660id, h2Var.f44300b, jSONObject, y10Var);
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) obj5;
                p51 p51Var = (p51) obj2;
                di.x2 x2Var = (di.x2) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.r0) obj4, h2Var2.f44299a, h2Var2.h, h2Var2.f44304g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e12) {
                    i7 = org.telegram.ui.Wallet.l2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.v7((Object) bArr, (Object) p51Var, i7, (Object) x2Var, 6));
                return;
            case 9:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) obj4;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj5;
                org.telegram.ui.Wallet.h2 h2Var3 = (org.telegram.ui.Wallet.h2) obj3;
                org.telegram.messenger.y10 y10Var2 = (org.telegram.messenger.y10) obj2;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.np.u1(l2Var2.f44489a).h7.edit().putString(org.telegram.ui.Wallet.l2.l(h2Var3.f44299a.f28660id, h2Var3.f44300b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str = org.telegram.ui.Wallet.l2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.g3(new bi.n2(l2Var2, str, y10Var2, h2Var3, r0Var2, sendtransfer));
                return;
            case 10:
                ((WalletEngine2) obj4).lambda$emulateSendNFT$22((AtomicBoolean) obj5, (org.telegram.messenger.r10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 11:
                ((WalletEngine2) obj4).lambda$prepareSend$52((org.telegram.messenger.t10) obj5, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 12:
                ((p4.g) obj5).run().b(new kg0((ab.c0) obj4, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 28), m9.r.f20949a);
                return;
            case 13:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj4;
                TLObject tLObject4 = (TLObject) obj5;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj2;
                if (tL_error4 != null) {
                    g1Var.a(tL_error4);
                    return;
                } else if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject4;
                    npVar.f4(tL_premium_myBoosts.users, false);
                    npVar.Z3(tL_premium_myBoosts.chats, false);
                    e3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 14:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.messenger.y10 y10Var3 = (org.telegram.messenger.y10) obj4;
                TLObject tLObject5 = (TLObject) obj5;
                org.telegram.messenger.np npVar2 = (org.telegram.messenger.np) obj3;
                org.telegram.messenger.y10 y10Var4 = (org.telegram.messenger.y10) obj2;
                if (tL_error5 != null) {
                    y10Var3.a(tL_error5);
                    return;
                } else if (tLObject5 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject5;
                    npVar2.f4(tL_premium_myBoosts2.users, false);
                    npVar2.Z3(tL_premium_myBoosts2.chats, false);
                    y10Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            default:
                TLObject tLObject6 = (TLObject) obj5;
                org.telegram.messenger.np npVar3 = (org.telegram.messenger.np) obj4;
                bi.o2 o2Var = (bi.o2) obj3;
                wg.e eVar2 = (wg.e) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (tLObject6 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject6;
                    npVar3.Z3(tL_payments_checkedGiftCode.chats, false);
                    npVar3.f4(tL_payments_checkedGiftCode.users, false);
                    o2Var.a(tL_payments_checkedGiftCode);
                }
                eVar2.a(tL_error6);
                return;
        }
    }

    public gu0(TLObject tLObject, org.telegram.messenger.np npVar, bi.o2 o2Var, wg.e eVar, TLRPC.TL_error tL_error) {
        this.f48133a = 15;
        this.f48135c = tLObject;
        this.f48134b = npVar;
        this.f48136e = o2Var;
        this.f48137f = eVar;
        this.d = tL_error;
    }

    public gu0(TLRPC.TL_error tL_error, org.telegram.messenger.y10 y10Var, TLObject tLObject, org.telegram.messenger.np npVar, org.telegram.messenger.y10 y10Var2, int i7) {
        this.f48133a = i7;
        this.d = tL_error;
        this.f48134b = y10Var;
        this.f48135c = tLObject;
        this.f48136e = npVar;
        this.f48137f = y10Var2;
    }

    public gu0(b21 b21Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f48133a = 5;
        this.f48134b = b21Var;
        this.d = tL_error;
        this.f48135c = tLObject;
        this.f48136e = twoStepVerificationActivity;
        this.f48137f = user;
    }
}
