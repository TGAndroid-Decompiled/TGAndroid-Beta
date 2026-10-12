package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ay;
import org.telegram.ui.cs0;
import org.telegram.ui.fo;
import org.telegram.ui.j90;
import org.telegram.ui.kf;
public final class k implements Runnable {
    public final int f33379a;
    public final Object f33380b;
    public final Object f33381c;
    public final Object d;

    public k(int i10, Object obj, Object obj2, String str) {
        this.f33379a = i10;
        this.f33380b = obj;
        this.d = obj2;
        this.f33381c = str;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f33379a) {
            case 0:
                j0 j0Var = (j0) this.f33380b;
                a0 a0Var = (a0) this.d;
                if (j0Var.J.get((String) this.f33381c) == a0Var) {
                    a0Var.e = true;
                    ArrayList arrayList = a0Var.f32912f;
                    j0Var.f0(a0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(a0Var);
                    }
                    arrayList.clear();
                    j0Var.I();
                    return;
                }
                return;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f33380b;
                Exception exc = (Exception) this.f33381c;
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
                    j0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    return;
                }
                j0.E("proof done");
                callback2.run(importedWalletProof, null);
                return;
            case 2:
                z1 z1Var = (z1) this.f33381c;
                di.d dVar = (di.d) this.d;
                boolean z10 = true;
                if (!((ay) this.f33380b).canScrollVertically(1)) {
                    z1Var.f33912p = true;
                }
                dVar.setEnabled((!z1Var.f33912p || z1Var.f33909m || z1Var.f33910n) ? false : false);
                return;
            case 3:
                d2 d2Var = (d2) this.f33380b;
                y1 y1Var = (y1) this.f33381c;
                d2Var.getClass();
                j jVar = new j((j90) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = y1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (y1Var.f33878f) {
                        jVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    y1Var.f33878f = true;
                    d2Var.f33041b.h0(new l6(d2Var, y1Var, jVar, tonconnectsession, 5));
                    return;
                }
                jVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                d2 d2Var2 = (d2) this.f33380b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f33381c;
                d2Var2.getClass();
                j jVar2 = new j((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!d2Var2.f33042c.add(Long.valueOf(tonconnectsession2.f19475id))) {
                        jVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    o oVar = new o(d2Var2, tonconnectsession2, jVar2, 3);
                    if (tonconnectsession2.closed) {
                        oVar.run(null);
                        return;
                    } else {
                        d2Var2.f33041b.h0(new k(d2Var2, oVar, tonconnectsession2, 6));
                        return;
                    }
                }
                jVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((bi.f0) this.f33380b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.f33381c);
                return;
            case 6:
                d2 d2Var3 = (d2) this.f33380b;
                o oVar2 = (o) this.f33381c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                j0 j0Var2 = d2Var3.f33041b;
                String r10 = j0Var2.r();
                byte[] w9 = j0Var2.w();
                if (w9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w9.clone();
                }
                byte[] bArr2 = bArr;
                if (r10 != null && bArr2 != null) {
                    j0Var2.x(new kf(d2Var3, oVar2, tonconnectsession3, r10, bArr2, 6), true, false);
                    return;
                } else {
                    oVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((y1) this.f33380b).f33878f = false;
                ((j) this.d).run((String) this.f33381c);
                return;
            case 8:
                ((l6) this.f33380b).run();
                ((m80) this.f33381c).K((m80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f33380b;
                i2[] i2VarArr = (i2[]) this.f33381c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    i2 i2Var = i2VarArr[0];
                    if (i2Var != null) {
                        i2Var.dismiss();
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
                i2[] i2VarArr2 = (i2[]) this.f33380b;
                i2VarArr2[0].setOnDismissListener(new fi.d0(13, (TLRPC.User) this.f33381c, (TL_wallet.walletTransactionPeerUser) this.d));
                i2VarArr2[0].dismiss();
                return;
            case 11:
                ((Utilities.Callback2) this.f33380b).run(((String[]) this.f33381c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                ((Utilities.Callback2) this.f33380b).run((String) this.f33381c, (String) this.d);
                return;
            case 13:
                ((WalletEngine2) this.f33380b).lambda$previewSignMessage$8((c2) this.f33381c, (Utilities.Callback) this.d);
                return;
            case 14:
                ((Utilities.Callback2) this.f33380b).run((Long) this.d, (String) this.f33381c);
                return;
            case 15:
                ((WalletEngine2) this.f33380b).lambda$previewTonConnect$2((c2) this.f33381c, (Utilities.Callback2) this.d);
                return;
            case 16:
                k7 k7Var = (k7) this.f33381c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getParentActivity(), 0, k7Var.getResourceProvider());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new e7(k7Var, (j0) this.f33380b, (e0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                k7 k7Var2 = (k7) this.f33381c;
                Boolean bool = (Boolean) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var2.getParentActivity(), 0, k7Var2.getResourceProvider());
                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new e7(k7Var2, bool, (j0) this.f33380b, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new cs0(25, k7Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f33379a = i10;
        this.f33380b = obj;
        this.f33381c = obj2;
        this.d = obj3;
    }

    public k(j0 j0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f33379a = 1;
        this.f33380b = importedWalletProof;
        this.f33381c = exc;
        this.d = callback2;
    }

    public k(k7 k7Var, Boolean bool, j0 j0Var) {
        this.f33379a = 17;
        this.f33381c = k7Var;
        this.d = bool;
        this.f33380b = j0Var;
    }

    public k(k7 k7Var, j0 j0Var, e0 e0Var) {
        this.f33379a = 16;
        this.f33381c = k7Var;
        this.f33380b = j0Var;
        this.d = e0Var;
    }
}
