package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.a31;
public final class w7 implements Runnable {
    public final int f45340a;
    public final Object f45341b;
    public final Object f45342c;
    public final Object d;
    public final Object f45343e;

    public w7(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f45340a = i7;
        this.f45341b = obj;
        this.d = obj2;
        this.f45343e = obj3;
        this.f45342c = obj4;
    }

    @Override
    public final void run() {
        m0 m0Var;
        String i7;
        JSONObject jSONObject;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f45340a;
        byte[] bArr = null;
        boolean z11 = true;
        Object obj = this.f45342c;
        Object obj2 = this.f45343e;
        Object obj3 = this.d;
        Object obj4 = this.f45341b;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$37((t10) obj3, (WalletEngine2.PreparedRotation) obj2, (String) obj);
                return;
            case 1:
                ((WalletEngine2) obj4).lambda$rotateKey$55((WalletEngine2.RotationCallbacks) obj3, (byte[]) obj2, (String) obj);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) obj4).lambda$dispatch$0((WalletEngine2.SendPhase) obj3, (String) obj, (String) obj2);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                u0 u0Var = (u0) obj;
                ((s0) obj3).close();
                v0.P("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                u0Var.k();
                u0Var.i();
                u0Var.g();
                ((v0) obj4).a0();
                return;
            case 4:
                v0 v0Var = (v0) obj4;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj3;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                u0 u0Var2 = (u0) obj;
                v0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f28755id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    v0Var.f45270r.remove(wallettransaction2);
                    w10 w10Var = (w10) v0Var.f45269q.remove(wallettransaction2);
                    if (w10Var != null) {
                        w10Var.a(Boolean.FALSE);
                    }
                    if (nftitem != null && (m0Var = v0Var.f45267o) != null) {
                        m0.a(m0Var, wallettransaction2);
                    }
                    u0Var2.k();
                    u0Var2.i();
                    u0Var2.g();
                    v0Var.a0();
                    return;
                }
                return;
            case 5:
                m2.a((m2) obj4, (TL_wallet.tonConnectSession) obj3, (String) obj, (k) obj2);
                return;
            case 6:
                byte[] bArr2 = (byte[]) obj4;
                a31 a31Var = (a31) obj3;
                String str = (String) obj;
                di.x2 x2Var = (di.x2) obj2;
                if (bArr2 == null) {
                    a31Var.a(str);
                    return;
                } else {
                    x2Var.a(bArr2);
                    return;
                }
            case 7:
                m2 m2Var = (m2) obj4;
                h2 h2Var = (h2) obj3;
                k kVar = (k) obj2;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
                v0 v0Var2 = m2Var.f44649b;
                String y10 = v0Var2.y();
                byte[] E = v0Var2.E();
                if (E != null) {
                    bArr = (byte[]) E.clone();
                }
                ?? r11 = bArr;
                a31 a31Var2 = new a31(8, h2Var, kVar);
                if (y10 != null && r11 != 0) {
                    v0Var2.F(true, false, false, new di.s1(m2Var, a31Var2, tonconnectsession, y10, r11, h2Var, 2));
                    return;
                } else {
                    a31Var2.a("Wallet is not ready");
                    return;
                }
            case 8:
                m2 m2Var2 = (m2) obj4;
                s0 s0Var = (s0) obj3;
                i2 i2Var = (i2) obj2;
                a31 a31Var3 = (a31) obj;
                try {
                    jSONObject = WalletEngine2.signData(s0Var, i2Var.f44461a, i2Var.h, i2Var.f44466g, new JSONObject(i2Var.f44469k), m2.n(i2Var.f44461a.manifest.url), m2Var2.f44652f.getCurrentTime());
                    i7 = null;
                } catch (Exception e10) {
                    i7 = m2.i("sign data", e10);
                    jSONObject = null;
                }
                org.telegram.messenger.g0.g3(new bi.n2(m2Var2, i2Var, s0Var, a31Var3, jSONObject, i7, 24));
                return;
            case 9:
                z2 z2Var = (z2) obj4;
                hi.e eVar = (hi.e) obj3;
                int[] iArr = (int[]) obj2;
                hi.e eVar2 = (hi.e) obj;
                boolean a10 = z2Var.a();
                if (iArr[0] == 2) {
                    i10 = 2131742719;
                } else {
                    i10 = 2131742917;
                }
                eVar.setText(gd.N0(i10, null));
                if (!a10 && !z2Var.d && ((i11 = iArr[0]) == 1 || i11 == 2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar.setEnabled(z10);
                if (a10 || z2Var.d) {
                    z11 = false;
                }
                eVar2.setEnabled(z11);
                return;
            case 10:
                o6.i0((o6) obj4, (LinearLayout) obj3, (v0) obj2, (x60) obj);
                return;
            case 11:
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) obj2;
                w7 w7Var = (w7) obj;
                g gVar = ((v0) obj4).h;
                if (gVar.f() != null && !zArr[0]) {
                    y0Var.setSubtext(gVar.i());
                    w7Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) obj4).lambda$signMessage$13((p10) obj3, (String) obj, (String) obj2);
                return;
            case 13:
                ((WalletEngine2) obj4).lambda$decryptTransactionComment$48((String) obj, (byte[]) obj3, (p10) obj2);
                return;
            case 14:
                ((WalletEngine2) obj4).lambda$prepareRotateKey$38((byte[]) obj2, (String) obj, (t10) obj3);
                return;
            default:
                WalletEngine2.lambda$emulateSend$18((AtomicBoolean) obj4, (p10) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
        }
    }

    public w7(Object obj, Object obj2, String str, Object obj3, int i7) {
        this.f45340a = i7;
        this.f45341b = obj;
        this.d = obj2;
        this.f45342c = str;
        this.f45343e = obj3;
    }

    public w7(WalletEngine2 walletEngine2, String str, byte[] bArr, p10 p10Var) {
        this.f45340a = 13;
        this.f45341b = walletEngine2;
        this.f45342c = str;
        this.d = bArr;
        this.f45343e = p10Var;
    }

    public w7(WalletEngine2 walletEngine2, byte[] bArr, String str, t10 t10Var) {
        this.f45340a = 14;
        this.f45341b = walletEngine2;
        this.f45343e = bArr;
        this.f45342c = str;
        this.d = t10Var;
    }
}
