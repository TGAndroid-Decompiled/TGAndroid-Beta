package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Wallet.WalletEngine2;
public final class w6 implements Runnable {
    public final int f37463a;
    public final Object f37464b;
    public final Object f37465c;
    public final Object d;
    public final Object e;

    public w6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37463a = i10;
        this.f37464b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37465c = obj4;
    }

    @Override
    public final void run() {
        d0 d0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f37463a) {
            case 0:
                ((WalletEngine2) this.f37464b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f37465c);
                return;
            case 1:
                ((WalletEngine2) this.f37464b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f37465c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f37464b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f37465c, (String) this.e);
                return;
            case 3:
                l0 l0Var = (l0) this.f37464b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                k0 k0Var = (k0) this.f37465c;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f22292id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) l0Var.f36847q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.f36845o) != null) {
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
                l0 l0Var2 = (l0) this.f37464b;
                boolean[] zArr = (boolean[]) this.d;
                ai.e eVar = (ai.e) this.e;
                d2 d2Var = (d2) this.f37465c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.f36835b;
                    if (walletEngine2 == null) {
                        eVar.run(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new bi.m5(27, zArr, eVar));
                        return;
                    }
                }
                return;
            case 5:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.e;
                k0 k0Var2 = (k0) this.f37465c;
                ((i0) this.d).close();
                l0.H("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                ((l0) this.f37464b).S();
                return;
            case 6:
                e2 e2Var = (e2) this.f37464b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f37465c;
                l0 l0Var3 = e2Var.f36514b;
                String t10 = l0Var3.t();
                byte[] y3 = l0Var3.y();
                if (y3 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) y3.clone();
                }
                byte[] bArr2 = bArr;
                s sVar = new s(6, z1Var, kVar);
                if (t10 != null && bArr2 != null) {
                    l0Var3.z(new h1(e2Var, sVar, tonconnectsession, t10, bArr2, z1Var, 3), true, false);
                    return;
                } else {
                    sVar.run("Wallet is not ready");
                    return;
                }
            case 7:
                e2.a((e2) this.f37464b, (TL_wallet.tonConnectSession) this.d, (String) this.f37465c, (k) this.e);
                return;
            case 8:
                byte[] bArr3 = (byte[]) this.f37464b;
                s sVar2 = (s) this.d;
                String str = (String) this.f37465c;
                bi.n3 n3Var = (bi.n3) this.e;
                if (bArr3 == null) {
                    sVar2.run(str);
                    return;
                } else {
                    n3Var.run(bArr3);
                    return;
                }
            case 9:
                e2 e2Var2 = (e2) this.f37464b;
                i0 i0Var = (i0) this.d;
                a2 a2Var = (a2) this.e;
                s sVar3 = (s) this.f37465c;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, a2Var.f36361a, a2Var.h, a2Var.f36365g, new JSONObject(a2Var.f36368k), e2.l(a2Var.f36361a.manifest.url), e2Var2.f36516f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.c3(e2Var2, a2Var, i0Var, sVar3, jSONObject, h, 23));
                return;
            case 10:
                m5.g0((m5) this.f37464b, (LinearLayout) this.d, (l0) this.e, (l80) this.f37465c);
                return;
            case 11:
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                w6 w6Var = (w6) this.f37465c;
                f fVar = ((l0) this.f37464b).h;
                if (fVar.f() != null && !zArr2[0]) {
                    g1Var.setSubtext(fVar.i());
                    w6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) this.f37464b).lambda$decryptTransactionComment$45((String) this.f37465c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f37464b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f37465c, (String) this.e);
                return;
            case 14:
                ((WalletEngine2) this.f37464b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f37465c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f37464b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f37465c);
                return;
        }
    }

    public w6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f37463a = i10;
        this.f37464b = obj;
        this.d = obj2;
        this.f37465c = str;
        this.e = obj3;
    }

    public w6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f37463a = 12;
        this.f37464b = walletEngine2;
        this.f37465c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public w6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f37463a = 14;
        this.f37464b = walletEngine2;
        this.e = bArr;
        this.f37465c = str;
        this.d = callback4;
    }
}
