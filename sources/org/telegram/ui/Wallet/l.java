package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.l80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.bs0;
import org.telegram.ui.fo;
import org.telegram.ui.j90;
import org.telegram.ui.kf;
public final class l implements Runnable {
    public final int f33145a;
    public final Object f33146b;
    public final Object f33147c;
    public final Object d;

    public l(int i10, Object obj, Object obj2, String str) {
        this.f33145a = i10;
        this.f33146b = obj;
        this.d = obj2;
        this.f33147c = str;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f33145a) {
            case 0:
                k0 k0Var = (k0) this.f33146b;
                b0 b0Var = (b0) this.d;
                if (k0Var.J.get((String) this.f33147c) == b0Var) {
                    b0Var.e = true;
                    ArrayList arrayList = b0Var.f32684f;
                    k0Var.f0(b0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(b0Var);
                    }
                    arrayList.clear();
                    k0Var.I();
                    return;
                }
                return;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f33146b;
                Exception exc = (Exception) this.f33147c;
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
                    k0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    return;
                }
                k0.E("proof done");
                callback2.run(importedWalletProof, null);
                return;
            case 2:
                a2 a2Var = (a2) this.f33147c;
                di.d dVar = (di.d) this.d;
                boolean z10 = true;
                if (!((ay) this.f33146b).canScrollVertically(1)) {
                    a2Var.f32629p = true;
                }
                dVar.setEnabled((!a2Var.f32629p || a2Var.f32626m || a2Var.f32627n) ? false : false);
                return;
            case 3:
                e2 e2Var = (e2) this.f33146b;
                z1 z1Var = (z1) this.f33147c;
                e2Var.getClass();
                k kVar = new k((j90) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (z1Var.f33651f) {
                        kVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f33651f = true;
                    e2Var.f32818b.h0(new m6(e2Var, z1Var, kVar, tonconnectsession, 5));
                    return;
                }
                kVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                e2 e2Var2 = (e2) this.f33146b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f33147c;
                e2Var2.getClass();
                k kVar2 = new k((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!e2Var2.f32819c.add(Long.valueOf(tonconnectsession2.f19175id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(e2Var2, tonconnectsession2, kVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        e2Var2.f32818b.h0(new l(e2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                kVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((bi.f0) this.f33146b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.f33147c);
                return;
            case 6:
                e2 e2Var3 = (e2) this.f33146b;
                p pVar2 = (p) this.f33147c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                k0 k0Var2 = e2Var3.f32818b;
                String r10 = k0Var2.r();
                byte[] w9 = k0Var2.w();
                if (w9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w9.clone();
                }
                byte[] bArr2 = bArr;
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new kf(e2Var3, pVar2, tonconnectsession3, r10, bArr2, 6), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((z1) this.f33146b).f33651f = false;
                ((k) this.d).run((String) this.f33147c);
                return;
            case 8:
                ((m6) this.f33146b).run();
                ((l80) this.f33147c).K((l80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f33146b;
                j2[] j2VarArr = (j2[]) this.f33147c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    j2 j2Var = j2VarArr[0];
                    if (j2Var != null) {
                        j2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(fo.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                j2[] j2VarArr2 = (j2[]) this.f33146b;
                j2VarArr2[0].setOnDismissListener(new fi.d0(13, (TLRPC.User) this.f33147c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                return;
            case 11:
                ((Utilities.Callback2) this.f33146b).run(((String[]) this.f33147c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                ((Utilities.Callback2) this.f33146b).run((String) this.f33147c, (String) this.d);
                return;
            case 13:
                ((WalletEngine2) this.f33146b).lambda$previewSignMessage$8((d2) this.f33147c, (Utilities.Callback) this.d);
                return;
            case 14:
                ((Utilities.Callback2) this.f33146b).run((Long) this.d, (String) this.f33147c);
                return;
            case 15:
                ((WalletEngine2) this.f33146b).lambda$previewTonConnect$2((d2) this.f33147c, (Utilities.Callback2) this.d);
                return;
            case 16:
                l7 l7Var = (l7) this.f33147c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getParentActivity(), 0, l7Var.getResourceProvider());
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new f7(l7Var, (k0) this.f33146b, (f0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                l7 l7Var2 = (l7) this.f33147c;
                Boolean bool = (Boolean) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l7Var2.getParentActivity(), 0, l7Var2.getResourceProvider());
                alertDialog$Builder2.f19248a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new f7(l7Var2, bool, (k0) this.f33146b, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new bs0(24, l7Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f33145a = i10;
        this.f33146b = obj;
        this.f33147c = obj2;
        this.d = obj3;
    }

    public l(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f33145a = 1;
        this.f33146b = importedWalletProof;
        this.f33147c = exc;
        this.d = callback2;
    }

    public l(l7 l7Var, Boolean bool, k0 k0Var) {
        this.f33145a = 17;
        this.f33147c = l7Var;
        this.d = bool;
        this.f33146b = k0Var;
    }

    public l(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.f33145a = 16;
        this.f33147c = l7Var;
        this.f33146b = k0Var;
        this.d = f0Var;
    }
}
