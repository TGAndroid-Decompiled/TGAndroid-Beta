package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.n60;
import org.telegram.ui.wm;
public final class g implements Runnable {
    public final int f42553a;
    public final Object f42554b;
    public final Object f42555c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i3) {
        this.f42553a = i3;
        this.f42554b = obj;
        this.f42555c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        int i3 = this.f42553a;
        boolean z11 = true;
        byte[] bArr = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f42555c;
        Object obj3 = this.f42554b;
        switch (i3) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj3;
                Exception exc = (Exception) obj2;
                n10 n10Var = (n10) obj;
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
                    n10Var.a(null, str2);
                    return;
                }
                k0.H("proof done");
                n10Var.a(importedWalletProof, null);
                return;
            case 1:
                k0 k0Var = (k0) obj3;
                b0 b0Var = (b0) obj;
                if (k0Var.N.get((String) obj2) == b0Var) {
                    b0Var.f42214e = true;
                    ArrayList arrayList = b0Var.f42215f;
                    k0Var.k0(b0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((u10) obj4).a(b0Var);
                    }
                    arrayList.clear();
                    k0Var.L();
                    return;
                }
                return;
            case 2:
                ((x1) obj3).f43388f = false;
                ((k) obj2).a((String) obj);
                return;
            case 3:
                y1 y1Var = (y1) obj2;
                gi.d dVar = (gi.d) obj;
                if (!((ai.l4) obj3).canScrollVertically(1)) {
                    y1Var.f43469p = true;
                }
                if (!y1Var.f43469p || y1Var.f43466m || y1Var.f43467n) {
                    z11 = false;
                }
                dVar.setEnabled(z11);
                return;
            case 4:
                c2 c2Var = (c2) obj3;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj2;
                c2Var.getClass();
                k kVar = new k((u10) obj, 2);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!c2Var.f42379c.add(Long.valueOf(tonconnectsession.f27264id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    m mVar = new m(c2Var, tonconnectsession, kVar, 3);
                    if (tonconnectsession.closed) {
                        mVar.a(null);
                        return;
                    } else {
                        c2Var.f42378b.m0(new g(c2Var, mVar, tonconnectsession, 7));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 5:
                ((s1) obj3).a((TL_wallet.inputTonConnectOauthSession) obj2, (String) obj);
                return;
            case 6:
                c2 c2Var2 = (c2) obj3;
                x1 x1Var = (x1) obj2;
                c2Var2.getClass();
                k kVar2 = new k((n60) obj, 3);
                TL_wallet.tonConnectSession tonconnectsession2 = x1Var.f43387e;
                if (!tonconnectsession2.closed && !tonconnectsession2.closing && tonconnectsession2.manifest_error == null && tonconnectsession2.manifest != null) {
                    if (x1Var.f43388f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    x1Var.f43388f = true;
                    c2Var2.f42378b.m0(new e7(c2Var2, x1Var, kVar2, tonconnectsession2, 8));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 7:
                c2 c2Var3 = (c2) obj3;
                m mVar2 = (m) obj2;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj;
                k0 k0Var2 = c2Var3.f42378b;
                String t10 = k0Var2.t();
                byte[] y9 = k0Var2.y();
                if (y9 != null) {
                    bArr = (byte[]) y9.clone();
                }
                byte[] bArr2 = bArr;
                if (t10 != null && bArr2 != null) {
                    k0Var2.z(new ci.g3(c2Var3, mVar2, tonconnectsession3, t10, bArr2, 7), true, false);
                    return;
                } else {
                    mVar2.a("Wallet is not ready");
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) obj2;
                q2 q2Var = (q2) obj;
                t2.f43197a.remove((ai.d3) obj3);
                if (!zArr[0]) {
                    zArr[0] = true;
                    fc.b0(bd.M0(2131742969, null));
                    q2Var.a();
                    return;
                }
                return;
            case 9:
                s2 s2Var = (s2) obj3;
                gi.d dVar2 = (gi.d) obj2;
                gi.d dVar3 = (gi.d) obj;
                boolean a10 = s2Var.a();
                if (!a10 && !s2Var.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar2.setEnabled(z10);
                if (a10 || s2Var.d) {
                    z11 = false;
                }
                dVar3.setEnabled(z11);
                return;
            case 10:
                ((e7) obj3).run();
                ((f60) obj2).K((f60) obj);
                return;
            case 11:
                y2[] y2VarArr = (y2[]) obj2;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((p10) obj3) == null) {
                    y2 y2Var = y2VarArr[0];
                    if (y2Var != null) {
                        y2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(wm.ra(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                y2[] y2VarArr2 = (y2[]) obj3;
                y2VarArr2[0].setOnDismissListener(new ci.h3(15, (TLRPC.User) obj2, (TL_wallet.walletTransactionPeerUser) obj));
                y2VarArr2[0].dismiss();
                return;
            case 13:
                y2[] y2VarArr3 = (y2[]) obj2;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((p10) obj3) == null) {
                    y2 y2Var2 = y2VarArr3[0];
                    if (y2Var2 != null) {
                        y2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(wm.ra(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((n10) obj).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj2)[0]));
                return;
            case 15:
                a6 a6Var = (a6) obj3;
                x5 x5Var = (x5) obj2;
                a6Var.f42138b = x5Var;
                x5Var.j(a6Var.f42140c);
                a6Var.f42148h0 = Float.NaN;
                a6Var.b(a6Var.f42142d0, a6Var.f42147g0);
                a6Var.f42143e.setVisibility(0);
                ((y5) obj).run();
                j3 j3Var = a6Var.d;
                if (j3Var != null) {
                    a6Var.d = null;
                    j3Var.run();
                    return;
                }
                return;
            case 16:
                ((n10) obj).a((String) obj3, (String) obj2);
                return;
            case 17:
                ((WalletEngine2) obj3).lambda$previewSignMessage$8((b2) obj2, (u10) obj);
                return;
            case 18:
                ((n10) obj).a((Long) obj3, (String) obj2);
                return;
            case 19:
                ((WalletEngine2) obj3).lambda$previewTonConnect$2((b2) obj2, (n10) obj);
                return;
            case 20:
                a8 a8Var = (a8) obj3;
                int[] iArr = (int[]) obj2;
                Bitmap bitmap = (Bitmap) obj;
                a8Var.C = false;
                b8 b8Var = a8Var.f42168d0;
                boolean z12 = b8Var.f42293b1;
                f6 f6Var = b8Var.f42294c;
                if (!z12) {
                    if (a8Var.f42184u == null) {
                        a8Var.f42184u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (f6Var.isShown() && f6Var.getAlpha() > 0.0f) {
                            z7 z7Var = a8Var.f42181r;
                            z7Var.a(0.0f);
                            z7Var.f43512b = 1.0f;
                        }
                    }
                    a8Var.f42184u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && a8Var.f42185w == null) {
                        a8Var.f42185w = bitmap;
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
                String M0 = bd.M0(2131743141, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131743144, null);
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.k(bd.M0(2131743146, null), new i8(n8Var, (k0) obj2, (f0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public g(n10 n10Var, Serializable serializable, Serializable serializable2, int i3) {
        this.f42553a = i3;
        this.d = n10Var;
        this.f42554b = serializable;
        this.f42555c = serializable2;
    }

    public g(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, n10 n10Var) {
        this.f42553a = 0;
        this.f42554b = importedWalletProof;
        this.f42555c = exc;
        this.d = n10Var;
    }
}
