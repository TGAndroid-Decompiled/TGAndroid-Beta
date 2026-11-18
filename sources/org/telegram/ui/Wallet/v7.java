package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p51;
public final class v7 implements Runnable {
    public final int f45168a;
    public final Object f45169b;
    public final Object f45170c;
    public final Object d;
    public final Object f45171e;

    public v7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f45168a = i7;
        this.f45169b = obj;
        this.d = obj2;
        this.f45171e = obj3;
        this.f45170c = obj4;
    }

    @Override
    public final void run() {
        l0 l0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f45168a;
        byte[] bArr = null;
        boolean z11 = true;
        Object obj = this.f45170c;
        Object obj2 = this.f45171e;
        Object obj3 = this.d;
        Object obj4 = this.f45169b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$37((u10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                return;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                t0 t0Var = (t0) obj;
                ((r0) obj3).close();
                u0.P("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                t0Var.k();
                t0Var.i();
                t0Var.g();
                ((u0) obj4).a0();
                return;
            case 4:
                u0 u0Var = (u0) obj4;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                t0 t0Var2 = (t0) obj;
                u0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f28668id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    u0Var.f45098r.remove(wallettransaction2);
                    x10 x10Var = (x10) u0Var.f45097q.remove(wallettransaction2);
                    if (x10Var != null) {
                        x10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (l0Var = u0Var.f45095o) != null) {
                        l0.a(l0Var, wallettransaction2);
                    }
                    t0Var2.k();
                    t0Var2.i();
                    t0Var2.g();
                    u0Var.a0();
                    return;
                }
                return;
            case 5:
                l2.a((l2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 6:
                byte[] bArr2 = (byte[]) obj4;
                p51 p51Var = (p51) obj3;
                String str = (String) obj;
                di.x2 x2Var = (di.x2) obj2;
                if (bArr2 == null) {
                    p51Var.a(str);
                    return;
                } else {
                    x2Var.a(bArr2);
                    return;
                }
            case 7:
                l2 l2Var = (l2) obj4;
                g2 g2Var = (g2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                u0 u0Var2 = l2Var.f44480b;
                String y10 = u0Var2.y();
                byte[] E = u0Var2.E();
                if (E != null) {
                    bArr = (byte[]) E.clone();
                }
                ?? r11 = bArr;
                p51 p51Var2 = new p51(7, g2Var, kVar);
                if (y10 != null && r11 != 0) {
                    u0Var2.F(true, false, false, new di.s1(l2Var, p51Var2, tonconnectsession, y10, r11, g2Var, 2));
                    return;
                } else {
                    p51Var2.a("Wallet is not ready");
                    return;
                }
            case 8:
                l2 l2Var2 = (l2) obj4;
                r0 r0Var = (r0) obj3;
                h2 h2Var = (h2) obj2;
                p51 p51Var3 = (p51) obj;
                try {
                    jSONObject = WalletEngine2.signData(r0Var, h2Var.f44289a, h2Var.h, h2Var.f44294g, new JSONObject(h2Var.f44297k), l2.n(h2Var.f44289a.manifest.url), l2Var2.f44483f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = l2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.g3(new bi.h2(l2Var2, h2Var, r0Var, p51Var3, jSONObject, i7, 24));
                return;
            case 9:
                y2 y2Var = (y2) obj4;
                hi.d dVar = (hi.d) obj3;
                int[] iArr = (int[]) obj2;
                hi.d dVar2 = (hi.d) obj;
                boolean a10 = y2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131742732;
                } else {
                    i10 = 2131742930;
                }
                dVar.setText(gd.M0(i10, null));
                if (!a10 && !y2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.setEnabled(z10);
                if (a10 || y2Var.d) {
                    z11 = false;
                }
                dVar2.setEnabled(z11);
                return;
            case 10:
                n6.i0((n6) obj4, (LinearLayout) obj3, (u0) obj2, (y60) obj);
                return;
            case 11:
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) obj2;
                v7 v7Var = (v7) obj;
                g gVar = ((u0) obj4).h;
                if (gVar.f() != null && !zArr[0]) {
                    z0Var.setSubtext(gVar.i());
                    v7Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) obj4).lambda$signMessage$13((q10) obj3, (String) obj, (String) obj2);
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$48((String) obj, (byte[]) obj3, (q10) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$38((byte[]) obj2, (String) obj, (u10) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) obj4, (q10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public v7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f45168a = i7;
        this.f45169b = obj;
        this.d = obj2;
        this.f45170c = str;
        this.f45171e = obj3;
    }

    public v7(WalletEngine2 walletEngine2, String str, byte[] bArr, q10 q10Var) {
        this.f45168a = 13;
        this.f45169b = walletEngine2;
        this.f45170c = str;
        this.d = bArr;
        this.f45171e = q10Var;
    }

    public v7(WalletEngine2 walletEngine2, byte[] bArr, String str, u10 u10Var) {
        this.f45168a = 14;
        this.f45169b = walletEngine2;
        this.f45171e = bArr;
        this.f45170c = str;
        this.d = u10Var;
    }
}
