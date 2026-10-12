package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.s80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.eo;
import org.telegram.ui.g90;
import org.telegram.ui.hf;
import org.telegram.ui.ns0;
import org.telegram.ui.xx;
public final class l implements Runnable {
    public final int f34993a;
    public final Object f34994b;
    public final Object f34995c;
    public final Object d;

    public l(int i10, Object obj, Object obj2, String str) {
        this.f34993a = i10;
        this.f34994b = obj;
        this.d = obj2;
        this.f34995c = str;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f34993a) {
            case 0:
                l0 l0Var = (l0) this.f34994b;
                c0 c0Var = (c0) this.d;
                if (l0Var.J.get((String) this.f34995c) == c0Var) {
                    c0Var.f34535e = true;
                    ArrayList arrayList = c0Var.f34536f;
                    l0Var.f0(c0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(c0Var);
                    }
                    arrayList.clear();
                    l0Var.I();
                    return;
                }
                return;
            case 1:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f34994b;
                Exception exc = (Exception) this.f34995c;
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
                    l0.j(sb2.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    }
                    callback2.run(null, str2);
                    return;
                }
                l0.E("proof done");
                callback2.run(importedWalletProof, null);
                return;
            case 2:
                b2 b2Var = (b2) this.f34995c;
                ci.d dVar = (ci.d) this.d;
                boolean z10 = true;
                if (!((xx) this.f34994b).canScrollVertically(1)) {
                    b2Var.f34500p = true;
                }
                dVar.setEnabled((!b2Var.f34500p || b2Var.f34497m || b2Var.f34498n) ? false : false);
                return;
            case 3:
                f2 f2Var = (f2) this.f34994b;
                a2 a2Var = (a2) this.f34995c;
                f2Var.getClass();
                k kVar = new k((g90) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = a2Var.f34462e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (a2Var.f34463f) {
                        kVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    a2Var.f34463f = true;
                    f2Var.f34702b.h0(new o6(f2Var, a2Var, kVar, tonconnectsession, 5));
                    return;
                }
                kVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                f2 f2Var2 = (f2) this.f34994b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f34995c;
                f2Var2.getClass();
                k kVar2 = new k((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!f2Var2.f34703c.add(Long.valueOf(tonconnectsession2.f20066id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(f2Var2, tonconnectsession2, kVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        f2Var2.f34702b.h0(new l(f2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                kVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((ai.m0) this.f34994b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.f34995c);
                return;
            case 6:
                f2 f2Var3 = (f2) this.f34994b;
                p pVar2 = (p) this.f34995c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                l0 l0Var2 = f2Var3.f34702b;
                String r10 = l0Var2.r();
                byte[] w10 = l0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                if (r10 != null && bArr2 != null) {
                    l0Var2.x(new hf(f2Var3, pVar2, tonconnectsession3, r10, bArr2, 6), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((a2) this.f34994b).f34463f = false;
                ((k) this.d).run((String) this.f34995c);
                return;
            case 8:
                ((o6) this.f34994b).run();
                ((s80) this.f34995c).K((s80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f34994b;
                k2[] k2VarArr = (k2[]) this.f34995c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    k2 k2Var = k2VarArr[0];
                    if (k2Var != null) {
                        k2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(eo.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                k2[] k2VarArr2 = (k2[]) this.f34994b;
                k2VarArr2[0].setOnDismissListener(new ei.e0(13, (TLRPC.User) this.f34995c, (TL_wallet.walletTransactionPeerUser) this.d));
                k2VarArr2[0].dismiss();
                return;
            case 11:
                ((Utilities.Callback2) this.f34994b).run(((String[]) this.f34995c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                ((Utilities.Callback2) this.f34994b).run((String) this.f34995c, (String) this.d);
                return;
            case 13:
                ((WalletEngine2) this.f34994b).lambda$previewSignMessage$8((e2) this.f34995c, (Utilities.Callback) this.d);
                return;
            case 14:
                ((Utilities.Callback2) this.f34994b).run((Long) this.d, (String) this.f34995c);
                return;
            case 15:
                ((WalletEngine2) this.f34994b).lambda$previewTonConnect$2((e2) this.f34995c, (Utilities.Callback2) this.d);
                return;
            case 16:
                n7 n7Var = (n7) this.f34995c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n7Var.getParentActivity(), 0, n7Var.getResourceProvider());
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new h7(n7Var, (l0) this.f34994b, (g0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                n7 n7Var2 = (n7) this.f34995c;
                Boolean bool = (Boolean) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n7Var2.getParentActivity(), 0, n7Var2.getResourceProvider());
                alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new h7(n7Var2, bool, (l0) this.f34994b, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new ns0(22, n7Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f34993a = i10;
        this.f34994b = obj;
        this.f34995c = obj2;
        this.d = obj3;
    }

    public l(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f34993a = 1;
        this.f34994b = importedWalletProof;
        this.f34995c = exc;
        this.d = callback2;
    }

    public l(n7 n7Var, Boolean bool, l0 l0Var) {
        this.f34993a = 17;
        this.f34995c = n7Var;
        this.d = bool;
        this.f34994b = l0Var;
    }

    public l(n7 n7Var, l0 l0Var, g0 g0Var) {
        this.f34993a = 16;
        this.f34995c = n7Var;
        this.f34994b = l0Var;
        this.d = g0Var;
    }
}
