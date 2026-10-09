package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df;
import org.telegram.ui.e90;
import org.telegram.ui.ls0;
import org.telegram.ui.vx;
import org.telegram.ui.zn;
public final class k implements Runnable {
    public final int f35090a;
    public final Object f35091b;
    public final Object f35092c;
    public final Object d;

    public k(int i10, Object obj, Object obj2, String str) {
        this.f35090a = i10;
        this.f35091b = obj;
        this.d = obj2;
        this.f35092c = str;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f35090a) {
            case 0:
                k0 k0Var = (k0) this.f35091b;
                b0 b0Var = (b0) this.d;
                if (k0Var.J.get((String) this.f35092c) == b0Var) {
                    b0Var.f34639e = true;
                    ArrayList arrayList = b0Var.f34640f;
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
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f35091b;
                Exception exc = (Exception) this.f35092c;
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
                z1 z1Var = (z1) this.f35092c;
                ci.d dVar = (ci.d) this.d;
                boolean z10 = true;
                if (!((vx) this.f35091b).canScrollVertically(1)) {
                    z1Var.f35706p = true;
                }
                dVar.setEnabled((!z1Var.f35706p || z1Var.f35703m || z1Var.f35704n) ? false : false);
                return;
            case 3:
                d2 d2Var = (d2) this.f35091b;
                y1 y1Var = (y1) this.f35092c;
                d2Var.getClass();
                j jVar = new j((e90) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = y1Var.f35649e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (y1Var.f35650f) {
                        jVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    y1Var.f35650f = true;
                    d2Var.f34788b.h0(new l6(d2Var, y1Var, jVar, tonconnectsession, 5));
                    return;
                }
                jVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                d2 d2Var2 = (d2) this.f35091b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f35092c;
                d2Var2.getClass();
                j jVar2 = new j((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!d2Var2.f34789c.add(Long.valueOf(tonconnectsession2.f20299id))) {
                        jVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    o oVar = new o(d2Var2, tonconnectsession2, jVar2, 3);
                    if (tonconnectsession2.closed) {
                        oVar.run(null);
                        return;
                    } else {
                        d2Var2.f34788b.h0(new k(d2Var2, oVar, tonconnectsession2, 6));
                        return;
                    }
                }
                jVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((ai.m0) this.f35091b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.f35092c);
                return;
            case 6:
                d2 d2Var3 = (d2) this.f35091b;
                o oVar2 = (o) this.f35092c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                k0 k0Var2 = d2Var3.f34788b;
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new df(d2Var3, oVar2, tonconnectsession3, r10, bArr2, 6), true, false);
                    return;
                } else {
                    oVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((y1) this.f35091b).f35650f = false;
                ((j) this.d).run((String) this.f35092c);
                return;
            case 8:
                ((l6) this.f35091b).run();
                ((p80) this.f35092c).K((p80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f35091b;
                i2[] i2VarArr = (i2[]) this.f35092c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    i2 i2Var = i2VarArr[0];
                    if (i2Var != null) {
                        i2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(zn.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                i2[] i2VarArr2 = (i2[]) this.f35091b;
                i2VarArr2[0].setOnDismissListener(new ei.e0(13, (TLRPC.User) this.f35092c, (TL_wallet.walletTransactionPeerUser) this.d));
                i2VarArr2[0].dismiss();
                return;
            case 11:
                ((Utilities.Callback2) this.f35091b).run(((String[]) this.f35092c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                ((Utilities.Callback2) this.f35091b).run((String) this.f35092c, (String) this.d);
                return;
            case 13:
                ((WalletEngine2) this.f35091b).lambda$previewSignMessage$8((c2) this.f35092c, (Utilities.Callback) this.d);
                return;
            case 14:
                ((Utilities.Callback2) this.f35091b).run((Long) this.d, (String) this.f35092c);
                return;
            case 15:
                ((WalletEngine2) this.f35091b).lambda$previewTonConnect$2((c2) this.f35092c, (Utilities.Callback2) this.d);
                return;
            case 16:
                k7 k7Var = (k7) this.f35092c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getParentActivity(), 0, k7Var.getResourceProvider());
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new e7(k7Var, (k0) this.f35091b, (f0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                k7 k7Var2 = (k7) this.f35092c;
                Boolean bool = (Boolean) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var2.getParentActivity(), 0, k7Var2.getResourceProvider());
                alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new e7(k7Var2, bool, (k0) this.f35091b, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new ls0(22, k7Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f35090a = i10;
        this.f35091b = obj;
        this.f35092c = obj2;
        this.d = obj3;
    }

    public k(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f35090a = 1;
        this.f35091b = importedWalletProof;
        this.f35092c = exc;
        this.d = callback2;
    }

    public k(k7 k7Var, Boolean bool, k0 k0Var) {
        this.f35090a = 17;
        this.f35092c = k7Var;
        this.d = bool;
        this.f35091b = k0Var;
    }

    public k(k7 k7Var, k0 k0Var, f0 f0Var) {
        this.f35090a = 16;
        this.f35092c = k7Var;
        this.f35091b = k0Var;
        this.d = f0Var;
    }
}
