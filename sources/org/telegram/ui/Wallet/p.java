package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bn;
import org.telegram.ui.ne;
import org.telegram.ui.t60;
public final class p implements Runnable {
    public final int f44848a;
    public final Object f44849b;
    public final Object f44850c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i7) {
        this.f44848a = i7;
        this.f44849b = obj;
        this.f44850c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        boolean z10;
        int i7 = this.f44848a;
        byte[] bArr = null;
        boolean z11 = true;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f44849b;
        Object obj3 = this.f44850c;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj2;
                k0 k0Var = (k0) obj;
                if (v0Var.Q.get((String) obj3) == k0Var) {
                    k0Var.f44548e = true;
                    ArrayList arrayList = k0Var.f44549f;
                    v0Var.v0(k0Var);
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        ((w10) obj4).a(k0Var);
                    }
                    arrayList.clear();
                    v0Var.T();
                    return;
                }
                return;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj2;
                Exception exc = (Exception) obj3;
                p10 p10Var = (p10) obj;
                if (importedWalletProof == null) {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb2.append(str);
                    v0.o(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    p10Var.a(null, str2);
                    return;
                }
                v0.P("proof done");
                p10Var.a(importedWalletProof, null);
                return;
            case 2:
                ((h2) obj2).f44423f = false;
                ((k) obj).a((String) obj3);
                return;
            case 3:
                ((f0) obj2).a((TL_wallet.inputTonConnectOauthSession) obj, (String) obj3);
                return;
            case 4:
                i2 i2Var = (i2) obj3;
                hi.e eVar = (hi.e) obj;
                if (!((bi.m6) obj2).canScrollVertically(1)) {
                    i2Var.f44474p = true;
                }
                if (!i2Var.f44474p || i2Var.f44471m || i2Var.f44472n) {
                    z11 = false;
                }
                eVar.setEnabled(z11);
                return;
            case 5:
                m2 m2Var = (m2) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                m2Var.getClass();
                k kVar = new k((w10) obj, 1);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (!m2Var.f44650c.add(Long.valueOf(tonconnectsession.f28754id))) {
                        kVar.a("A TON Connect operation is already in progress");
                        return;
                    }
                    o oVar = new o(m2Var, tonconnectsession, kVar, 4);
                    if (tonconnectsession.closed) {
                        oVar.a(null);
                        return;
                    } else {
                        m2Var.f44649b.x0(new p(m2Var, oVar, tonconnectsession, 6));
                        return;
                    }
                }
                kVar.a("Missing TON Connect session data");
                return;
            case 6:
                m2 m2Var2 = (m2) obj2;
                o oVar2 = (o) obj3;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                v0 v0Var2 = m2Var2.f44649b;
                String y10 = v0Var2.y();
                byte[] E = v0Var2.E();
                if (E != null) {
                    bArr = (byte[]) E.clone();
                }
                byte[] bArr2 = bArr;
                if (y10 != null && bArr2 != null) {
                    v0Var2.F(true, false, false, new ne(m2Var2, oVar2, tonconnectsession2, y10, bArr2, 5));
                    return;
                } else {
                    oVar2.a("Wallet is not ready");
                    return;
                }
            case 7:
                m2 m2Var3 = (m2) obj2;
                h2 h2Var = (h2) obj3;
                m2Var3.getClass();
                k kVar2 = new k((t60) obj, 2);
                TL_wallet.tonConnectSession tonconnectsession3 = h2Var.f44422e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (h2Var.f44423f) {
                        kVar2.a("A TON Connect operation is already in progress");
                        return;
                    }
                    h2Var.f44423f = true;
                    m2Var3.f44649b.x0(new w7(m2Var3, h2Var, kVar2, tonconnectsession3, 7));
                    return;
                }
                kVar2.a("The dApp manifest is unavailable or the session is closed");
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj3;
                x2 x2Var = (x2) obj;
                a3.f44044a.remove((bi.i5) obj2);
                if (!zArr[0]) {
                    zArr[0] = true;
                    kc.c0(gd.N0(2131742688, null));
                    x2Var.a();
                    return;
                }
                return;
            case 9:
                z2 z2Var = (z2) obj2;
                hi.e eVar2 = (hi.e) obj3;
                hi.e eVar3 = (hi.e) obj;
                boolean a10 = z2Var.a();
                if (!a10 && !z2Var.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar2.setEnabled(z10);
                if (a10 || z2Var.d) {
                    z11 = false;
                }
                eVar3.setEnabled(z11);
                return;
            case 10:
                x3 x3Var = (x3) obj2;
                x3Var.V = new s3((org.telegram.ui.ActionBar.g2) obj3, (TL_wallet.card) obj, 0);
                x3Var.dismiss();
                return;
            case 11:
                ((w7) obj2).run();
                ((x60) obj3).L((x60) obj);
                return;
            case 12:
                f3[] f3VarArr = (f3[]) obj3;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) obj;
                if (((r10) obj2) == null) {
                    f3 f3Var = f3VarArr[0];
                    if (f3Var != null) {
                        f3Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(bn.ua(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                f3[] f3VarArr2 = (f3[]) obj2;
                f3VarArr2[0].setOnDismissListener(new di.u1(13, (TLRPC.User) obj3, (TL_wallet.walletTransactionPeerUser) obj));
                f3VarArr2[0].dismiss();
                return;
            case 14:
                f3[] f3VarArr3 = (f3[]) obj3;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) obj;
                if (((r10) obj2) == null) {
                    f3 f3Var2 = f3VarArr3[0];
                    if (f3Var2 != null) {
                        f3Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        T2.presentFragment(bn.ua(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((p10) obj2).a(((String[]) obj3)[0], Boolean.valueOf(((boolean[]) obj)[0]));
                return;
            case 16:
                t6 t6Var = (t6) obj2;
                q6 q6Var = (q6) obj3;
                t6Var.f45168b = q6Var;
                q6Var.j(t6Var.f45170c);
                t6Var.f45178h0 = Float.NaN;
                t6Var.b(t6Var.f45172d0, t6Var.f45177g0);
                t6Var.f45173e.setVisibility(0);
                ((r6) obj).run();
                r3 r3Var = t6Var.d;
                if (r3Var != null) {
                    t6Var.d = null;
                    r3Var.run();
                    return;
                }
                return;
            case 17:
                ((WalletEngine2) obj2).lambda$previewSignMessage$11((l2) obj3, (w10) obj);
                return;
            case 18:
                ((p10) obj2).a((Long) obj, (String) obj3);
                return;
            case 19:
                ((p10) obj2).a((String) obj3, (String) obj);
                return;
            case 20:
                ((WalletEngine2) obj2).lambda$previewTonConnect$2((l2) obj3, (p10) obj);
                return;
            case 21:
                r8 r8Var = (r8) obj2;
                int[] iArr = (int[]) obj3;
                Bitmap bitmap = (Bitmap) obj;
                r8Var.C = false;
                s8 s8Var = r8Var.f45004d0;
                boolean z12 = s8Var.f45060b1;
                y6 y6Var = s8Var.f45061c;
                if (!z12) {
                    if (r8Var.f45020u == null) {
                        r8Var.f45020u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (y6Var.isShown() && y6Var.getAlpha() > 0.0f) {
                            q8 q8Var = r8Var.f45017r;
                            q8Var.a(0.0f);
                            q8Var.f44968b = 1.0f;
                        }
                    }
                    r8Var.f45020u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && r8Var.f45021w == null) {
                        r8Var.f45021w = bitmap;
                    }
                    if (r8Var.D) {
                        r8Var.c();
                    }
                    s8Var.f0();
                    return;
                }
                return;
            default:
                e9 e9Var = (e9) obj3;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e9Var.getParentActivity(), e9Var.getResourceProvider());
                String N0 = gd.N0(2131742880, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131742883, null);
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.k(gd.N0(2131742885, null), new y8(e9Var, (v0) obj2, (p0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public p(Object obj, Object obj2, String str, int i7) {
        this.f44848a = i7;
        this.f44849b = obj;
        this.d = obj2;
        this.f44850c = str;
    }

    public p(v0 v0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, p10 p10Var) {
        this.f44848a = 1;
        this.f44849b = importedWalletProof;
        this.f44850c = exc;
        this.d = p10Var;
    }

    public p(e9 e9Var, v0 v0Var, p0 p0Var) {
        this.f44848a = 22;
        this.f44850c = e9Var;
        this.f44849b = v0Var;
        this.d = p0Var;
    }
}
