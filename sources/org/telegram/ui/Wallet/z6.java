package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Wallet.WalletEngine2;
public final class z6 implements Runnable {
    public final int f35208a;
    public final Object f35209b;
    public final Object f35210c;
    public final Object d;
    public final Object e;

    public z6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35208a = i10;
        this.f35209b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35210c = obj4;
    }

    @Override
    public final void run() {
        e0 e0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f35208a) {
            case 0:
                ((WalletEngine2) this.f35209b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f35210c);
                return;
            case 1:
                ((WalletEngine2) this.f35209b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f35210c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f35209b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f35210c, (String) this.e);
                return;
            case 3:
                m0 m0Var = (m0) this.f35209b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                l0 l0Var = (l0) this.f35210c;
                m0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f20531id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) m0Var.f34564q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (e0Var = m0Var.f34562o) != null) {
                        e0.a(e0Var, wallettransaction);
                    }
                    l0Var.j();
                    l0Var.h();
                    l0Var.f();
                    m0Var.Q();
                    return;
                }
                return;
            case 4:
                m0 m0Var2 = (m0) this.f35209b;
                boolean[] zArr = (boolean[]) this.d;
                ai.q qVar = (ai.q) this.e;
                e2 e2Var = (e2) this.f35210c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = m0Var2.f34552b;
                    if (walletEngine2 == null) {
                        qVar.run(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(e2Var, new ai.q5(27, zArr, qVar));
                        return;
                    }
                }
                return;
            case 5:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.e;
                l0 l0Var2 = (l0) this.f35210c;
                ((j0) this.d).close();
                m0.F("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                l0Var2.j();
                l0Var2.h();
                l0Var2.f();
                ((m0) this.f35209b).Q();
                return;
            case 6:
                f2 f2Var = (f2) this.f35209b;
                a2 a2Var = (a2) this.d;
                l lVar = (l) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f35210c;
                m0 m0Var3 = f2Var.f34192b;
                String s10 = m0Var3.s();
                byte[] x10 = m0Var3.x();
                if (x10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) x10.clone();
                }
                byte[] bArr2 = bArr;
                x xVar = new x(4, a2Var, lVar);
                if (s10 != null && bArr2 != null) {
                    m0Var3.y(new i1(f2Var, xVar, tonconnectsession, s10, bArr2, a2Var, 3), true, false);
                    return;
                } else {
                    xVar.run("Wallet is not ready");
                    return;
                }
            case 7:
                f2.a((f2) this.f35209b, (TL_wallet.tonConnectSession) this.d, (String) this.f35210c, (l) this.e);
                return;
            case 8:
                byte[] bArr3 = (byte[]) this.f35209b;
                x xVar2 = (x) this.d;
                String str = (String) this.f35210c;
                ai.q3 q3Var = (ai.q3) this.e;
                if (bArr3 == null) {
                    xVar2.run(str);
                    return;
                } else {
                    q3Var.run(bArr3);
                    return;
                }
            case 9:
                f2 f2Var2 = (f2) this.f35209b;
                j0 j0Var = (j0) this.d;
                b2 b2Var = (b2) this.e;
                x xVar3 = (x) this.f35210c;
                try {
                    jSONObject = WalletEngine2.signData(j0Var, b2Var.f34019a, b2Var.h, b2Var.f34023g, new JSONObject(b2Var.f34026k), f2.l(b2Var.f34019a.manifest.url), f2Var2.f34194f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = f2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.l3(f2Var2, b2Var, j0Var, xVar3, jSONObject, h, 23));
                return;
            case 10:
                l5.d0((l5) this.f35209b, (LinearLayout) this.d, (m0) this.e, (i80) this.f35210c);
                return;
            case 11:
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                z6 z6Var = (z6) this.f35210c;
                f fVar = ((m0) this.f35209b).h;
                if (fVar.f() != null && !zArr2[0]) {
                    e1Var.setSubtext(fVar.i());
                    z6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) this.f35209b).lambda$decryptTransactionComment$45((String) this.f35210c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f35209b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f35210c, (String) this.e);
                return;
            case 14:
                ((WalletEngine2) this.f35209b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f35210c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f35209b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f35210c);
                return;
        }
    }

    public z6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f35208a = i10;
        this.f35209b = obj;
        this.d = obj2;
        this.f35210c = str;
        this.e = obj3;
    }

    public z6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35208a = 12;
        this.f35209b = walletEngine2;
        this.f35210c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public z6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f35208a = 14;
        this.f35209b = walletEngine2;
        this.e = bArr;
        this.f35210c = str;
        this.d = callback4;
    }
}
