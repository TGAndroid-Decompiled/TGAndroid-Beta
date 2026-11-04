package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.r10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e51;
public final class e7 implements Runnable {
    public final int f42475a;
    public final Object f42476b;
    public final Object f42477c;
    public final Object d;
    public final Object f42478e;

    public e7(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f42475a = i3;
        this.f42476b = obj;
        this.d = obj2;
        this.f42478e = obj3;
        this.f42477c = obj4;
    }

    @Override
    public final void run() {
        c0 c0Var;
        String i3;
        JSONObject jSONObject;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f42475a;
        byte[] bArr = null;
        boolean z11 = true;
        Object obj = this.f42477c;
        Object obj2 = this.f42478e;
        Object obj3 = this.d;
        Object obj4 = this.f42476b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((r10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
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
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f27265id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    u10 u10Var = (u10) k0Var.f42732q.remove(wallettransaction);
                    if (u10Var != null) {
                        u10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (c0Var = k0Var.f42730o) != null) {
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
                ai.c cVar = (ai.c) obj2;
                b2 b2Var = (b2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = k0Var2.f42719b;
                    if (walletEngine2 == null) {
                        cVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(b2Var, new ai.q4(26, zArr, cVar));
                        return;
                    }
                }
                return;
            case 6:
                c2.a((c2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 7:
                byte[] bArr2 = (byte[]) obj4;
                e51 e51Var = (e51) obj3;
                String str = (String) obj;
                ci.a3 a3Var = (ci.a3) obj2;
                if (bArr2 == null) {
                    e51Var.a(str);
                    return;
                } else {
                    a3Var.a(bArr2);
                    return;
                }
            case 8:
                c2 c2Var = (c2) obj4;
                x1 x1Var = (x1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                k0 k0Var3 = c2Var.f42378b;
                String t10 = k0Var3.t();
                byte[] y9 = k0Var3.y();
                if (y9 != null) {
                    bArr = (byte[]) y9.clone();
                }
                byte[] bArr3 = bArr;
                e51 e51Var2 = new e51(7, x1Var, kVar);
                if (t10 != null && bArr3 != null) {
                    k0Var3.z(new c1(c2Var, (Object) e51Var2, (TLObject) tonconnectsession, t10, bArr3, (Object) x1Var, 1), true, false);
                    return;
                } else {
                    e51Var2.a("Wallet is not ready");
                    return;
                }
            case 9:
                c2 c2Var2 = (c2) obj4;
                h0 h0Var = (h0) obj3;
                y1 y1Var = (y1) obj2;
                e51 e51Var3 = (e51) obj;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, y1Var.f43456a, y1Var.h, y1Var.f43461g, new JSONObject(y1Var.f43464k), c2.n(y1Var.f43456a.manifest.url), c2Var2.f42381f.getCurrentTime());
                    i3 = null;
                } catch (Exception e10) {
                    i3 = c2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new ai.w1(c2Var2, y1Var, h0Var, e51Var3, jSONObject, i3, 20));
                return;
            case 10:
                s2 s2Var = (s2) obj4;
                gi.d dVar = (gi.d) obj3;
                int[] iArr = (int[]) obj2;
                gi.d dVar2 = (gi.d) obj;
                boolean a10 = s2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131743000;
                } else {
                    i10 = 2131743178;
                }
                dVar.setText(bd.M0(i10, null));
                if (!a10 && !s2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                if (a10 || s2Var.d) {
                    z11 = false;
                }
                dVar2.setEnabled(z11);
                return;
            case 11:
                w5.k0((w5) obj4, (LinearLayout) obj3, (k0) obj2, (f60) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                e7 e7Var = (e7) obj;
                f fVar = ((k0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    y0Var.setSubtext(fVar.i());
                    e7Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (n10) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((n10) obj3, (String) obj, (String) obj2);
                return;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (r10) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (n10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public e7(Object obj, Object obj2, String str, Object obj3, int i3) {
        this.f42475a = i3;
        this.f42476b = obj;
        this.d = obj2;
        this.f42477c = str;
        this.f42478e = obj3;
    }

    public e7(WalletEngine2 walletEngine2, String str, byte[] bArr, n10 n10Var) {
        this.f42475a = 13;
        this.f42476b = walletEngine2;
        this.f42477c = str;
        this.d = bArr;
        this.f42478e = n10Var;
    }

    public e7(WalletEngine2 walletEngine2, byte[] bArr, String str, r10 r10Var) {
        this.f42475a = 15;
        this.f42476b = walletEngine2;
        this.f42478e = bArr;
        this.f42477c = str;
        this.d = r10Var;
    }
}
