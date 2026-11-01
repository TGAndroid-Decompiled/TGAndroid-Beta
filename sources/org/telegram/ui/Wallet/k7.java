package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.o20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.d01;
public final class k7 implements Runnable {
    public final int f34817a;
    public final Object f34818b;
    public final Object f34819c;
    public final Object d;
    public final Object e;

    public k7(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34817a = i10;
        this.f34818b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f34819c = obj4;
    }

    @Override
    public final void run() {
        c0 c0Var;
        String i10;
        JSONObject jSONObject;
        int i11;
        boolean z10;
        int i12;
        int i13 = this.f34817a;
        byte[] bArr = null;
        boolean z11 = true;
        Object obj = this.f34819c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f34818b;
        switch (i13) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((o20) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                return;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                return;
            case 3:
                k0 k0Var = (k0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                j0 j0Var = (j0) obj;
                k0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f20057id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    r20 r20Var = (r20) k0Var.f34794q.remove(wallettransaction);
                    if (r20Var != null) {
                        r20Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (c0Var = k0Var.f34792o) != null) {
                        c0.a(c0Var, wallettransaction);
                    }
                    j0Var.k();
                    j0Var.i();
                    j0Var.g();
                    k0Var.S();
                    return;
                }
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                j0 j0Var2 = (j0) obj;
                ((h0) obj3).close();
                k0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                j0Var2.k();
                j0Var2.i();
                j0Var2.g();
                ((k0) obj4).S();
                return;
            case 5:
                k0 k0Var2 = (k0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                qh.d dVar = (qh.d) obj2;
                d2 d2Var = (d2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = k0Var2.f34782b;
                    if (walletEngine2 == null) {
                        dVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new ih.s(19, zArr, dVar));
                        return;
                    }
                }
                return;
            case 6:
                e2.a((e2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 7:
                byte[] bArr2 = (byte[]) obj4;
                d01 d01Var = (d01) obj3;
                String str = (String) obj;
                u1 u1Var = (u1) obj2;
                if (bArr2 == null) {
                    d01Var.a(str);
                    return;
                } else {
                    u1Var.a(bArr2);
                    return;
                }
            case 8:
                e2 e2Var = (e2) obj4;
                z1 z1Var = (z1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                k0 k0Var3 = e2Var.f34451b;
                String t10 = k0Var3.t();
                byte[] y3 = k0Var3.y();
                if (y3 != null) {
                    bArr = (byte[]) y3.clone();
                }
                byte[] bArr3 = bArr;
                d01 d01Var2 = new d01(11, z1Var, kVar);
                if (t10 != null && bArr3 != null) {
                    k0Var3.z(new e1(e2Var, (Object) d01Var2, (TLObject) tonconnectsession, t10, bArr3, (Object) z1Var, 1), true, false);
                    return;
                } else {
                    d01Var2.a("Wallet is not ready");
                    return;
                }
            case 9:
                e2 e2Var2 = (e2) obj4;
                h0 h0Var = (h0) obj3;
                a2 a2Var = (a2) obj2;
                d01 d01Var3 = (d01) obj;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, a2Var.f34169a, a2Var.h, a2Var.f34173g, new JSONObject(a2Var.f34176k), e2.n(a2Var.f34169a.manifest.url), e2Var2.f34453f.getCurrentTime());
                    i10 = null;
                } catch (Exception e) {
                    i10 = e2.i("sign data", e);
                    jSONObject = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.v8(e2Var2, a2Var, h0Var, d01Var3, jSONObject, i10, 9));
                return;
            case 10:
                u2 u2Var = (u2) obj4;
                vh.d dVar2 = (vh.d) obj3;
                int[] iArr = (int[]) obj2;
                vh.d dVar3 = (vh.d) obj;
                boolean a2 = u2Var.a();
                if (iArr[0] == 2) {
                    i11 = 2131743016;
                } else {
                    i11 = 2131743194;
                }
                dVar2.setText(dd.L0(i11, null));
                if (!a2 && !u2Var.d && ((i12 = iArr[0]) == 1 || i12 == 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar2.setEnabled(z10);
                if (a2 || u2Var.d) {
                    z11 = false;
                }
                dVar3.setEnabled(z11);
                return;
            case 11:
                b6.k0((b6) obj4, (LinearLayout) obj3, (k0) obj2, (z60) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) obj2;
                k7 k7Var = (k7) obj;
                f fVar = ((k0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    b1Var.setSubtext(fVar.i());
                    k7Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (k20) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((k20) obj3, (String) obj, (String) obj2);
                return;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (o20) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (k20) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public k7(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f34817a = i10;
        this.f34818b = obj;
        this.d = obj2;
        this.f34819c = str;
        this.e = obj3;
    }

    public k7(WalletEngine2 walletEngine2, String str, byte[] bArr, k20 k20Var) {
        this.f34817a = 13;
        this.f34818b = walletEngine2;
        this.f34819c = str;
        this.d = bArr;
        this.e = k20Var;
    }

    public k7(WalletEngine2 walletEngine2, byte[] bArr, String str, o20 o20Var) {
        this.f34817a = 15;
        this.f34818b = walletEngine2;
        this.e = bArr;
        this.f34819c = str;
        this.d = o20Var;
    }
}
