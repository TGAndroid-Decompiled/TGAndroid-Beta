package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.i80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.gn0;
import org.telegram.ui.gx;
import org.telegram.ui.n80;
import org.telegram.ui.sn;
public final class h implements Runnable {
    public final int f34251a;
    public final Object f34252b;
    public final Object f34253c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f34251a = i10;
        this.f34252b = obj;
        this.f34253c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f34251a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f34252b;
                Exception exc = (Exception) this.f34253c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                if (importedWalletProof == null) {
                    StringBuilder sb2 = new StringBuilder("failed to prove: ");
                    String str2 = "PROOF_ERROR";
                    if (exc == null || exc.getMessage() == null) {
                        str = "PROOF_ERROR";
                    } else {
                        str = exc.getMessage();
                    }
                    sb2.append(str);
                    m0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    return;
                }
                m0.F("proof done");
                callback2.run(importedWalletProof, null);
                return;
            case 1:
                m0 m0Var = (m0) this.f34252b;
                d0 d0Var = (d0) this.d;
                if (m0Var.N.get((String) this.f34253c) == d0Var) {
                    d0Var.e = true;
                    ArrayList arrayList = d0Var.f34075f;
                    m0Var.h0(d0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(d0Var);
                    }
                    arrayList.clear();
                    m0Var.J();
                    return;
                }
                return;
            case 2:
                b2 b2Var = (b2) this.f34253c;
                ei.d dVar = (ei.d) this.d;
                boolean z10 = true;
                if (!((gx) this.f34252b).canScrollVertically(1)) {
                    b2Var.f34009p = true;
                }
                dVar.setEnabled((!b2Var.f34009p || b2Var.f34006m || b2Var.f34007n) ? false : false);
                return;
            case 3:
                f2 f2Var = (f2) this.f34252b;
                a2 a2Var = (a2) this.f34253c;
                f2Var.getClass();
                l lVar = new l((n80) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = a2Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (a2Var.f33972f) {
                        lVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    a2Var.f33972f = true;
                    f2Var.f34169b.j0(new w6(f2Var, a2Var, lVar, tonconnectsession, 6));
                    return;
                }
                lVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                f2 f2Var2 = (f2) this.f34252b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f34253c;
                f2Var2.getClass();
                l lVar2 = new l((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!f2Var2.f34170c.add(Long.valueOf(tonconnectsession2.f20530id))) {
                        lVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(f2Var2, tonconnectsession2, lVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        f2Var2.f34169b.j0(new h(f2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                lVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((s1) this.f34252b).run((TL_wallet.inputTonConnectOauthSession) this.f34253c, (String) this.d);
                return;
            case 6:
                f2 f2Var3 = (f2) this.f34252b;
                p pVar2 = (p) this.f34253c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                m0 m0Var2 = f2Var3.f34169b;
                String s10 = m0Var2.s();
                byte[] x10 = m0Var2.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                if (s10 != null && bArr2 != null) {
                    m0Var2.y(new ai.v3(f2Var3, pVar2, tonconnectsession3, s10, bArr2, 7), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((a2) this.f34252b).f33972f = false;
                ((l) this.f34253c).run((String) this.d);
                return;
            case 8:
                ((boolean[]) this.f34253c)[0] = false;
                ((n5) this.f34252b).M0.remove((w6) this.d);
                return;
            case 9:
                ((w6) this.f34252b).run();
                ((i80) this.f34253c).K((i80) this.d);
                return;
            case 10:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f34252b;
                k2[] k2VarArr = (k2[]) this.f34253c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    k2 k2Var = k2VarArr[0];
                    if (k2Var != null) {
                        k2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(sn.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                k2[] k2VarArr2 = (k2[]) this.f34252b;
                k2VarArr2[0].setOnDismissListener(new ai.x3(15, (TLRPC.User) this.f34253c, (TL_wallet.walletTransactionPeerUser) this.d));
                k2VarArr2[0].dismiss();
                return;
            case 12:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.f34252b;
                k2[] k2VarArr3 = (k2[]) this.f34253c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    k2 k2Var2 = k2VarArr3[0];
                    if (k2Var2 != null) {
                        k2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(sn.W9(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((Utilities.Callback2) this.d).run(((String[]) this.f34252b)[0], Boolean.valueOf(((boolean[]) this.f34253c)[0]));
                return;
            case 14:
                s5 s5Var = (s5) this.f34252b;
                o5 o5Var = (o5) this.f34253c;
                s5Var.f34818b = o5Var;
                o5Var.j(s5Var.f34820c);
                s5Var.f34822d0 = Float.NaN;
                s5Var.b(s5Var.W, s5Var.f34821c0);
                s5Var.e.setVisibility(0);
                ((p5) this.d).run();
                u2 u2Var = s5Var.d;
                if (u2Var != null) {
                    s5Var.d = null;
                    u2Var.run();
                    return;
                }
                return;
            case 15:
                ((Utilities.Callback2) this.d).run((String) this.f34252b, (String) this.f34253c);
                return;
            case 16:
                ((WalletEngine2) this.f34252b).lambda$previewSignMessage$8((e2) this.f34253c, (Utilities.Callback) this.d);
                return;
            case 17:
                ((Utilities.Callback2) this.d).run((Long) this.f34252b, (String) this.f34253c);
                return;
            case 18:
                ((WalletEngine2) this.f34252b).lambda$previewTonConnect$2((e2) this.f34253c, (Utilities.Callback2) this.d);
                return;
            case 19:
                s7 s7Var = (s7) this.f34252b;
                int[] iArr = (int[]) this.f34253c;
                Bitmap bitmap = (Bitmap) this.d;
                s7Var.C = false;
                t7 t7Var = s7Var.f34844d0;
                boolean z11 = t7Var.f34894a1;
                x5 x5Var = t7Var.f34898c;
                if (!z11) {
                    if (s7Var.f34859u == null) {
                        s7Var.f34859u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (x5Var.isShown() && x5Var.getAlpha() > 0.0f) {
                            r7 r7Var = s7Var.f34856r;
                            r7Var.a(0.0f);
                            r7Var.f34786b = 1.0f;
                        }
                    }
                    s7Var.f34859u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && s7Var.f34860w == null) {
                        s7Var.f34860w = bitmap;
                    }
                    if (s7Var.D) {
                        s7Var.c();
                    }
                    t7Var.f0();
                    return;
                }
                return;
            case 20:
                h8 h8Var = (h8) this.f34252b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(h8Var, (m0) this.f34253c, (h0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                h8 h8Var2 = (h8) this.f34252b;
                Boolean bool = (Boolean) this.f34253c;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                alertDialog$Builder2.f20601a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(h8Var2, bool, (m0) this.d, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new gn0(26, h8Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.f34251a = i10;
        this.d = callback2;
        this.f34252b = serializable;
        this.f34253c = serializable2;
    }

    public h(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f34251a = 0;
        this.f34252b = importedWalletProof;
        this.f34253c = exc;
        this.d = callback2;
    }
}
