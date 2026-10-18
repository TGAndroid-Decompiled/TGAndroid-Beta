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
public final class c7 implements Runnable {
    public final int f34097a;
    public final Object f34098b;
    public final Object f34099c;
    public final Object d;
    public final Object e;

    public c7(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34097a = i10;
        this.f34098b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f34099c = obj4;
    }

    @Override
    public final void run() {
        e0 e0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f34097a) {
            case 0:
                ((WalletEngine2) this.f34098b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f34099c);
                return;
            case 1:
                ((WalletEngine2) this.f34098b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f34099c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f34098b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f34099c, (String) this.e);
                return;
            case 3:
                m0 m0Var = (m0) this.f34098b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                l0 l0Var = (l0) this.f34099c;
                m0Var.getClass();
                if (wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.f20538id)) {
                    wallettransaction.pending = false;
                    wallettransaction.failed = true;
                    Utilities.Callback callback = (Utilities.Callback) m0Var.f34543q.remove(wallettransaction);
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    if (nftitem != null && (e0Var = m0Var.f34541o) != null) {
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
                m0 m0Var2 = (m0) this.f34098b;
                boolean[] zArr = (boolean[]) this.d;
                ai.q qVar = (ai.q) this.e;
                e2 e2Var = (e2) this.f34099c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = m0Var2.f34531b;
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
                l0 l0Var2 = (l0) this.f34099c;
                ((j0) this.d).close();
                m0.F("disable backup: fail!");
                wallettransaction2.pending = false;
                wallettransaction2.failed = true;
                l0Var2.j();
                l0Var2.h();
                l0Var2.f();
                ((m0) this.f34098b).Q();
                return;
            case 6:
                f2 f2Var = (f2) this.f34098b;
                a2 a2Var = (a2) this.d;
                l lVar = (l) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f34099c;
                m0 m0Var3 = f2Var.f34224b;
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
                f2.a((f2) this.f34098b, (TL_wallet.tonConnectSession) this.d, (String) this.f34099c, (l) this.e);
                return;
            case 8:
                byte[] bArr3 = (byte[]) this.f34098b;
                x xVar2 = (x) this.d;
                String str = (String) this.f34099c;
                ai.p3 p3Var = (ai.p3) this.e;
                if (bArr3 == null) {
                    xVar2.run(str);
                    return;
                } else {
                    p3Var.run(bArr3);
                    return;
                }
            case 9:
                f2 f2Var2 = (f2) this.f34098b;
                j0 j0Var = (j0) this.d;
                b2 b2Var = (b2) this.e;
                x xVar3 = (x) this.f34099c;
                try {
                    jSONObject = WalletEngine2.signData(j0Var, b2Var.f34016a, b2Var.h, b2Var.f34020g, new JSONObject(b2Var.f34023k), f2.l(b2Var.f34016a.manifest.url), f2Var2.f34226f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = f2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.l3(f2Var2, b2Var, j0Var, xVar3, jSONObject, h, 23));
                return;
            case 10:
                m5.d0((m5) this.f34098b, (LinearLayout) this.d, (m0) this.e, (i80) this.f34099c);
                return;
            case 11:
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                c7 c7Var = (c7) this.f34099c;
                f fVar = ((m0) this.f34098b).h;
                if (fVar.f() != null && !zArr2[0]) {
                    e1Var.setSubtext(fVar.i());
                    c7Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 12:
                ((WalletEngine2) this.f34098b).lambda$decryptTransactionComment$45((String) this.f34099c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f34098b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f34099c, (String) this.e);
                return;
            case 14:
                ((WalletEngine2) this.f34098b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f34099c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f34098b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f34099c);
                return;
        }
    }

    public c7(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f34097a = i10;
        this.f34098b = obj;
        this.d = obj2;
        this.f34099c = str;
        this.e = obj3;
    }

    public c7(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f34097a = 12;
        this.f34098b = walletEngine2;
        this.f34099c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public c7(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f34097a = 14;
        this.f34098b = walletEngine2;
        this.e = bArr;
        this.f34099c = str;
        this.d = callback4;
    }
}
