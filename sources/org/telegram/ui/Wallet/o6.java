package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.et;
public final class o6 implements Runnable {
    public final int f35404a;
    public final Object f35405b;
    public final Object f35406c;
    public final Object d;
    public final Object f35407e;

    public o6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35404a = i10;
        this.f35405b = obj;
        this.d = obj2;
        this.f35407e = obj3;
        this.f35406c = obj4;
    }

    @Override
    public final void run() {
        d0 d0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f35404a) {
            case 0:
                ((WalletEngine2) this.f35405b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.f35407e, (String) this.f35406c);
                return;
            case 1:
                ((WalletEngine2) this.f35405b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.f35407e, (String) this.f35406c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f35405b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f35406c, (String) this.f35407e);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35407e;
                k0 k0Var = (k0) this.f35406c;
                ((i0) this.d).close();
                l0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                k0Var.h();
                k0Var.f();
                k0Var.d();
                ((l0) this.f35405b).P();
                return;
            case 4:
                l0 l0Var = (l0) this.f35405b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f35407e;
                k0 k0Var2 = (k0) this.f35406c;
                l0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f20330id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (d0Var = l0Var.f35231o) != null) {
                        d0.a(d0Var, wallettransaction2);
                    }
                    k0Var2.h();
                    k0Var2.f();
                    k0Var2.d();
                    l0Var.P();
                    return;
                }
                return;
            case 5:
                f2 f2Var = (f2) this.f35405b;
                a2 a2Var = (a2) this.d;
                l lVar = (l) this.f35407e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f35406c;
                l0 l0Var2 = f2Var.f34925b;
                String r10 = l0Var2.r();
                byte[] w10 = l0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                et etVar = new et(27, a2Var, lVar);
                if (r10 != null && bArr2 != null) {
                    l0Var2.x(new i1(f2Var, etVar, tonconnectsession, r10, bArr2, a2Var, 3), true, false);
                    return;
                } else {
                    etVar.run("Wallet is not ready");
                    return;
                }
            case 6:
                f2.a((f2) this.f35405b, (TL_wallet.tonConnectSession) this.d, (String) this.f35406c, (l) this.f35407e);
                return;
            case 7:
                byte[] bArr3 = (byte[]) this.f35405b;
                et etVar2 = (et) this.d;
                String str = (String) this.f35406c;
                u1 u1Var = (u1) this.f35407e;
                if (bArr3 == null) {
                    etVar2.run(str);
                    return;
                } else {
                    u1Var.run(bArr3);
                    return;
                }
            case 8:
                f2 f2Var2 = (f2) this.f35405b;
                i0 i0Var = (i0) this.d;
                b2 b2Var = (b2) this.f35407e;
                et etVar3 = (et) this.f35406c;
                try {
                    jSONObject = WalletEngine2.signData(i0Var, b2Var.f34710a, b2Var.h, b2Var.f34715g, new JSONObject(b2Var.f34718k), f2.l(b2Var.f34710a.manifest.url), f2Var2.f34928f.getCurrentTime());
                    h = null;
                } catch (Exception e7) {
                    h = f2.h("sign data", e7);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.a9(f2Var2, b2Var, i0Var, etVar3, jSONObject, h, 16));
                return;
            case 9:
                c5.d0((c5) this.f35405b, (LinearLayout) this.d, (l0) this.f35407e, (p80) this.f35406c);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f35407e;
                o6 o6Var = (o6) this.f35406c;
                f fVar = ((l0) this.f35405b).h;
                if (fVar.f() != null && !zArr[0]) {
                    e1Var.setSubtext(fVar.i());
                    o6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.f35405b).lambda$decryptTransactionComment$45((String) this.f35406c, (byte[]) this.d, (Utilities.Callback2) this.f35407e);
                return;
            case 12:
                ((WalletEngine2) this.f35405b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f35406c, (String) this.f35407e);
                return;
            case 13:
                ((WalletEngine2) this.f35405b).lambda$prepareRotateKey$35((byte[]) this.f35407e, (String) this.f35406c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f35405b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.f35407e, (String) this.f35406c);
                return;
        }
    }

    public o6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f35404a = i10;
        this.f35405b = obj;
        this.d = obj2;
        this.f35406c = str;
        this.f35407e = obj3;
    }

    public o6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35404a = 11;
        this.f35405b = walletEngine2;
        this.f35406c = str;
        this.d = bArr;
        this.f35407e = callback2;
    }

    public o6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f35404a = 13;
        this.f35405b = walletEngine2;
        this.f35407e = bArr;
        this.f35406c = str;
        this.d = callback4;
    }
}
