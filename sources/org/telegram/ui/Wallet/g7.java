package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.w10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.x21;
public final class g7 implements Runnable {
    public final int f43877a;
    public final Object f43878b;
    public final Object f43879c;
    public final Object d;
    public final Object f43880e;

    public g7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43877a = i7;
        this.f43878b = obj;
        this.d = obj2;
        this.f43880e = obj3;
        this.f43879c = obj4;
    }

    @Override
    public final void run() {
        d0 d0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f43877a;
        byte[] bArr = null;
        boolean z11 = true;
        Object obj = this.f43879c;
        Object obj2 = this.f43880e;
        Object obj3 = this.d;
        Object obj4 = this.f43878b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$34((w10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                return;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                return;
            case 3:
                l0 l0Var = (l0) obj4;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                k0 k0Var = (k0) obj;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f28314id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    z10 z10Var = (z10) l0Var.f44092q.remove(wallettransaction);
                    if (z10Var != null) {
                        z10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.f44090o) != null) {
                        d0.a(d0Var, wallettransaction);
                    }
                    k0Var.k();
                    k0Var.i();
                    k0Var.g();
                    l0Var.S();
                    return;
                }
                return;
            case 4:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj2;
                k0 k0Var2 = (k0) obj;
                ((i0) obj3).close();
                l0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                ((l0) obj4).S();
                return;
            case 5:
                l0 l0Var2 = (l0) obj4;
                boolean[] zArr = (boolean[]) obj3;
                bi.b bVar = (bi.b) obj2;
                c2 c2Var = (c2) obj;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.f44079b;
                    if (walletEngine2 == null) {
                        bVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(c2Var, new bi.e4(26, zArr, bVar));
                        return;
                    }
                }
                return;
            case 6:
                d2.a((d2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 7:
                byte[] bArr2 = (byte[]) obj4;
                x21 x21Var = (x21) obj3;
                String str = (String) obj;
                di.t2 t2Var = (di.t2) obj2;
                if (bArr2 == null) {
                    x21Var.a(str);
                    return;
                } else {
                    t2Var.a(bArr2);
                    return;
                }
            case 8:
                d2 d2Var = (d2) obj4;
                y1 y1Var = (y1) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                l0 l0Var3 = d2Var.f43730b;
                String t6 = l0Var3.t();
                byte[] y10 = l0Var3.y();
                if (y10 != null) {
                    bArr = (byte[]) y10.clone();
                }
                byte[] bArr3 = bArr;
                x21 x21Var2 = new x21(9, y1Var, kVar);
                if (t6 != null && bArr3 != null) {
                    l0Var3.z(new d1(d2Var, (Object) x21Var2, (TLObject) tonconnectsession, t6, bArr3, (Object) y1Var, 1), true, false);
                    return;
                } else {
                    x21Var2.a("Wallet is not ready");
                    return;
                }
            case 9:
                d2 d2Var2 = (d2) obj4;
                i0 i0Var = (i0) obj3;
                z1 z1Var = (z1) obj2;
                x21 x21Var3 = (x21) obj;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, z1Var.f44776a, z1Var.h, z1Var.f44781g, new JSONObject(z1Var.f44784k), d2.n(z1Var.f44776a.manifest.url), d2Var2.f43733f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = d2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.h3(new bi.p1(d2Var2, z1Var, i0Var, x21Var3, jSONObject, i7, 21));
                return;
            case 10:
                r2 r2Var = (r2) obj4;
                hi.d dVar = (hi.d) obj3;
                int[] iArr = (int[]) obj2;
                hi.d dVar2 = (hi.d) obj;
                boolean a10 = r2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131742990;
                } else {
                    i10 = 2131743168;
                }
                dVar.setText(hd.M0(i10, null));
                if (!a10 && !r2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                if (a10 || r2Var.d) {
                    z11 = false;
                }
                dVar2.setEnabled(z11);
                return;
            case 11:
                y5.k0((y5) obj4, (LinearLayout) obj3, (l0) obj2, (m60) obj);
                return;
            case 12:
                boolean[] zArr2 = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                g7 g7Var = (g7) obj;
                f fVar = ((l0) obj4).h;
                if (fVar.f() != null && !zArr2[0]) {
                    z0Var.setSubtext(fVar.i());
                    g7Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$45((String) obj, (byte[]) obj3, (s10) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$signMessage$10((s10) obj3, (String) obj, (String) obj2);
                return;
            case 15:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$35((byte[]) obj2, (String) obj, (w10) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) obj4, (s10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public g7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f43877a = i7;
        this.f43878b = obj;
        this.d = obj2;
        this.f43879c = str;
        this.f43880e = obj3;
    }

    public g7(WalletEngine2 walletEngine2, String str, byte[] bArr, s10 s10Var) {
        this.f43877a = 13;
        this.f43878b = walletEngine2;
        this.f43879c = str;
        this.d = bArr;
        this.f43880e = s10Var;
    }

    public g7(WalletEngine2 walletEngine2, byte[] bArr, String str, w10 w10Var) {
        this.f43877a = 15;
        this.f43878b = walletEngine2;
        this.f43880e = bArr;
        this.f43879c = str;
        this.d = w10Var;
    }
}
