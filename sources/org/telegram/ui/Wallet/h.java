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
import org.telegram.ui.Components.k80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.bx;
import org.telegram.ui.q80;
import org.telegram.ui.un;
import org.telegram.ui.zg1;
public final class h implements Runnable {
    public final int f36615a;
    public final Object f36616b;
    public final Object f36617c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f36615a = i10;
        this.f36616b = obj;
        this.f36617c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f36615a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f36616b;
                Exception exc = (Exception) this.f36617c;
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
                l0.F("proof done");
                callback2.run(importedWalletProof, null);
                return;
            case 1:
                l0 l0Var = (l0) this.f36616b;
                c0 c0Var = (c0) this.d;
                if (l0Var.N.get((String) this.f36617c) == c0Var) {
                    c0Var.e = true;
                    ArrayList arrayList = c0Var.f36416f;
                    l0Var.h0(c0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Utilities.Callback) obj).run(c0Var);
                    }
                    arrayList.clear();
                    l0Var.J();
                    return;
                }
                return;
            case 2:
                a2 a2Var = (a2) this.f36617c;
                fi.d dVar = (fi.d) this.d;
                boolean z10 = true;
                if (!((bx) this.f36616b).canScrollVertically(1)) {
                    a2Var.f36349p = true;
                }
                dVar.setEnabled((!a2Var.f36349p || a2Var.f36346m || a2Var.f36347n) ? false : false);
                return;
            case 3:
                e2 e2Var = (e2) this.f36616b;
                z1 z1Var = (z1) this.f36617c;
                e2Var.getClass();
                k kVar = new k((q80) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (z1Var.f37553f) {
                        kVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f37553f = true;
                    e2Var.f36507b.j0(new w6(e2Var, z1Var, kVar, tonconnectsession, 6));
                    return;
                }
                kVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                e2 e2Var2 = (e2) this.f36616b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f36617c;
                e2Var2.getClass();
                k kVar2 = new k((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!e2Var2.f36508c.add(Long.valueOf(tonconnectsession2.f22290id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    o oVar = new o(e2Var2, tonconnectsession2, kVar2, 3);
                    if (tonconnectsession2.closed) {
                        oVar.run(null);
                        return;
                    } else {
                        e2Var2.f36507b.j0(new h(e2Var2, oVar, tonconnectsession2, 6));
                        return;
                    }
                }
                kVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((r1) this.f36616b).run((TL_wallet.inputTonConnectOauthSession) this.f36617c, (String) this.d);
                return;
            case 6:
                e2 e2Var3 = (e2) this.f36616b;
                o oVar2 = (o) this.f36617c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                l0 l0Var2 = e2Var3.f36507b;
                String s10 = l0Var2.s();
                byte[] x9 = l0Var2.x();
                if (x9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x9.clone();
                }
                byte[] bArr2 = bArr;
                if (s10 != null && bArr2 != null) {
                    l0Var2.y(new bi.t3(e2Var3, oVar2, tonconnectsession3, s10, bArr2, 7), true, false);
                    return;
                } else {
                    oVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((z1) this.f36616b).f37553f = false;
                ((k) this.f36617c).run((String) this.d);
                return;
            case 8:
                ((w6) this.f36616b).run();
                ((k80) this.f36617c).K((k80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f36616b;
                j2[] j2VarArr = (j2[]) this.f36617c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    j2 j2Var = j2VarArr[0];
                    if (j2Var != null) {
                        j2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(un.ba(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                j2[] j2VarArr2 = (j2[]) this.f36616b;
                j2VarArr2[0].setOnDismissListener(new bi.u3(15, (TLRPC.User) this.f36617c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                return;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.f36616b;
                j2[] j2VarArr3 = (j2[]) this.f36617c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    j2 j2Var2 = j2VarArr3[0];
                    if (j2Var2 != null) {
                        j2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(un.ba(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((Utilities.Callback2) this.d).run(((String[]) this.f36616b)[0], Boolean.valueOf(((boolean[]) this.f36617c)[0]));
                return;
            case 13:
                r5 r5Var = (r5) this.f36616b;
                n5 n5Var = (n5) this.f36617c;
                r5Var.f37168b = n5Var;
                n5Var.j(r5Var.f37170c);
                r5Var.f37176g0 = Float.NaN;
                r5Var.b(r5Var.f37171c0, r5Var.f37175f0);
                r5Var.e.setVisibility(0);
                ((o5) this.d).run();
                u2 u2Var = r5Var.d;
                if (u2Var != null) {
                    r5Var.d = null;
                    u2Var.run();
                    return;
                }
                return;
            case 14:
                ((Utilities.Callback2) this.d).run((String) this.f36616b, (String) this.f36617c);
                return;
            case 15:
                ((WalletEngine2) this.f36616b).lambda$previewSignMessage$8((d2) this.f36617c, (Utilities.Callback) this.d);
                return;
            case 16:
                ((Utilities.Callback2) this.d).run((Long) this.f36616b, (String) this.f36617c);
                return;
            case 17:
                ((WalletEngine2) this.f36616b).lambda$previewTonConnect$2((d2) this.f36617c, (Utilities.Callback2) this.d);
                return;
            case 18:
                s7 s7Var = (s7) this.f36616b;
                int[] iArr = (int[]) this.f36617c;
                Bitmap bitmap = (Bitmap) this.d;
                s7Var.C = false;
                t7 t7Var = s7Var.f37230d0;
                boolean z11 = t7Var.f37277a1;
                w5 w5Var = t7Var.f37281c;
                if (!z11) {
                    if (s7Var.f37245u == null) {
                        s7Var.f37245u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (w5Var.isShown() && w5Var.getAlpha() > 0.0f) {
                            r7 r7Var = s7Var.f37242r;
                            r7Var.a(0.0f);
                            r7Var.f37192b = 1.0f;
                        }
                    }
                    s7Var.f37245u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && s7Var.f37246w == null) {
                        s7Var.f37246w = bitmap;
                    }
                    if (s7Var.D) {
                        s7Var.c();
                    }
                    t7Var.f0();
                    return;
                }
                return;
            case 19:
                h8 h8Var = (h8) this.f36616b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h8Var.getParentActivity(), 0, h8Var.getResourceProvider());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(h8Var, (l0) this.f36617c, (g0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                h8 h8Var2 = (h8) this.f36616b;
                Boolean bool = (Boolean) this.f36617c;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h8Var2.getParentActivity(), 0, h8Var2.getResourceProvider());
                alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(h8Var2, bool, (l0) this.d, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new zg1(2, h8Var2, bool));
                alertDialog$Builder2.p();
                return;
        }
    }

    public h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.f36615a = i10;
        this.d = callback2;
        this.f36616b = serializable;
        this.f36617c = serializable2;
    }

    public h(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f36615a = 0;
        this.f36616b = importedWalletProof;
        this.f36617c = exc;
        this.d = callback2;
    }
}
