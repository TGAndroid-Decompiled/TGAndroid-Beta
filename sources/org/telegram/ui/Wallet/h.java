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
    public final int f34284a;
    public final Object f34285b;
    public final Object f34286c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f34284a = i10;
        this.f34285b = obj;
        this.f34286c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f34284a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f34285b;
                Exception exc = (Exception) this.f34286c;
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
                m0 m0Var = (m0) this.f34285b;
                d0 d0Var = (d0) this.d;
                if (m0Var.N.get((String) this.f34286c) == d0Var) {
                    d0Var.e = true;
                    ArrayList arrayList = d0Var.f34117f;
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
                b2 b2Var = (b2) this.f34286c;
                ei.d dVar = (ei.d) this.d;
                boolean z10 = true;
                if (!((gx) this.f34285b).canScrollVertically(1)) {
                    b2Var.f34028p = true;
                }
                dVar.setEnabled((!b2Var.f34028p || b2Var.f34025m || b2Var.f34026n) ? false : false);
                return;
            case 3:
                f2 f2Var = (f2) this.f34285b;
                a2 a2Var = (a2) this.f34286c;
                f2Var.getClass();
                l lVar = new l((n80) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = a2Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (a2Var.f33979f) {
                        lVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    a2Var.f33979f = true;
                    f2Var.f34224b.j0(new c7(f2Var, a2Var, lVar, tonconnectsession, 6));
                    return;
                }
                lVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                f2 f2Var2 = (f2) this.f34285b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f34286c;
                f2Var2.getClass();
                l lVar2 = new l((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!f2Var2.f34225c.add(Long.valueOf(tonconnectsession2.f20537id))) {
                        lVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(f2Var2, tonconnectsession2, lVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        f2Var2.f34224b.j0(new h(f2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                lVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((s1) this.f34285b).run((TL_wallet.inputTonConnectOauthSession) this.f34286c, (String) this.d);
                return;
            case 6:
                f2 f2Var3 = (f2) this.f34285b;
                p pVar2 = (p) this.f34286c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                m0 m0Var2 = f2Var3.f34224b;
                String s10 = m0Var2.s();
                byte[] x10 = m0Var2.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                if (s10 != null && bArr2 != null) {
                    m0Var2.y(new ai.t3(f2Var3, pVar2, tonconnectsession3, s10, bArr2, 7), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((a2) this.f34285b).f33979f = false;
                ((l) this.f34286c).run((String) this.d);
                return;
            case 8:
                ((c7) this.f34285b).run();
                ((i80) this.f34286c).K((i80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f34285b;
                k2[] k2VarArr = (k2[]) this.f34286c;
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
            case 10:
                k2[] k2VarArr2 = (k2[]) this.f34285b;
                k2VarArr2[0].setOnDismissListener(new ai.v3(15, (TLRPC.User) this.f34286c, (TL_wallet.walletTransactionPeerUser) this.d));
                k2VarArr2[0].dismiss();
                return;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.f34285b;
                k2[] k2VarArr3 = (k2[]) this.f34286c;
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
            case 12:
                ((Utilities.Callback2) this.d).run(((String[]) this.f34285b)[0], Boolean.valueOf(((boolean[]) this.f34286c)[0]));
                return;
            case 13:
                ((Utilities.Callback2) this.d).run((String) this.f34285b, (String) this.f34286c);
                return;
            case 14:
                ((WalletEngine2) this.f34285b).lambda$previewSignMessage$8((e2) this.f34286c, (Utilities.Callback) this.d);
                return;
            case 15:
                ((Utilities.Callback2) this.d).run((Long) this.f34285b, (String) this.f34286c);
                return;
            case 16:
                ((WalletEngine2) this.f34285b).lambda$previewTonConnect$2((e2) this.f34286c, (Utilities.Callback2) this.d);
                return;
            case 17:
                y7 y7Var = (y7) this.f34285b;
                int[] iArr = (int[]) this.f34286c;
                Bitmap bitmap = (Bitmap) this.d;
                y7Var.C = false;
                z7 z7Var = y7Var.f35139d0;
                boolean z11 = z7Var.V0;
                x5 x5Var = z7Var.f35184c;
                if (!z11) {
                    if (y7Var.f35154u == null) {
                        y7Var.f35154u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (x5Var.isShown() && x5Var.getAlpha() > 0.0f) {
                            x7 x7Var = y7Var.f35151r;
                            x7Var.a(0.0f);
                            x7Var.f35097b = 1.0f;
                        }
                    }
                    y7Var.f35154u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && y7Var.f35155w == null) {
                        y7Var.f35155w = bitmap;
                    }
                    if (y7Var.D) {
                        y7Var.c();
                    }
                    z7Var.h0();
                    return;
                }
                return;
            case 18:
                n8 n8Var = (n8) this.f34285b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n8Var.getParentActivity(), 0, n8Var.getResourceProvider());
                alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new h8(n8Var, (m0) this.f34286c, (h0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                n8 n8Var2 = (n8) this.f34285b;
                Boolean bool = (Boolean) this.f34286c;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n8Var2.getParentActivity(), 0, n8Var2.getResourceProvider());
                alertDialog$Builder2.f20608a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new h8(n8Var2, bool, (m0) this.d, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new gn0(26, n8Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.f34284a = i10;
        this.d = callback2;
        this.f34285b = serializable;
        this.f34286c = serializable2;
    }

    public h(m0 m0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f34284a = 0;
        this.f34285b = importedWalletProof;
        this.f34286c = exc;
        this.d = callback2;
    }
}
