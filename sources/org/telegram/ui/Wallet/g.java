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
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.an;
import org.telegram.ui.t60;
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
                    m0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    v10Var.a(null, str2);
                    return;
                }
                m0.H("proof done");
                v10Var.a(importedWalletProof, null);
                return;
            case 1:
                m0 m0Var = (m0) obj3;
                d0 d0Var = (d0) obj;
                if (m0Var.N.get((String) obj2) == d0Var) {
                    d0Var.f42376e = true;
                    ArrayList arrayList = d0Var.f42377f;
                    m0Var.k0(d0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((c20) obj4).a(d0Var);
                    }
                    arrayList.clear();
                    m0Var.L();
                    return;
                }
                return;
            case 2:
                ((z1) obj3).f43466f = false;
                ((k) obj2).a((String) obj);
                return;
            case 3:
                a2 a2Var = (a2) obj2;
                fi.d dVar = (fi.d) obj;
                if (!((h60) obj3).canScrollVertically(1)) {
                    a2Var.f42106p = true;
                }
                if (!a2Var.f42106p || a2Var.f42103m || a2Var.f42104n) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                e2 e2Var = (e2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                e2Var.getClass();
                k kVar = new k((c20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!e2Var.f42429c.add(Long.valueOf(tonconnectsession.f27218id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    m mVar = new m(e2Var, tonconnectsession, kVar, 3);
                    if (tonconnectsession.closed) {
                        mVar.a(null);
                        return;
                    } else {
                        e2Var.f42428b.m0(new g(e2Var, mVar, tonconnectsession, 7));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 5:
                ((bi.p5) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 6:
                e2 e2Var2 = (e2) obj3;
                z1 z1Var = (z1) obj2;
                e2Var2.getClass();
                k kVar2 = new k((t60) obj, 3);
                TL_wallet.tonConnectSession tonconnectsession2 = z1Var.f43465e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (z1Var.f43466f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f43466f = true;
                    e2Var2.f42428b.m0(new f7(e2Var2, z1Var, kVar2, tonconnectsession2, 8));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 7:
                e2 e2Var3 = (e2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                m0 m0Var2 = e2Var3.f42428b;
                String t6 = m0Var2.t();
                byte[] y10 = m0Var2.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr2 = bArr;
                if (t6 != null && bArr2 != null) {
                    m0Var2.z(new bi.t3(e2Var3, mVar2, tonconnectsession3, t6, bArr2, 7), true, false);
                    return;
                } else {
                    mVar2.a("Wallet is not ready");
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                r2 r2Var = (r2) obj;
                u2.f43196a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    hc.b0(id.M0(2131742962, null));
                    r2Var.a();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = t2Var.a();
                if (!a10 && !t2Var.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar2.setEnabled(z9);
                if (a10 || t2Var.d) {
                    z10 = false;
                }
                dVar3.setEnabled(z10);
                return;
            case 10:
                ((f7) obj3).run();
                ((k60) obj2).K((k60) obj);
                return;
            case 11:
                z2[] z2VarArr = (z2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    z2 z2Var = z2VarArr[0];
                    if (z2Var != null) {
                        z2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(an.ra(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z2[] z2VarArr2 = (z2[]) obj3;
                z2VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                z2VarArr2[0].dismiss();
                return;
            case 13:
                z2[] z2VarArr3 = (z2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    z2 z2Var2 = z2VarArr3[0];
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(an.ra(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((v10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                return;
            case 15:
                b6 b6Var = (b6) obj3;
                y5 y5Var = (y5) obj2;
                b6Var.f42193b = y5Var;
                y5Var.j(b6Var.f42195c);
                b6Var.f42202g0 = Float.NaN;
                b6Var.b(b6Var.f42196c0, b6Var.f42201f0);
                b6Var.f42198e.setVisibility(0);
                ((z5) obj).run();
                k3 k3Var = b6Var.d;
                if (k3Var != null) {
                    b6Var.d = null;
                    k3Var.run();
                    return;
                }
                return;
            case 16:
                ((v10) obj).a((String) obj3, (String) obj2);
                return;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((d2) obj2, (c20) obj);
                return;
            case 18:
                ((v10) obj).a((Long) obj3, (String) obj2);
                return;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((d2) obj2, (v10) obj);
                return;
            case 20:
                a8 a8Var = (a8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                a8Var.C = false;
                b8 b8Var = a8Var.f42129d0;
                boolean z11 = b8Var.f42218a1;
                g6 g6Var = b8Var.f42222c;
                if (!z11) {
                    if (a8Var.f42145u == null) {
                        a8Var.f42145u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (g6Var.isShown() && g6Var.getAlpha() > 0.0f) {
                            z7 z7Var = a8Var.f42142r;
                            z7Var.a(0.0f);
                            z7Var.f43472b = 1.0f;
                        }
                    }
                    a8Var.f42145u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && a8Var.f42146w == null) {
                        a8Var.f42146w = bitmap;
                    }
                    if (a8Var.D) {
                        a8Var.c();
                    }
                    b8Var.f0();
                    return;
                }
                return;
            default:
                n8 n8Var = (n8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getParentActivity(), n8Var.getResourceProvider());
                String M0 = id.M0(2131743134, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131743137, null);
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.k(id.M0(2131743139, null), new i8(n8Var, (m0) obj2, (h0) obj));
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

    public g(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.f42514a = 0;
        this.f42515b = importedWalletProof;
        this.f42516c = exc;
        this.d = v10Var;
    }
}
