package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Wallet.WalletEngine2;
public final class f7 implements Runnable {
    public final int f42506a;
    public final Object f42507b;
    public final Object f42508c;
    public final Object d;
    public final Object f42509e;

    public f7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f42506a = i7;
        this.f42507b = obj;
        this.d = obj2;
        this.f42509e = obj3;
        this.f42508c = obj4;
    }

    @Override
    public final void run() {
        e0 e0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        boolean z9;
        int i11;
        int i12 = this.f42506a;
        byte[] bArr = null;
        boolean z10 = true;
        Object obj = this.f42508c;
        Object obj2 = this.f42509e;
        Object obj3 = this.d;
        Object obj4 = this.f42507b;
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
                m0 m0Var = (m0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                l0 l0Var = (l0) obj;
                m0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f27219id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    c20 c20Var = (c20) m0Var.f42776q.remove(wallettransaction);
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (e0Var = m0Var.f42774o) != null) {
                        e0.a(e0Var, wallettransaction);
                    }
                    l0Var.k();
                    l0Var.i();
                    l0Var.g();
                    m0Var.S();
                    return;
                }
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                l0 l0Var2 = (l0) obj;
                ((j0) obj3).close();
                m0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                l0Var2.k();
                l0Var2.i();
                l0Var2.g();
                ((m0) obj4).S();
                return;
            case 5:
                m0 m0Var2 = (m0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ai.e eVar = (ai.e) obj2;
                d2 d2Var = (d2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = m0Var2.f42763b;
                    if (walletEngine2 == null) {
                        eVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new bi.p5(25, zArr, eVar));
                        return;
                    }
                }
                return;
            case 6:
                e2.a((e2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
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
                e2 e2Var = (e2) obj4;
                z1 z1Var = (z1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                m0 m0Var3 = e2Var.f42428b;
                String t6 = m0Var3.t();
                byte[] y10 = m0Var3.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr3 = bArr;
                t tVar2 = new t(4, z1Var, kVar);
                if (t6 != null && bArr3 != null) {
                    m0Var3.z(new e1(e2Var, (Object) tVar2, (TLObject) tonconnectsession, t6, bArr3, (Object) z1Var, 1), true, false);
                    return;
                } else {
                    tVar2.a("Wallet is not ready");
                    return;
                }
            case 9:
                e2 e2Var2 = (e2) obj4;
                j0 j0Var = (j0) obj3;
                a2 a2Var = (a2) obj2;
                t tVar3 = (t) obj;
                try {
                    jSONObject = WalletEngine2.signData(j0Var, a2Var.f42093a, a2Var.h, a2Var.f42098g, new JSONObject(a2Var.f42101k), e2.n(a2Var.f42093a.manifest.url), e2Var2.f42431f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = e2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new bi.a3(e2Var2, a2Var, j0Var, tVar3, jSONObject, i7, 19));
                return;
            case 10:
                t2 t2Var = (t2) obj4;
                fi.d dVar = (fi.d) obj3;
                int[] iArr = (int[]) obj2;
                fi.d dVar2 = (fi.d) obj;
                boolean a10 = t2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131742993;
                } else {
                    i10 = 2131743171;
                }
                dVar.setText(id.M0(i10, null));
                if (!a10 && !t2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar.setEnabled(z9);
                if (a10 || t2Var.d) {
                    z10 = false;
                }
                dVar2.setEnabled(z10);
                return;
            case 11:
                x5.k0((x5) obj4, (LinearLayout) obj3, (m0) obj2, (k60) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                f7 f7Var = (f7) obj;
                f fVar = ((m0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    z0Var.setSubtext(fVar.i());
                    f7Var.run();
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

    public f7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f42506a = i7;
        this.f42507b = obj;
        this.d = obj2;
        this.f42508c = str;
        this.f42509e = obj3;
    }

    public f7(WalletEngine2 walletEngine2, String str, byte[] bArr, v10 v10Var) {
        this.f42506a = 13;
        this.f42507b = walletEngine2;
        this.f42508c = str;
        this.d = bArr;
        this.f42509e = v10Var;
    }

    public f7(WalletEngine2 walletEngine2, byte[] bArr, String str, z10 z10Var) {
        this.f42506a = 15;
        this.f42507b = walletEngine2;
        this.f42509e = bArr;
        this.f42508c = str;
        this.d = z10Var;
    }
}
