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
import org.telegram.ui.en0;
import org.telegram.ui.ex;
import org.telegram.ui.l80;
import org.telegram.ui.qn;
public final class h implements Runnable {
    public final int f34260a;
    public final Object f34261b;
    public final Object f34262c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f34260a = i10;
        this.f34261b = obj;
        this.f34262c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f34260a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f34261b;
                Exception exc = (Exception) this.f34262c;
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
                m0 m0Var = (m0) this.f34261b;
                d0 d0Var = (d0) this.d;
                if (m0Var.N.get((String) this.f34262c) == d0Var) {
                    d0Var.e = true;
                    ArrayList arrayList = d0Var.f34083f;
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
                b2 b2Var = (b2) this.f34262c;
                ei.d dVar = (ei.d) this.d;
                boolean z10 = true;
                if (!((ex) this.f34261b).canScrollVertically(1)) {
                    b2Var.f34019p = true;
                }
                dVar.setEnabled((!b2Var.f34019p || b2Var.f34016m || b2Var.f34017n) ? false : false);
                return;
            case 3:
                f2 f2Var = (f2) this.f34261b;
                a2 a2Var = (a2) this.f34262c;
                f2Var.getClass();
                l lVar = new l((l80) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = a2Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (a2Var.f33978f) {
                        lVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    a2Var.f33978f = true;
                    f2Var.f34187b.j0(new w6(f2Var, a2Var, lVar, tonconnectsession, 6));
                    return;
                }
                lVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                f2 f2Var2 = (f2) this.f34261b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f34262c;
                f2Var2.getClass();
                l lVar2 = new l((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!f2Var2.f34188c.add(Long.valueOf(tonconnectsession2.f20533id))) {
                        lVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(f2Var2, tonconnectsession2, lVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        f2Var2.f34187b.j0(new h(f2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                lVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((s1) this.f34261b).run((TL_wallet.inputTonConnectOauthSession) this.f34262c, (String) this.d);
                return;
            case 6:
                f2 f2Var3 = (f2) this.f34261b;
                p pVar2 = (p) this.f34262c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                m0 m0Var2 = f2Var3.f34187b;
                String s10 = m0Var2.s();
                byte[] x10 = m0Var2.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                if (s10 != null && bArr2 != null) {
                    m0Var2.y(new ai.x3(f2Var3, pVar2, tonconnectsession3, s10, bArr2, 7), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((a2) this.f34261b).f33978f = false;
                ((l) this.f34262c).run((String) this.d);
                return;
            case 8:
                ((w6) this.f34261b).run();
                ((i80) this.f34262c).K((i80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f34261b;
                k2[] k2VarArr = (k2[]) this.f34262c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    k2 k2Var = k2VarArr[0];
                    if (k2Var != null) {
                        k2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(qn.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                k2[] k2VarArr2 = (k2[]) this.f34261b;
                k2VarArr2[0].setOnDismissListener(new ai.y3(15, (TLRPC.User) this.f34262c, (TL_wallet.walletTransactionPeerUser) this.d));
                k2VarArr2[0].dismiss();
                return;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.f34261b;
                k2[] k2VarArr3 = (k2[]) this.f34262c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    k2 k2Var2 = k2VarArr3[0];
                    if (k2Var2 != null) {
                        k2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(qn.W9(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((Utilities.Callback2) this.d).run(((String[]) this.f34261b)[0], Boolean.valueOf(((boolean[]) this.f34262c)[0]));
                return;
            case 13:
                s5 s5Var = (s5) this.f34261b;
                p5 p5Var = (p5) this.f34262c;
                s5Var.f34834b = p5Var;
                p5Var.j(s5Var.f34836c);
                s5Var.f34842g0 = Float.NaN;
                s5Var.b(s5Var.f34837c0, s5Var.f34841f0);
                s5Var.e.setVisibility(0);
                ((q5) this.d).run();
                v2 v2Var = s5Var.d;
                if (v2Var != null) {
                    s5Var.d = null;
                    v2Var.run();
                    return;
                }
                return;
            case 14:
                ((Utilities.Callback2) this.d).run((String) this.f34261b, (String) this.f34262c);
                return;
            case 15:
                ((WalletEngine2) this.f34261b).lambda$previewSignMessage$8((e2) this.f34262c, (Utilities.Callback) this.d);
                return;
            case 16:
                ((Utilities.Callback2) this.d).run((Long) this.f34261b, (String) this.f34262c);
                return;
            case 17:
                ((WalletEngine2) this.f34261b).lambda$previewTonConnect$2((e2) this.f34262c, (Utilities.Callback2) this.d);
                return;
            case 18:
                s7 s7Var = (s7) this.f34261b;
                int[] iArr = (int[]) this.f34262c;
                Bitmap bitmap = (Bitmap) this.d;
                s7Var.C = false;
                t7 t7Var = s7Var.f34862d0;
                boolean z11 = t7Var.f34908a1;
                x5 x5Var = t7Var.f34912c;
                if (!z11) {
                    if (s7Var.f34877u == null) {
                        s7Var.f34877u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (x5Var.isShown() && x5Var.getAlpha() > 0.0f) {
                            r7 r7Var = s7Var.f34874r;
                            r7Var.a(0.0f);
                            r7Var.f34802b = 1.0f;
                        }
                    }
                    s7Var.f34877u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && s7Var.f34878w == null) {
                        s7Var.f34878w = bitmap;
                    }
                    if (s7Var.D) {
                        s7Var.c();
                    }
                    t7Var.f0();
                    return;
                }
                return;
            case 19:
                h8 h8Var = (h8) this.f34261b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(h8Var, (m0) this.f34262c, (h0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                h8 h8Var2 = (h8) this.f34261b;
                Boolean bool = (Boolean) this.f34262c;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(h8Var2, bool, (m0) this.d, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new en0(26, h8Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.f34260a = i10;
        this.d = callback2;
        this.f34261b = serializable;
        this.f34262c = serializable2;
    }

    public h(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f34260a = 0;
        this.f34261b = importedWalletProof;
        this.f34262c = exc;
        this.d = callback2;
    }
}
