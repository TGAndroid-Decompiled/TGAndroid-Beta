package org.telegram.ui;

import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class cu0 implements Runnable {
    public final int f46255a;
    public final Object f46256b;
    public final Object f46257c;
    public final Object d;
    public final Object f46258e;
    public final Object f46259f;

    public cu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f46255a = i7;
        this.f46256b = obj;
        this.f46257c = obj2;
        this.f46258e = obj3;
        this.f46259f = obj4;
        this.d = obj5;
    }

    @Override
    public final void run() {
        String p10;
        org.telegram.ui.Wallet.p0 p0Var;
        String i7;
        byte[] bArr;
        String str;
        int i10 = this.f46255a;
        String str2 = null;
        Object obj = this.d;
        Object obj2 = this.f46259f;
        Object obj3 = this.f46258e;
        Object obj4 = this.f46257c;
        Object obj5 = this.f46256b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                iv0 iv0Var = (iv0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
                    if (profileActivity.f43094e1 != 0) {
                        profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1));
                    } else {
                        profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f43102f1));
                    }
                    String str3 = "@" + tL_username.username;
                    String format = org.telegram.messenger.hd.E0().o0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String f10 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String f11 = org.telegram.messenger.r1.i().f(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(iv0Var.f38372x1, profileActivity.A0);
                    if (TextUtils.isEmpty(f11)) {
                        p10 = "";
                    } else {
                        p10 = a8.p0.p("(", f11, ")");
                    }
                    org.telegram.ui.Components.xb w10 = ccVar.w(2131231182, org.telegram.messenger.g0.c4(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750519, str3, format, f10, p10)), new mp0(14, profileActivity, tL_collectibleInfo)));
                    a90 a90Var = new a90(13, profileActivity, tL_collectibleInfo);
                    org.telegram.ui.Components.cb cbVar = w10.f41639e;
                    if (cbVar != null) {
                        cbVar.setOnClickListener(a90Var);
                    }
                    w10.k(false);
                    return;
                }
                RectF rectF = ProfileActivity.X6;
                org.telegram.ui.Components.cc.d0(tL_error);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                String str4 = (String) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                RectF rectF2 = ProfileActivity.X6;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    j00.a(profileActivity2.getParentActivity(), 1, str4, user, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.A0);
                    return;
                } else {
                    org.telegram.ui.Components.cc.d0(tL_error2);
                    return;
                }
            case 2:
                ProfileActivity.o0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 3:
                sw0 sw0Var = (sw0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.e2 e2Var = sw0Var.f51287e;
                if (((String) obj4).equals(sw0Var.E)) {
                    if (!sw0Var.f51293x && (e2Var instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) e2Var).P.f33705b.getImageReceiver().P0(false);
                            ((ProfileActivity) e2Var).P.d.setText(org.telegram.messenger.hd.M0(2131745476, null));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    sw0Var.f51293x = true;
                    sw0Var.f51290r = arrayList;
                    sw0Var.f51291s = arrayList2;
                    sw0Var.f51289n = arrayList3;
                    sw0Var.f();
                    if (e2Var instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) e2Var).P.f33705b.getImageReceiver().P0(false);
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
                n11 n11Var = (n11) obj5;
                n11Var.getClass();
                n11Var.p((View) obj4, Long.valueOf(((org.telegram.ui.Components.p5) obj3).documentId), (TLRPC.Document) obj2, ((x01) obj).f53062w, null);
                return;
            case 5:
                x11 x11Var = (x11) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj4;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                x11Var.getClass();
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    x11Var.e1(user2, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj5;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj4;
                org.telegram.ui.Wallet.d dVar = (org.telegram.ui.Wallet.d) obj2;
                String str5 = (String) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                    if (i0Var != null && !i0Var.d()) {
                        TL_wallet.WalletState walletState = l0Var.f44081e;
                        if ((walletState instanceof TL_wallet.TL_walletState) && (p0Var = l0Var.f44080c) != null && !p0Var.f(((TL_wallet.TL_walletState) walletState).public_key)) {
                            l0Var.f44080c.p(org.telegram.messenger.m10.i(l0Var.f44078a).e(), ((TL_wallet.TL_walletState) l0Var.f44081e).public_key, i0Var, null);
                        }
                    }
                    dVar.a(i0Var, str5);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 7:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                JSONObject jSONObject = (JSONObject) obj4;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj3;
                String str6 = (String) obj2;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj;
                d2Var.getClass();
                if (jSONObject == null) {
                    z10Var.a(str6);
                    return;
                } else {
                    d2Var.E(z1Var.f44776a.f28313id, z1Var.f44777b, jSONObject, z10Var);
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj4;
                x21 x21Var = (x21) obj2;
                di.t2 t2Var = (di.t2) obj;
                try {
                    bArr = Base64.decode(WalletEngine2.tonConnectCrypto((org.telegram.ui.Wallet.i0) obj5, z1Var2.f44776a, z1Var2.h, z1Var2.f44781g, new JSONObject().put("challenge", Base64.encodeToString(((TL_wallet.tonConnectChallenge) obj3).challenge, 2))).getString("challengeAnswer"), 2);
                    i7 = null;
                } catch (Exception e12) {
                    i7 = org.telegram.ui.Wallet.d2.i("decrypt challenge", e12);
                    bArr = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g7(7, bArr, x21Var, t2Var, i7));
                return;
            case 9:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj4;
                org.telegram.ui.Wallet.z1 z1Var3 = (org.telegram.ui.Wallet.z1) obj3;
                org.telegram.messenger.z10 z10Var2 = (org.telegram.messenger.z10) obj2;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) obj;
                try {
                    String jSONObject2 = new JSONObject().put("boc", Base64.encodeToString(sendtransfer.data_normal, 2)).put("randomId", sendtransfer.random_id).toString();
                    if (!org.telegram.messenger.np.s1(d2Var2.f43729a).f25280f7.edit().putString(org.telegram.ui.Wallet.d2.l(z1Var3.f44776a.f28313id, z1Var3.f44777b) + ".transfer", jSONObject2).commit()) {
                        throw new IllegalStateException("Could not save signed transfer");
                    }
                } catch (Exception e13) {
                    str2 = org.telegram.ui.Wallet.d2.i("save transfer", e13);
                }
                org.telegram.messenger.g0.h3(new bi.p1(d2Var2, str2, z10Var2, z1Var3, i0Var2, sendtransfer));
                return;
            case 10:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$19((AtomicBoolean) obj4, (org.telegram.messenger.s10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 11:
                ((WalletEngine2) obj5).lambda$prepareSend$49((org.telegram.messenger.u10) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 12:
                ((p4.g) obj4).run().b(new hn0((ab.c0) obj5, (AtomicBoolean) obj3, (p4.h) obj2, (AtomicBoolean) obj, 24), m9.r.f20591a);
                return;
            case 13:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                org.telegram.messenger.g1 g1Var = (org.telegram.messenger.g1) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                org.telegram.messenger.np npVar = (org.telegram.messenger.np) obj3;
                org.telegram.messenger.d3 d3Var = (org.telegram.messenger.d3) obj2;
                if (tL_error4 != null) {
                    g1Var.a(tL_error4);
                    return;
                } else if (tLObject4 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject4;
                    npVar.Y3(tL_premium_myBoosts.users, false);
                    npVar.S3(tL_premium_myBoosts.chats, false);
                    d3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 14:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                org.telegram.messenger.z10 z10Var3 = (org.telegram.messenger.z10) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.messenger.np npVar2 = (org.telegram.messenger.np) obj3;
                org.telegram.messenger.z10 z10Var4 = (org.telegram.messenger.z10) obj2;
                if (tL_error5 != null) {
                    z10Var3.a(tL_error5);
                    return;
                } else if (tLObject5 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject5;
                    npVar2.Y3(tL_premium_myBoosts2.users, false);
                    npVar2.S3(tL_premium_myBoosts2.chats, false);
                    z10Var4.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 15:
                TLObject tLObject6 = (TLObject) obj4;
                org.telegram.messenger.np npVar3 = (org.telegram.messenger.np) obj5;
                bi.o1 o1Var = (bi.o1) obj3;
                wg.e eVar = (wg.e) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (tLObject6 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject6;
                    npVar3.S3(tL_payments_checkedGiftCode.chats, false);
                    npVar3.Y3(tL_payments_checkedGiftCode.users, false);
                    o1Var.a(tL_payments_checkedGiftCode);
                }
                eVar.a(tL_error6);
                return;
            default:
                wg.c1 c1Var = (wg.c1) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                FrameLayout frameLayout = c1Var.f59144a2;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    org.telegram.ui.Components.xb Q = new org.telegram.ui.Components.cc(frameLayout, c1Var.J0).Q(2131623990, 36, org.telegram.messenger.hd.M0(2131746856, null));
                    Q.f41643j = 5000;
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
                    org.telegram.messenger.vr.a0(c1Var.f29679a).j2(userFull, false);
                }
                if (tL_error7 != null && (str = tL_error7.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (c1Var.getContext() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c1Var.getContext(), c1Var.J0);
                        String M0 = org.telegram.messenger.hd.M0(2131746852, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
                        i5.c.C(null, 2131747831, alertDialog$Builder, null);
                        return;
                    }
                    return;
                }
                org.telegram.messenger.k5.n(null, 2131743879, new org.telegram.ui.Components.cc(frameLayout, c1Var.J0), 2131624012, 36);
                return;
        }
    }

    public cu0(TLObject tLObject, org.telegram.messenger.np npVar, bi.o1 o1Var, wg.e eVar, TLRPC.TL_error tL_error) {
        this.f46255a = 15;
        this.f46257c = tLObject;
        this.f46256b = npVar;
        this.f46258e = o1Var;
        this.f46259f = eVar;
        this.d = tL_error;
    }

    public cu0(TLRPC.TL_error tL_error, org.telegram.messenger.z10 z10Var, TLObject tLObject, org.telegram.messenger.np npVar, org.telegram.messenger.z10 z10Var2, int i7) {
        this.f46255a = i7;
        this.d = tL_error;
        this.f46256b = z10Var;
        this.f46257c = tLObject;
        this.f46258e = npVar;
        this.f46259f = z10Var2;
    }

    public cu0(x11 x11Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        this.f46255a = 5;
        this.f46256b = x11Var;
        this.d = tL_error;
        this.f46257c = tLObject;
        this.f46258e = twoStepVerificationActivity;
        this.f46259f = user;
    }
}
