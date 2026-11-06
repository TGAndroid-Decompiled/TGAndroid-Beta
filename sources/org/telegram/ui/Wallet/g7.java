package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Wallet.WalletEngine2;
public final class g7 implements Runnable {
    public final int f42537a;
    public final Object f42538b;
    public final Object f42539c;
    public final Object d;
    public final Object f42540e;

    public g7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f42537a = i7;
        this.f42538b = obj;
        this.d = obj2;
        this.f42540e = obj3;
        this.f42539c = obj4;
    }

    @Override
    public final void run() {
        f0 f0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        boolean z9;
        int i11;
        int i12 = this.f42537a;
        byte[] bArr = null;
        boolean z10 = true;
        Object obj = this.f42539c;
        Object obj2 = this.f42540e;
        Object obj3 = this.d;
        Object obj4 = this.f42538b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((z10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                return;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                return;
            case 3:
                n0 n0Var = (n0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                m0 m0Var = (m0) obj;
                n0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f27215id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    c20 c20Var = (c20) n0Var.f42807q.remove(wallettransaction);
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (f0Var = n0Var.f42805o) != null) {
                        f0.a(f0Var, wallettransaction);
                    }
                    m0Var.k();
                    m0Var.i();
                    m0Var.g();
                    n0Var.S();
                    return;
                }
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                m0 m0Var2 = (m0) obj;
                ((k0) obj3).close();
                n0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                m0Var2.k();
                m0Var2.i();
                m0Var2.g();
                ((n0) obj4).S();
                return;
            case 5:
                n0 n0Var2 = (n0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ai.e eVar = (ai.e) obj2;
                e2 e2Var = (e2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = n0Var2.f42794b;
                    if (walletEngine2 == null) {
                        eVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(e2Var, new bi.p5(25, zArr, eVar));
                        return;
                    }
                }
                return;
            case 6:
                f2.a((f2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 7:
                byte[] bArr2 = (byte[]) obj4;
                t tVar = (t) obj3;
                String str = (String) obj;
                bi.n3 n3Var = (bi.n3) obj2;
                if (bArr2 == null) {
                    tVar.a(str);
                    return;
                } else {
                    n3Var.a(bArr2);
                    return;
                }
            case 8:
                f2 f2Var = (f2) obj4;
                a2 a2Var = (a2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                n0 n0Var3 = f2Var.f42461b;
                String t6 = n0Var3.t();
                byte[] y10 = n0Var3.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr3 = bArr;
                t tVar2 = new t(4, a2Var, kVar);
                if (t6 != null && bArr3 != null) {
                    n0Var3.z(new f1(f2Var, (Object) tVar2, (TLObject) tonconnectsession, t6, bArr3, (Object) a2Var, 1), true, false);
                    return;
                } else {
                    tVar2.a("Wallet is not ready");
                    return;
                }
            case 9:
                f2 f2Var2 = (f2) obj4;
                k0 k0Var = (k0) obj3;
                b2 b2Var = (b2) obj2;
                t tVar3 = (t) obj;
                try {
                    jSONObject = WalletEngine2.signData(k0Var, b2Var.f42122a, b2Var.h, b2Var.f42127g, new JSONObject(b2Var.f42130k), f2.n(b2Var.f42122a.manifest.url), f2Var2.f42464f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = f2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new bi.a3(f2Var2, b2Var, k0Var, tVar3, jSONObject, i7, 19));
                return;
            case 10:
                u2 u2Var = (u2) obj4;
                fi.d dVar = (fi.d) obj3;
                int[] iArr = (int[]) obj2;
                fi.d dVar2 = (fi.d) obj;
                boolean a10 = u2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131742991;
                } else {
                    i10 = 2131743169;
                }
                dVar.setText(hd.M0(i10, null));
                if (!a10 && !u2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar.setEnabled(z9);
                if (a10 || u2Var.d) {
                    z10 = false;
                }
                dVar2.setEnabled(z10);
                return;
            case 11:
                y5.k0((y5) obj4, (LinearLayout) obj3, (n0) obj2, (k60) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                g7 g7Var = (g7) obj;
                f fVar = ((n0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    z0Var.setSubtext(fVar.i());
                    g7Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (v10) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((v10) obj3, (String) obj, (String) obj2);
                return;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (z10) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (v10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public g7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f42537a = i7;
        this.f42538b = obj;
        this.d = obj2;
        this.f42539c = str;
        this.f42540e = obj3;
    }

    public g7(WalletEngine2 walletEngine2, String str, byte[] bArr, v10 v10Var) {
        this.f42537a = 13;
        this.f42538b = walletEngine2;
        this.f42539c = str;
        this.d = bArr;
        this.f42540e = v10Var;
    }

    public g7(WalletEngine2 walletEngine2, byte[] bArr, String str, z10 z10Var) {
        this.f42537a = 15;
        this.f42538b = walletEngine2;
        this.f42540e = bArr;
        this.f42539c = str;
        this.d = z10Var;
    }
}
