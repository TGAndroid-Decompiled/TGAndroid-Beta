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
import org.telegram.ui.mt;
public final class m6 implements Runnable {
    public final int f33210a;
    public final Object f33211b;
    public final Object f33212c;
    public final Object d;
    public final Object e;

    public m6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33210a = i10;
        this.f33211b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f33212c = obj4;
    }

    @Override
    public final void run() {
        c0 c0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f33210a) {
            case 0:
                ((WalletEngine2) this.f33211b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f33212c);
                return;
            case 1:
                ((WalletEngine2) this.f33211b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f33212c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f33211b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f33212c, (String) this.e);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.e;
                j0 j0Var = (j0) this.f33212c;
                ((h0) this.d).close();
                k0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                j0Var.h();
                j0Var.f();
                j0Var.d();
                ((k0) this.f33211b).P();
                return;
            case 4:
                k0 k0Var = (k0) this.f33211b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                j0 j0Var2 = (j0) this.f33212c;
                k0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f19176id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (c0Var = k0Var.f33103o) != null) {
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
                e2 e2Var = (e2) this.f33211b;
                z1 z1Var = (z1) this.d;
                k kVar = (k) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f33212c;
                k0 k0Var2 = e2Var.f32818b;
                String r10 = k0Var2.r();
                byte[] w9 = k0Var2.w();
                if (w9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w9.clone();
                }
                byte[] bArr2 = bArr;
                mt mtVar = new mt(27, z1Var, kVar);
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new h1(e2Var, mtVar, tonconnectsession, r10, bArr2, z1Var, 3), true, false);
                    return;
                } else {
                    mtVar.run("Wallet is not ready");
                    return;
                }
            case 6:
                e2.a((e2) this.f33211b, (TL_wallet.tonConnectSession) this.d, (String) this.f33212c, (k) this.e);
                return;
            case 7:
                byte[] bArr3 = (byte[]) this.f33211b;
                mt mtVar2 = (mt) this.d;
                String str = (String) this.f33212c;
                t1 t1Var = (t1) this.e;
                if (bArr3 == null) {
                    mtVar2.run(str);
                    return;
                } else {
                    t1Var.run(bArr3);
                    return;
                }
            case 8:
                e2 e2Var2 = (e2) this.f33211b;
                h0 h0Var = (h0) this.d;
                a2 a2Var = (a2) this.e;
                mt mtVar3 = (mt) this.f33212c;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, a2Var.f32617a, a2Var.h, a2Var.f32621g, new JSONObject(a2Var.f32624k), e2.l(a2Var.f32617a.manifest.url), e2Var2.f32820f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = e2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.k8(e2Var2, a2Var, h0Var, mtVar3, jSONObject, h, 16));
                return;
            case 9:
                a5.d0((a5) this.f33211b, (LinearLayout) this.d, (k0) this.e, (l80) this.f33212c);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                m6 m6Var = (m6) this.f33212c;
                f fVar = ((k0) this.f33211b).h;
                if (fVar.f() != null && !zArr[0]) {
                    e1Var.setSubtext(fVar.i());
                    m6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.f33211b).lambda$decryptTransactionComment$45((String) this.f33212c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 12:
                ((WalletEngine2) this.f33211b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f33212c, (String) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f33211b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f33212c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f33211b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f33212c);
                return;
        }
    }

    public m6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f33210a = i10;
        this.f33211b = obj;
        this.d = obj2;
        this.f33212c = str;
        this.e = obj3;
    }

    public m6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33210a = 11;
        this.f33211b = walletEngine2;
        this.f33212c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public m6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f33210a = 13;
        this.f33211b = walletEngine2;
        this.e = bArr;
        this.f33212c = str;
        this.d = callback4;
    }
}
