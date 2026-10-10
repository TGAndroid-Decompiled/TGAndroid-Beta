package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ft;
public final class n6 implements Runnable {
    public final int f35340a;
    public final Object f35341b;
    public final Object f35342c;
    public final Object d;
    public final Object f35343e;

    public n6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35340a = i10;
        this.f35341b = obj;
        this.d = obj2;
        this.f35343e = obj3;
        this.f35342c = obj4;
    }

    @Override
    public final void run() {
        c0 c0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f35340a) {
            case 0:
                ((WalletEngine2) this.f35341b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.f35343e, (String) this.f35342c);
                return;
            case 1:
                ((WalletEngine2) this.f35341b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.f35343e, (String) this.f35342c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f35341b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f35342c, (String) this.f35343e);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35343e;
                j0 j0Var = (j0) this.f35342c;
                ((h0) this.d).close();
                k0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                j0Var.h();
                j0Var.f();
                j0Var.d();
                ((k0) this.f35341b).P();
                return;
            case 4:
                k0 k0Var = (k0) this.f35341b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f35343e;
                j0 j0Var2 = (j0) this.f35342c;
                k0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f20304id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (c0Var = k0Var.f35167o) != null) {
                        c0.a(c0Var, wallettransaction2);
                    }
                    j0Var2.h();
                    j0Var2.f();
                    j0Var2.d();
                    k0Var.P();
                    return;
                }
                return;
            case 5:
                e2 e2Var = (e2) this.f35341b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.f35343e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f35342c;
                k0 k0Var2 = e2Var.f34859b;
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                ft ftVar = new ft(27, z1Var, kVar);
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new h1(e2Var, ftVar, tonconnectsession, r10, bArr2, z1Var, 3), true, false);
                    return;
                } else {
                    ftVar.run("Wallet is not ready");
                    return;
                }
            case 6:
                e2.a((e2) this.f35341b, (TL_wallet.tonConnectSession) this.d, (String) this.f35342c, (k) this.f35343e);
                return;
            case 7:
                byte[] bArr3 = (byte[]) this.f35341b;
                ft ftVar2 = (ft) this.d;
                String str = (String) this.f35342c;
                t1 t1Var = (t1) this.f35343e;
                if (bArr3 == null) {
                    ftVar2.run(str);
                    return;
                } else {
                    t1Var.run(bArr3);
                    return;
                }
            case 8:
                e2 e2Var2 = (e2) this.f35341b;
                h0 h0Var = (h0) this.d;
                a2 a2Var = (a2) this.f35343e;
                ft ftVar3 = (ft) this.f35342c;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, a2Var.f34648a, a2Var.h, a2Var.f34653g, new JSONObject(a2Var.f34656k), e2.l(a2Var.f34648a.manifest.url), e2Var2.f34862f.getCurrentTime());
                    h = null;
                } catch (Exception e7) {
                    h = e2.h("sign data", e7);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.a9(e2Var2, a2Var, h0Var, ftVar3, jSONObject, h, 16));
                return;
            case 9:
                b5.d0((b5) this.f35341b, (LinearLayout) this.d, (k0) this.f35343e, (q80) this.f35342c);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f35343e;
                n6 n6Var = (n6) this.f35342c;
                f fVar = ((k0) this.f35341b).h;
                if (fVar.f() != null && !zArr[0]) {
                    f1Var.setSubtext(fVar.i());
                    n6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.f35341b).lambda$decryptTransactionComment$45((String) this.f35342c, (byte[]) this.d, (Utilities.Callback2) this.f35343e);
                return;
            case 12:
                ((WalletEngine2) this.f35341b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f35342c, (String) this.f35343e);
                return;
            case 13:
                ((WalletEngine2) this.f35341b).lambda$prepareRotateKey$35((byte[]) this.f35343e, (String) this.f35342c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f35341b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.f35343e, (String) this.f35342c);
                return;
        }
    }

    public n6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f35340a = i10;
        this.f35341b = obj;
        this.d = obj2;
        this.f35342c = str;
        this.f35343e = obj3;
    }

    public n6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35340a = 11;
        this.f35341b = walletEngine2;
        this.f35342c = str;
        this.d = bArr;
        this.f35343e = callback2;
    }

    public n6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f35340a = 13;
        this.f35341b = walletEngine2;
        this.f35343e = bArr;
        this.f35342c = str;
        this.d = callback4;
    }
}
