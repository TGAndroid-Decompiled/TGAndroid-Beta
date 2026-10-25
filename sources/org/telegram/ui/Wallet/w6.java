package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Wallet.WalletEngine2;
public final class w6 implements Runnable {
    public final int f37436a;
    public final Object f37437b;
    public final Object f37438c;
    public final Object d;
    public final Object e;

    public w6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37436a = i10;
        this.f37437b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37438c = obj4;
    }

    @Override
    public final void run() {
        d0 d0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f37436a) {
            case 0:
                ((WalletEngine2) this.f37437b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f37438c);
                return;
            case 1:
                ((WalletEngine2) this.f37437b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f37438c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f37437b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f37438c, (String) this.e);
                return;
            case 3:
                l0 l0Var = (l0) this.f37437b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                k0 k0Var = (k0) this.f37438c;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f22289id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) l0Var.f36817q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.f36815o) != null) {
                        d0.a(d0Var, wallettransaction);
                    }
                    k0Var.k();
                    k0Var.i();
                    k0Var.g();
                    l0Var.Q();
                    return;
                }
                return;
            case 4:
                l0 l0Var2 = (l0) this.f37437b;
                boolean[] zArr = (boolean[]) this.d;
                ai.e eVar = (ai.e) this.e;
                d2 d2Var = (d2) this.f37438c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.f36805b;
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
                k0 k0Var2 = (k0) this.f37438c;
                ((i0) this.d).close();
                l0.F("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                ((l0) this.f37437b).Q();
                return;
            case 6:
                e2 e2Var = (e2) this.f37437b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f37438c;
                l0 l0Var3 = e2Var.f36504b;
                String s10 = l0Var3.s();
                byte[] x9 = l0Var3.x();
                if (x9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x9.clone();
                }
                byte[] bArr2 = bArr;
                s sVar = new s(6, z1Var, kVar);
                if (s10 != null && bArr2 != null) {
                    l0Var3.y(new h1(e2Var, sVar, tonconnectsession, s10, bArr2, z1Var, 3), true, false);
                    return;
                } else {
                    sVar.run("Wallet is not ready");
                    return;
                }
            case 7:
                e2.a((e2) this.f37437b, (TL_wallet.tonConnectSession) this.d, (String) this.f37438c, (k) this.e);
                return;
            case 8:
                byte[] bArr3 = (byte[]) this.f37437b;
                s sVar2 = (s) this.d;
                String str = (String) this.f37438c;
                bi.n3 n3Var = (bi.n3) this.e;
                if (bArr3 == null) {
                    sVar2.run(str);
                    return;
                } else {
                    n3Var.run(bArr3);
                    return;
                }
            case 9:
                e2 e2Var2 = (e2) this.f37437b;
                i0 i0Var = (i0) this.d;
                a2 a2Var = (a2) this.e;
                s sVar3 = (s) this.f37438c;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, a2Var.f36334a, a2Var.h, a2Var.f36338g, new JSONObject(a2Var.f36341k), e2.l(a2Var.f36334a.manifest.url), e2Var2.f36506f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.c3(e2Var2, a2Var, i0Var, sVar3, jSONObject, h, 23));
                return;
            case 10:
                m5.g0((m5) this.f37437b, (LinearLayout) this.d, (l0) this.e, (k80) this.f37438c);
                return;
            case 11:
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                w6 w6Var = (w6) this.f37438c;
                f fVar = ((l0) this.f37437b).h;
                if (fVar.f() != null && !zArr2[0]) {
                    g1Var.setSubtext(fVar.i());
                    w6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) this.f37437b).lambda$decryptTransactionComment$45((String) this.f37438c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f37437b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f37438c, (String) this.e);
                return;
            case 14:
                ((WalletEngine2) this.f37437b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f37438c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f37437b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f37438c);
                return;
        }
    }

    public w6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f37436a = i10;
        this.f37437b = obj;
        this.d = obj2;
        this.f37438c = str;
        this.e = obj3;
    }

    public w6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f37436a = 12;
        this.f37437b = walletEngine2;
        this.f37438c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public w6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f37436a = 14;
        this.f37437b = walletEngine2;
        this.e = bArr;
        this.f37438c = str;
        this.d = callback4;
    }
}
