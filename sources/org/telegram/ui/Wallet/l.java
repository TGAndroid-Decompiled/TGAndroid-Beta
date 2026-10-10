package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.q80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df;
import org.telegram.ui.e90;
import org.telegram.ui.ls0;
import org.telegram.ui.vx;
import org.telegram.ui.zn;
public final class l implements Runnable {
    public final int f35225a;
    public final Object f35226b;
    public final Object f35227c;
    public final Object d;

    public l(int i10, Object obj, Object obj2, String str) {
        this.f35225a = i10;
        this.f35226b = obj;
        this.d = obj2;
        this.f35227c = str;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f35225a) {
            case 0:
                k0 k0Var = (k0) this.f35226b;
                b0 b0Var = (b0) this.d;
                if (k0Var.J.get((String) this.f35227c) == b0Var) {
                    b0Var.f34693e = true;
                    ArrayList arrayList = b0Var.f34694f;
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
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f35226b;
                Exception exc = (Exception) this.f35227c;
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
                a2 a2Var = (a2) this.f35227c;
                ci.d dVar = (ci.d) this.d;
                boolean z10 = true;
                if (!((vx) this.f35226b).canScrollVertically(1)) {
                    a2Var.f34661p = true;
                }
                dVar.setEnabled((!a2Var.f34661p || a2Var.f34658m || a2Var.f34659n) ? false : false);
                return;
            case 3:
                e2 e2Var = (e2) this.f35226b;
                z1 z1Var = (z1) this.f35227c;
                e2Var.getClass();
                k kVar = new k((e90) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.f35788e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (z1Var.f35789f) {
                        kVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f35789f = true;
                    e2Var.f34859b.h0(new n6(e2Var, z1Var, kVar, tonconnectsession, 5));
                    return;
                }
                kVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                e2 e2Var2 = (e2) this.f35226b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f35227c;
                e2Var2.getClass();
                k kVar2 = new k((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!e2Var2.f34860c.add(Long.valueOf(tonconnectsession2.f20303id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    p pVar = new p(e2Var2, tonconnectsession2, kVar2, 3);
                    if (tonconnectsession2.closed) {
                        pVar.run(null);
                        return;
                    } else {
                        e2Var2.f34859b.h0(new l(e2Var2, pVar, tonconnectsession2, 6));
                        return;
                    }
                }
                kVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((ai.m0) this.f35226b).run((TL_wallet.inputTonConnectOauthSession) this.d, (String) this.f35227c);
                return;
            case 6:
                e2 e2Var3 = (e2) this.f35226b;
                p pVar2 = (p) this.f35227c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                k0 k0Var2 = e2Var3.f34859b;
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new df(e2Var3, pVar2, tonconnectsession3, r10, bArr2, 6), true, false);
                    return;
                } else {
                    pVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((z1) this.f35226b).f35789f = false;
                ((k) this.d).run((String) this.f35227c);
                return;
            case 8:
                ((n6) this.f35226b).run();
                ((q80) this.f35227c).K((q80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f35226b;
                j2[] j2VarArr = (j2[]) this.f35227c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    j2 j2Var = j2VarArr[0];
                    if (j2Var != null) {
                        j2Var.dismiss();
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
                j2[] j2VarArr2 = (j2[]) this.f35226b;
                j2VarArr2[0].setOnDismissListener(new ei.e0(13, (TLRPC.User) this.f35227c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                return;
            case 11:
                ((Utilities.Callback2) this.f35226b).run(((String[]) this.f35227c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                ((Utilities.Callback2) this.f35226b).run((String) this.f35227c, (String) this.d);
                return;
            case 13:
                ((WalletEngine2) this.f35226b).lambda$previewSignMessage$8((d2) this.f35227c, (Utilities.Callback) this.d);
                return;
            case 14:
                ((Utilities.Callback2) this.f35226b).run((Long) this.d, (String) this.f35227c);
                return;
            case 15:
                ((WalletEngine2) this.f35226b).lambda$previewTonConnect$2((d2) this.f35227c, (Utilities.Callback2) this.d);
                return;
            case 16:
                m7 m7Var = (m7) this.f35227c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m7Var.getParentActivity(), 0, m7Var.getResourceProvider());
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new g7(m7Var, (k0) this.f35226b, (f0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                m7 m7Var2 = (m7) this.f35227c;
                Boolean bool = (Boolean) this.d;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m7Var2.getParentActivity(), 0, m7Var2.getResourceProvider());
                alertDialog$Builder2.f20378a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new g7(m7Var2, bool, (k0) this.f35226b, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new ls0(22, m7Var2, bool));
                alertDialog$Builder2.o();
                return;
        }
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f35225a = i10;
        this.f35226b = obj;
        this.f35227c = obj2;
        this.d = obj3;
    }

    public l(k0 k0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f35225a = 1;
        this.f35226b = importedWalletProof;
        this.f35227c = exc;
        this.d = callback2;
    }

    public l(m7 m7Var, Boolean bool, k0 k0Var) {
        this.f35225a = 17;
        this.f35227c = m7Var;
        this.d = bool;
        this.f35226b = k0Var;
    }

    public l(m7 m7Var, k0 k0Var, f0 f0Var) {
        this.f35225a = 16;
        this.f35227c = m7Var;
        this.f35226b = k0Var;
        this.d = f0Var;
    }
}
