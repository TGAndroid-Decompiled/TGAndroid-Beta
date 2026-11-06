package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
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
    public final int f42487a;
    public final Object f42488b;
    public final Object f42489c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i7) {
        this.f42487a = i7;
        this.f42488b = obj;
        this.f42489c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        boolean z9;
        int i7 = this.f42487a;
        boolean z10 = true;
        byte[] bArr = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f42489c;
        Object obj3 = this.f42488b;
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
                    n0.k(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    v10Var.a(null, str2);
                    return;
                }
                n0.H("proof done");
                v10Var.a(importedWalletProof, null);
                return;
            case 1:
                n0 n0Var = (n0) obj3;
                e0 e0Var = (e0) obj;
                if (n0Var.N.get((String) obj2) == e0Var) {
                    e0Var.f42382e = true;
                    ArrayList arrayList = e0Var.f42383f;
                    n0Var.k0(e0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((c20) obj4).a(e0Var);
                    }
                    arrayList.clear();
                    n0Var.L();
                    return;
                }
                return;
            case 2:
                ((a2) obj3).f42075f = false;
                ((k) obj2).a((String) obj);
                return;
            case 3:
                b2 b2Var = (b2) obj2;
                fi.d dVar = (fi.d) obj;
                if (!((h60) obj3).canScrollVertically(1)) {
                    b2Var.f42110p = true;
                }
                if (!b2Var.f42110p || b2Var.f42107m || b2Var.f42108n) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                return;
            case 4:
                f2 f2Var = (f2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                f2Var.getClass();
                k kVar = new k((c20) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!f2Var.f42437c.add(Long.valueOf(tonconnectsession.f27214id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    m mVar = new m(f2Var, tonconnectsession, kVar, 3);
                    if (tonconnectsession.closed) {
                        mVar.a(null);
                        return;
                    } else {
                        f2Var.f42436b.m0(new g(f2Var, mVar, tonconnectsession, 7));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 5:
                ((bi.p5) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 6:
                f2 f2Var2 = (f2) obj3;
                a2 a2Var = (a2) obj2;
                f2Var2.getClass();
                k kVar2 = new k((t60) obj, 3);
                TL_wallet.tonConnectSession tonconnectsession2 = a2Var.f42074e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (a2Var.f42075f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    a2Var.f42075f = true;
                    f2Var2.f42436b.m0(new g7(f2Var2, a2Var, kVar2, tonconnectsession2, 8));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 7:
                f2 f2Var3 = (f2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                n0 n0Var2 = f2Var3.f42436b;
                String t6 = n0Var2.t();
                byte[] y10 = n0Var2.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr2 = bArr;
                if (t6 != null && bArr2 != null) {
                    n0Var2.z(new bi.t3(f2Var3, mVar2, tonconnectsession3, t6, bArr2, 7), true, false);
                    return;
                } else {
                    mVar2.a("Wallet is not ready");
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                s2 s2Var = (s2) obj;
                v2.f43206a.remove((jg.c1) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    hc.b0(hd.M0(2131742960, null));
                    s2Var.a();
                    return;
                }
                return;
            case 9:
                u2 u2Var = (u2) obj3;
                fi.d dVar2 = (fi.d) obj2;
                fi.d dVar3 = (fi.d) obj;
                boolean a10 = u2Var.a();
                if (!a10 && !u2Var.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar2.setEnabled(z9);
                if (a10 || u2Var.d) {
                    z10 = false;
                }
                dVar3.setEnabled(z10);
                return;
            case 10:
                ((g7) obj3).run();
                ((k60) obj2).K((k60) obj);
                return;
            case 11:
                a3[] a3VarArr = (a3[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((x10) obj3) == null) {
                    a3 a3Var = a3VarArr[0];
                    if (a3Var != null) {
                        a3Var.dismiss();
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
                a3[] a3VarArr2 = (a3[]) obj3;
                a3VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                a3VarArr2[0].dismiss();
                return;
            case 13:
                a3[] a3VarArr3 = (a3[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((x10) obj3) == null) {
                    a3 a3Var2 = a3VarArr3[0];
                    if (a3Var2 != null) {
                        a3Var2.dismiss();
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
                c6 c6Var = (c6) obj3;
                z5 z5Var = (z5) obj2;
                c6Var.f42203b = z5Var;
                z5Var.j(c6Var.f42205c);
                c6Var.f42212g0 = Float.NaN;
                c6Var.b(c6Var.f42206c0, c6Var.f42211f0);
                c6Var.f42208e.setVisibility(0);
                ((a6) obj).run();
                l3 l3Var = c6Var.d;
                if (l3Var != null) {
                    c6Var.d = null;
                    l3Var.run();
                    return;
                }
                return;
            case 16:
                ((v10) obj).a((String) obj3, (String) obj2);
                return;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((e2) obj2, (c20) obj);
                return;
            case 18:
                ((v10) obj).a((Long) obj3, (String) obj2);
                return;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((e2) obj2, (v10) obj);
                return;
            case 20:
                b8 b8Var = (b8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                b8Var.C = false;
                c8 c8Var = b8Var.f42133d0;
                boolean z11 = c8Var.f42228a1;
                h6 h6Var = c8Var.f42232c;
                if (!z11) {
                    if (b8Var.f42149u == null) {
                        b8Var.f42149u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (h6Var.isShown() && h6Var.getAlpha() > 0.0f) {
                            a8 a8Var = b8Var.f42146r;
                            a8Var.a(0.0f);
                            a8Var.f42081b = 1.0f;
                        }
                    }
                    b8Var.f42149u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && b8Var.f42150w == null) {
                        b8Var.f42150w = bitmap;
                    }
                    if (b8Var.D) {
                        b8Var.c();
                    }
                    c8Var.f0();
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o8Var.getParentActivity(), o8Var.getResourceProvider());
                String M0 = hd.M0(2131743132, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131743135, null);
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.k(hd.M0(2131743137, null), new j8(o8Var, (n0) obj2, (i0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public g(v10 v10Var, Serializable serializable, Serializable serializable2, int i7) {
        this.f42487a = i7;
        this.d = v10Var;
        this.f42488b = serializable;
        this.f42489c = serializable2;
    }

    public g(n0 n0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, v10 v10Var) {
        this.f42487a = 0;
        this.f42488b = importedWalletProof;
        this.f42489c = exc;
        this.d = v10Var;
    }
}
