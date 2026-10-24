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
import org.telegram.ui.Components.h80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.gx;
import org.telegram.ui.pl0;
import org.telegram.ui.r80;
import org.telegram.ui.sn;
public final class h implements Runnable {
    public final int f34557a;
    public final Object f34558b;
    public final Object f34559c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f34557a = i10;
        this.f34558b = obj;
        this.f34559c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        String str;
        byte[] bArr;
        switch (this.f34557a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.f34558b;
                Exception exc = (Exception) this.f34559c;
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
                l0 l0Var = (l0) this.f34558b;
                c0 c0Var = (c0) this.d;
                if (l0Var.N.get((String) this.f34559c) == c0Var) {
                    c0Var.e = true;
                    ArrayList arrayList = c0Var.f34354f;
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
                a2 a2Var = (a2) this.f34559c;
                ei.d dVar = (ei.d) this.d;
                boolean z10 = true;
                if (!((gx) this.f34558b).canScrollVertically(1)) {
                    a2Var.f34286p = true;
                }
                dVar.setEnabled((!a2Var.f34286p || a2Var.f34283m || a2Var.f34284n) ? false : false);
                return;
            case 3:
                e2 e2Var = (e2) this.f34558b;
                z1 z1Var = (z1) this.f34559c;
                e2Var.getClass();
                k kVar = new k((r80) this.d, 2);
                TL_wallet.tonConnectSession tonconnectsession = z1Var.e;
                if (!tonconnectsession.closed && !tonconnectsession.closing && tonconnectsession.manifest_error == null && tonconnectsession.manifest != null) {
                    if (z1Var.f35487f) {
                        kVar.run("A TON Connect operation is already in progress");
                        return;
                    }
                    z1Var.f35487f = true;
                    e2Var.f34432b.j0(new w6(e2Var, z1Var, kVar, tonconnectsession, 6));
                    return;
                }
                kVar.run("The dApp manifest is unavailable or the session is closed");
                return;
            case 4:
                e2 e2Var2 = (e2) this.f34558b;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f34559c;
                e2Var2.getClass();
                k kVar2 = new k((Utilities.Callback) this.d, 3);
                if (tonconnectsession2 != null && tonconnectsession2.dapp_client_id != null && tonconnectsession2.client_id != null && tonconnectsession2.nonce != null) {
                    if (!e2Var2.f34433c.add(Long.valueOf(tonconnectsession2.f20602id))) {
                        kVar2.run("A TON Connect operation is already in progress");
                        return;
                    }
                    o oVar = new o(e2Var2, tonconnectsession2, kVar2, 3);
                    if (tonconnectsession2.closed) {
                        oVar.run(null);
                        return;
                    } else {
                        e2Var2.f34432b.j0(new h(e2Var2, oVar, tonconnectsession2, 6));
                        return;
                    }
                }
                kVar2.run("Missing TON Connect session data");
                return;
            case 5:
                ((r1) this.f34558b).run((TL_wallet.inputTonConnectOauthSession) this.f34559c, (String) this.d);
                return;
            case 6:
                e2 e2Var3 = (e2) this.f34558b;
                o oVar2 = (o) this.f34559c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                l0 l0Var2 = e2Var3.f34432b;
                String s10 = l0Var2.s();
                byte[] x10 = l0Var2.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                if (s10 != null && bArr2 != null) {
                    l0Var2.y(new ai.x3(e2Var3, oVar2, tonconnectsession3, s10, bArr2, 7), true, false);
                    return;
                } else {
                    oVar2.run("Wallet is not ready");
                    return;
                }
            case 7:
                ((z1) this.f34558b).f35487f = false;
                ((k) this.f34559c).run((String) this.d);
                return;
            case 8:
                ((w6) this.f34558b).run();
                ((h80) this.f34559c).K((h80) this.d);
                return;
            case 9:
                Utilities.Callback3 callback3 = (Utilities.Callback3) this.f34558b;
                j2[] j2VarArr = (j2[]) this.f34559c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (callback3 == null) {
                    j2 j2Var = j2VarArr[0];
                    if (j2Var != null) {
                        j2Var.dismiss();
                    }
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(sn.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                j2[] j2VarArr2 = (j2[]) this.f34558b;
                j2VarArr2[0].setOnDismissListener(new ai.z3(15, (TLRPC.User) this.f34559c, (TL_wallet.walletTransactionPeerUser) this.d));
                j2VarArr2[0].dismiss();
                return;
            case 11:
                Utilities.Callback3 callback32 = (Utilities.Callback3) this.f34558b;
                j2[] j2VarArr3 = (j2[]) this.f34559c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (callback32 == null) {
                    j2 j2Var2 = j2VarArr3[0];
                    if (j2Var2 != null) {
                        j2Var2.dismiss();
                    }
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        U2.presentFragment(sn.W9(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((Utilities.Callback2) this.d).run(((String[]) this.f34558b)[0], Boolean.valueOf(((boolean[]) this.f34559c)[0]));
                return;
            case 13:
                s5 s5Var = (s5) this.f34558b;
                p5 p5Var = (p5) this.f34559c;
                s5Var.f35133b = p5Var;
                p5Var.j(s5Var.f35135c);
                s5Var.f35141g0 = Float.NaN;
                s5Var.b(s5Var.f35136c0, s5Var.f35140f0);
                s5Var.e.setVisibility(0);
                ((q5) this.d).run();
                u2 u2Var = s5Var.d;
                if (u2Var != null) {
                    s5Var.d = null;
                    u2Var.run();
                    return;
                }
                return;
            case 14:
                ((Utilities.Callback2) this.d).run((String) this.f34558b, (String) this.f34559c);
                return;
            case 15:
                ((WalletEngine2) this.f34558b).lambda$previewSignMessage$8((d2) this.f34559c, (Utilities.Callback) this.d);
                return;
            case 16:
                ((Utilities.Callback2) this.d).run((Long) this.f34558b, (String) this.f34559c);
                return;
            case 17:
                ((WalletEngine2) this.f34558b).lambda$previewTonConnect$2((d2) this.f34559c, (Utilities.Callback2) this.d);
                return;
            case 18:
                s7 s7Var = (s7) this.f34558b;
                int[] iArr = (int[]) this.f34559c;
                Bitmap bitmap = (Bitmap) this.d;
                s7Var.C = false;
                t7 t7Var = s7Var.f35161d0;
                boolean z11 = t7Var.f35222a1;
                x5 x5Var = t7Var.f35226c;
                if (!z11) {
                    if (s7Var.f35176u == null) {
                        s7Var.f35176u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (x5Var.isShown() && x5Var.getAlpha() > 0.0f) {
                            r7 r7Var = s7Var.f35173r;
                            r7Var.a(0.0f);
                            r7Var.f35112b = 1.0f;
                        }
                    }
                    s7Var.f35176u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && s7Var.f35177w == null) {
                        s7Var.f35177w = bitmap;
                    }
                    if (s7Var.D) {
                        s7Var.c();
                    }
                    t7Var.f0();
                    return;
                }
                return;
            case 19:
                i8 i8Var = (i8) this.f34558b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8Var.getParentActivity(), 0, i8Var.getResourceProvider());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.WalletDisableBackupConfirmInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new b8(i8Var, (l0) this.f34559c, (g0) this.d));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                i8 i8Var2 = (i8) this.f34558b;
                Boolean bool = (Boolean) this.f34559c;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i8Var2.getParentActivity(), 0, i8Var2.getResourceProvider());
                alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.WalletReplaceWalletTitle);
                alertDialog$Builder2.k(LocaleController.getString(R.string.WalletCreateNew), new b8(i8Var2, bool, (l0) this.d, 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.WalletImportExisting), new pl0(28, i8Var2, bool));
                alertDialog$Builder2.p();
                return;
        }
    }

    public h(Utilities.Callback2 callback2, Serializable serializable, Serializable serializable2, int i10) {
        this.f34557a = i10;
        this.d = callback2;
        this.f34558b = serializable;
        this.f34559c = serializable2;
    }

    public h(l0 l0Var, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, Utilities.Callback2 callback2) {
        this.f34557a = 0;
        this.f34558b = importedWalletProof;
        this.f34559c = exc;
        this.d = callback2;
    }
}
