package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Wallet.WalletEngine2;
public final class w6 implements Runnable {
    public final int f35349a;
    public final Object f35350b;
    public final Object f35351c;
    public final Object d;
    public final Object e;

    public w6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35349a = i10;
        this.f35350b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35351c = obj4;
    }

    @Override
    public final void run() {
        d0 d0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f35349a) {
            case 0:
                ((WalletEngine2) this.f35350b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f35351c);
                return;
            case 1:
                ((WalletEngine2) this.f35350b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f35351c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f35350b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f35351c, (String) this.e);
                return;
            case 3:
                l0 l0Var = (l0) this.f35350b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                k0 k0Var = (k0) this.f35351c;
                l0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f20603id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) l0Var.f34756q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (d0Var = l0Var.f34754o) != null) {
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
                l0 l0Var2 = (l0) this.f35350b;
                boolean[] zArr = (boolean[]) this.d;
                ai.q qVar = (ai.q) this.e;
                d2 d2Var = (d2) this.f35351c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = l0Var2.f34744b;
                    if (walletEngine2 == null) {
                        qVar.run(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(d2Var, new ai.r5(27, zArr, qVar));
                        return;
                    }
                }
                return;
            case 5:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.e;
                k0 k0Var2 = (k0) this.f35351c;
                ((i0) this.d).close();
                l0.F("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                k0Var2.k();
                k0Var2.i();
                k0Var2.g();
                ((l0) this.f35350b).Q();
                return;
            case 6:
                e2 e2Var = (e2) this.f35350b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f35351c;
                l0 l0Var3 = e2Var.f34432b;
                String s10 = l0Var3.s();
                byte[] x10 = l0Var3.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                w wVar = new w(4, z1Var, kVar);
                if (s10 != null && bArr2 != null) {
                    l0Var3.y(new h1(e2Var, wVar, tonconnectsession, s10, bArr2, z1Var, 3), true, false);
                    return;
                } else {
                    wVar.run("Wallet is not ready");
                    return;
                }
            case 7:
                e2.a((e2) this.f35350b, (TL_wallet.tonConnectSession) this.d, (String) this.f35351c, (k) this.e);
                return;
            case 8:
                byte[] bArr3 = (byte[]) this.f35350b;
                w wVar2 = (w) this.d;
                String str = (String) this.f35351c;
                ai.r3 r3Var = (ai.r3) this.e;
                if (bArr3 == null) {
                    wVar2.run(str);
                    return;
                } else {
                    r3Var.run(bArr3);
                    return;
                }
            case 9:
                e2 e2Var2 = (e2) this.f35350b;
                i0 i0Var = (i0) this.d;
                a2 a2Var = (a2) this.e;
                w wVar3 = (w) this.f35351c;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, a2Var.f34274a, a2Var.h, a2Var.f34278g, new JSONObject(a2Var.f34281k), e2.l(a2Var.f34274a.manifest.url), e2Var2.f34434f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.g3(e2Var2, a2Var, i0Var, wVar3, jSONObject, h, 23));
                return;
            case 10:
                o5.f0((o5) this.f35350b, (LinearLayout) this.d, (l0) this.e, (h80) this.f35351c);
                return;
            case 11:
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                w6 w6Var = (w6) this.f35351c;
                f fVar = ((l0) this.f35350b).h;
                if (fVar.f() != null && !zArr2[0]) {
                    e1Var.setSubtext(fVar.i());
                    w6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) this.f35350b).lambda$decryptTransactionComment$45((String) this.f35351c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f35350b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f35351c, (String) this.e);
                return;
            case 14:
                ((WalletEngine2) this.f35350b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f35351c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f35350b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f35351c);
                return;
        }
    }

    public w6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f35349a = i10;
        this.f35350b = obj;
        this.d = obj2;
        this.f35351c = str;
        this.e = obj3;
    }

    public w6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35349a = 12;
        this.f35350b = walletEngine2;
        this.f35351c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public w6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f35349a = 14;
        this.f35350b = walletEngine2;
        this.e = bArr;
        this.f35351c = str;
        this.d = callback4;
    }
}
