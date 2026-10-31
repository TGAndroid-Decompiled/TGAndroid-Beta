package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.fe;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.af;
import org.telegram.ui.r70;
import org.telegram.ui.un;
public final class g implements Runnable {
    public final int f34530a;
    public final Object f34531b;
    public final Object f34532c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i10) {
        this.f34530a = i10;
        this.f34531b = obj;
        this.f34532c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        int i10 = this.f34530a;
        boolean z11 = true;
        byte[] bArr = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f34532c;
        Object obj3 = this.f34531b;
        switch (i10) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                j20 j20Var = (j20) obj;
                if (importedWalletProof == null) {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb2.append(str);
                    k0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    j20Var.a(null, str2);
                    return;
                }
                k0.H("proof done");
                j20Var.a(importedWalletProof, null);
                return;
            case 1:
                k0 k0Var = (k0) obj3;
                b0 b0Var = (b0) obj;
                if (k0Var.N.get((String) obj2) == b0Var) {
                    b0Var.e = true;
                    ArrayList arrayList = b0Var.f34224f;
                    k0Var.k0(b0Var);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        ((q20) obj4).a(b0Var);
                    }
                    arrayList.clear();
                    k0Var.L();
                    return;
                }
                return;
            case 2:
                ((z1) obj3).f35451f = false;
                ((k) obj2).a((String) obj);
                return;
            case 3:
                a2 a2Var = (a2) obj2;
                vh.d dVar = (vh.d) obj;
                if (!((w60) obj3).canScrollVertically(1)) {
                    a2Var.f34174p = true;
                }
                if (!a2Var.f34174p || a2Var.f34171m || a2Var.f34172n) {
                    z11 = false;
                }
                dVar.setEnabled(z11);
                return;
            case 4:
                e2 e2Var = (e2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                e2Var.getClass();
                k kVar = new k((q20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!e2Var.f34447c.add(Long.valueOf(tonconnectsession.f20055id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    m mVar = new m(e2Var, tonconnectsession, kVar, 3);
                    if (tonconnectsession.closed) {
                        mVar.a(null);
                        return;
                    } else {
                        e2Var.f34446b.m0(new g(e2Var, mVar, tonconnectsession, 7));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 5:
                ((ih.s) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 6:
                e2 e2Var2 = (e2) obj3;
                z1 z1Var = (z1) obj2;
                e2Var2.getClass();
                k kVar2 = new k((r70) obj, 3);
                TL_wallet.tonConnectSession tonconnectsession2 = z1Var.e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (z1Var.f35451f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f35451f = true;
                    e2Var2.f34446b.m0(new k7(e2Var2, z1Var, kVar2, tonconnectsession2, 8));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 7:
                e2 e2Var3 = (e2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                k0 k0Var2 = e2Var3.f34446b;
                String t10 = k0Var2.t();
                byte[] y3 = k0Var2.y();
                if (y3 != null) {
                    bArr = (byte[]) y3.clone();
                }
                byte[] bArr2 = bArr;
                if (t10 != null && bArr2 != null) {
                    k0Var2.z(new af(e2Var3, mVar2, tonconnectsession3, t10, bArr2, 6), true, false);
                    return;
                } else {
                    mVar2.a("Wallet is not ready");
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                r2 r2Var = (r2) obj;
                u2.f35268a.remove((fe) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    cc.b0(cd.L0(2131742985, null));
                    r2Var.a();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) obj3;
                vh.d dVar2 = (vh.d) obj2;
                vh.d dVar3 = (vh.d) obj;
                boolean a2 = t2Var.a();
                if (!a2 && !t2Var.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar2.setEnabled(z10);
                if (a2 || t2Var.d) {
                    z11 = false;
                }
                dVar3.setEnabled(z11);
                return;
            case 10:
                ((k7) obj3).run();
                ((z60) obj2).K((z60) obj);
                return;
            case 11:
                z2[] z2VarArr = (z2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((l20) obj3) == null) {
                    z2 z2Var = z2VarArr[0];
                    if (z2Var != null) {
                        z2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(un.ha(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z2[] z2VarArr2 = (z2[]) obj3;
                z2VarArr2[0].setOnDismissListener(new mg.g(11, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                z2VarArr2[0].dismiss();
                return;
            case 13:
                z2[] z2VarArr3 = (z2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((l20) obj3) == null) {
                    z2 z2Var2 = z2VarArr3[0];
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(un.ha(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((j20) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                return;
            case 15:
                g6 g6Var = (g6) obj3;
                c6 c6Var = (c6) obj2;
                g6Var.f34554b = c6Var;
                c6Var.j(g6Var.f34556c);
                g6Var.f34562g0 = Float.NaN;
                g6Var.b(g6Var.f34557c0, g6Var.f34561f0);
                g6Var.e.setVisibility(0);
                ((d6) obj).run();
                l3 l3Var = g6Var.d;
                if (l3Var != null) {
                    g6Var.d = null;
                    l3Var.run();
                    return;
                }
                return;
            case 16:
                ((j20) obj).a((String) obj3, (String) obj2);
                return;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((d2) obj2, (q20) obj);
                return;
            case 18:
                ((j20) obj).a((Long) obj3, (String) obj2);
                return;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((d2) obj2, (j20) obj);
                return;
            case 20:
                g8 g8Var = (g8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                g8Var.C = false;
                h8 h8Var = g8Var.f34582d0;
                boolean z12 = h8Var.f34628a1;
                l6 l6Var = h8Var.f34632c;
                if (!z12) {
                    if (g8Var.f34597u == null) {
                        g8Var.f34597u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (l6Var.isShown() && l6Var.getAlpha() > 0.0f) {
                            f8 f8Var = g8Var.f34594r;
                            f8Var.a(0.0f);
                            f8Var.f34509b = 1.0f;
                        }
                    }
                    g8Var.f34597u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && g8Var.f34598w == null) {
                        g8Var.f34598w = bitmap;
                    }
                    if (g8Var.D) {
                        g8Var.c();
                    }
                    h8Var.f0();
                    return;
                }
                return;
            default:
                t8 t8Var = (t8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
                String L0 = cd.L0(2131743157, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131743160, null);
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.k(cd.L0(2131743162, null), new o8(t8Var, (k0) obj2, (f0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public g(j20 j20Var, Serializable serializable, Serializable serializable2, int i10) {
        this.f34530a = i10;
        this.d = j20Var;
        this.f34531b = serializable;
        this.f34532c = serializable2;
    }

    public g(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, j20 j20Var) {
        this.f34530a = 0;
        this.f34531b = importedWalletProof;
        this.f34532c = exc;
        this.d = j20Var;
    }
}
