package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.k60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cn;
import org.telegram.ui.w60;
public final class g implements Runnable {
    public final int f42514a;
    public final Object f42515b;
    public final Object f42516c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i7) {
        this.f42514a = i7;
        this.f42515b = obj;
        this.f42516c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        boolean z9;
        int i7 = this.f42514a;
        boolean z10 = true;
        byte[] bArr = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f42516c;
        Object obj3 = this.f42515b;
        switch (i7) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                v10 v10Var = (v10) obj;
                if (importedWalletProof == null) {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb2.append(str);
                    l0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    v10Var.a(null, str2);
                    return;
                }
                l0.H("proof done");
                v10Var.a(importedWalletProof, null);
                return;
            case 1:
                l0 l0Var = (l0) obj3;
                c0 c0Var = (c0) obj;
                if (l0Var.N.get((String) obj2) == c0Var) {
                    c0Var.f42201e = true;
                    ArrayList arrayList = c0Var.f42202f;
                    l0Var.k0(c0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((c20) obj4).a(c0Var);
                    }
                    arrayList.clear();
                    l0Var.L();
                    return;
                }
                return;
            case 2:
                ((y1) obj3).f43378f = false;
                ((k) obj2).a((String) obj);
                return;
            case 3:
                z1 z1Var = (z1) obj2;
                fi.d dVar = (fi.d) obj;
                if (!((h60) obj3).canScrollVertically(1)) {
                    z1Var.f43425p = true;
                }
                if (!z1Var.f43425p || z1Var.f43422m || z1Var.f43423n) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                d2 d2Var = (d2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                d2Var.getClass();
                k kVar = new k((c20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!d2Var.f42288c.add(Long.valueOf(tonconnectsession.f27222id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    m mVar = new m(d2Var, tonconnectsession, kVar, 3);
                    if (tonconnectsession.closed) {
                        mVar.a(null);
                        return;
                    } else {
                        d2Var.f42287b.m0(new g(d2Var, mVar, tonconnectsession, 7));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 5:
                ((bi.p5) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 6:
                d2 d2Var2 = (d2) obj3;
                y1 y1Var = (y1) obj2;
                d2Var2.getClass();
                k kVar2 = new k((w60) obj, 3);
                TL_wallet.tonConnectSession tonconnectsession2 = y1Var.f43377e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (y1Var.f43378f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    y1Var.f43378f = true;
                    d2Var2.f42287b.m0(new h7(d2Var2, y1Var, kVar2, tonconnectsession2, 8));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 7:
                d2 d2Var3 = (d2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                l0 l0Var2 = d2Var3.f42287b;
                String t6 = l0Var2.t();
                byte[] y10 = l0Var2.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr2 = bArr;
                if (t6 != null && bArr2 != null) {
                    l0Var2.z(new bi.t3(d2Var3, mVar2, tonconnectsession3, t6, bArr2, 7), true, false);
                    return;
                } else {
                    mVar2.a("Wallet is not ready");
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                q2 q2Var = (q2) obj;
                t2.f43180a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    gc.b0(id.M0(2131742959, null));
                    q2Var.a();
                    return;
                }
                return;
            case 9:
                s2 s2Var = (s2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = s2Var.a();
                if (!a10 && !s2Var.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar2.setEnabled(z9);
                if (a10 || s2Var.d) {
                    z10 = false;
                }
                dVar3.setEnabled(z10);
                return;
            case 10:
                p3 p3Var = (p3) obj3;
                p3Var.U = new k3((org.telegram.ui.ActionBar.f2) obj2, (TL_wallet.card) obj, 0);
                p3Var.dismiss();
                return;
            case 11:
                ((h7) obj3).run();
                ((k60) obj2).K((k60) obj);
                return;
            case 12:
                y2[] y2VarArr = (y2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    y2 y2Var = y2VarArr[0];
                    if (y2Var != null) {
                        y2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(cn.ta(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y2[] y2VarArr2 = (y2[]) obj3;
                y2VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                y2VarArr2[0].dismiss();
                return;
            case 14:
                y2[] y2VarArr3 = (y2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    y2 y2Var2 = y2VarArr3[0];
                    if (y2Var2 != null) {
                        y2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(cn.ta(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((v10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                return;
            case 16:
                d6 d6Var = (d6) obj3;
                a6 a6Var = (a6) obj2;
                d6Var.f42352b = a6Var;
                a6Var.j(d6Var.f42354c);
                d6Var.f42361g0 = Float.NaN;
                d6Var.b(d6Var.f42355c0, d6Var.f42360f0);
                d6Var.f42357e.setVisibility(0);
                ((b6) obj).run();
                j3 j3Var = d6Var.d;
                if (j3Var != null) {
                    d6Var.d = null;
                    j3Var.run();
                    return;
                }
                return;
            case 17:
                ((v10) obj).a((String) obj3, (String) obj2);
                return;
            case 18:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((c2) obj2, (c20) obj);
                return;
            case 19:
                ((v10) obj).a((Long) obj3, (String) obj2);
                return;
            case 20:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((c2) obj2, (v10) obj);
                return;
            case 21:
                c8 c8Var = (c8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                c8Var.C = false;
                d8 d8Var = c8Var.f42225d0;
                boolean z11 = d8Var.f42377a1;
                i6 i6Var = d8Var.f42381c;
                if (!z11) {
                    if (c8Var.f42241u == null) {
                        c8Var.f42241u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (i6Var.isShown() && i6Var.getAlpha() > 0.0f) {
                            b8 b8Var = c8Var.f42238r;
                            b8Var.a(0.0f);
                            b8Var.f42184b = 1.0f;
                        }
                    }
                    c8Var.f42241u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && c8Var.f42242w == null) {
                        c8Var.f42242w = bitmap;
                    }
                    if (c8Var.D) {
                        c8Var.c();
                    }
                    d8Var.f0();
                    return;
                }
                return;
            default:
                p8 p8Var = (p8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p8Var.getParentActivity(), p8Var.getResourceProvider());
                String M0 = id.M0(2131743131, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743134, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743136, null), new k8(p8Var, (l0) obj2, (g0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public g(v10 v10Var, Serializable serializable, Serializable serializable2, int i7) {
        this.f42514a = i7;
        this.d = v10Var;
        this.f42515b = serializable;
        this.f42516c = serializable2;
    }

    public g(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.f42514a = 0;
        this.f42515b = importedWalletProof;
        this.f42516c = exc;
        this.d = v10Var;
    }
}
