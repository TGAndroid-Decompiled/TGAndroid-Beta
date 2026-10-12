package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.mt;
public final class l6 implements Runnable {
    public final int f33441a;
    public final Object f33442b;
    public final Object f33443c;
    public final Object d;
    public final Object e;

    public l6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33441a = i10;
        this.f33442b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f33443c = obj4;
    }

    @Override
    public final void run() {
        b0 b0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f33441a) {
            case 0:
                ((WalletEngine2) this.f33442b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.e, (String) this.f33443c);
                return;
            case 1:
                ((WalletEngine2) this.f33442b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.e, (String) this.f33443c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f33442b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f33443c, (String) this.e);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.e;
                i0 i0Var = (i0) this.f33443c;
                ((g0) this.d).close();
                j0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                i0Var.h();
                i0Var.f();
                i0Var.d();
                ((j0) this.f33442b).P();
                return;
            case 4:
                j0 j0Var = (j0) this.f33442b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.e;
                i0 i0Var2 = (i0) this.f33443c;
                j0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f19476id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (b0Var = j0Var.f33330o) != null) {
                        b0.a(b0Var, wallettransaction2);
                    }
                    i0Var2.h();
                    i0Var2.f();
                    i0Var2.d();
                    j0Var.P();
                    return;
                }
                return;
            case 5:
                d2 d2Var = (d2) this.f33442b;
                y1 y1Var = (y1) this.d;
                j jVar = (j) this.e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f33443c;
                j0 j0Var2 = d2Var.f33041b;
                String r10 = j0Var2.r();
                byte[] w9 = j0Var2.w();
                if (w9 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w9.clone();
                }
                byte[] bArr2 = bArr;
                mt mtVar = new mt(27, y1Var, jVar);
                if (r10 != null && bArr2 != null) {
                    j0Var2.x(new g1(d2Var, mtVar, tonconnectsession, r10, bArr2, y1Var, 3), true, false);
                    return;
                } else {
                    mtVar.run("Wallet is not ready");
                    return;
                }
            case 6:
                d2.a((d2) this.f33442b, (TL_wallet.tonConnectSession) this.d, (String) this.f33443c, (j) this.e);
                return;
            case 7:
                byte[] bArr3 = (byte[]) this.f33442b;
                mt mtVar2 = (mt) this.d;
                String str = (String) this.f33443c;
                s1 s1Var = (s1) this.e;
                if (bArr3 == null) {
                    mtVar2.run(str);
                    return;
                } else {
                    s1Var.run(bArr3);
                    return;
                }
            case 8:
                d2 d2Var2 = (d2) this.f33442b;
                g0 g0Var = (g0) this.d;
                z1 z1Var = (z1) this.e;
                mt mtVar3 = (mt) this.f33443c;
                try {
                    jSONObject = WalletEngine2.signData(g0Var, z1Var.f33900a, z1Var.h, z1Var.f33904g, new JSONObject(z1Var.f33907k), d2.l(z1Var.f33900a.manifest.url), d2Var2.f33043f.getCurrentTime());
                    h = null;
                } catch (Exception e) {
                    h = d2.h("sign data", e);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new bi.k8(d2Var2, z1Var, g0Var, mtVar3, jSONObject, h, 16));
                return;
            case 9:
                z4.d0((z4) this.f33442b, (LinearLayout) this.d, (j0) this.e, (m80) this.f33443c);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                l6 l6Var = (l6) this.f33443c;
                f fVar = ((j0) this.f33442b).h;
                if (fVar.f() != null && !zArr[0]) {
                    e1Var.setSubtext(fVar.i());
                    l6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.f33442b).lambda$decryptTransactionComment$45((String) this.f33443c, (byte[]) this.d, (Utilities.Callback2) this.e);
                return;
            case 12:
                ((WalletEngine2) this.f33442b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f33443c, (String) this.e);
                return;
            case 13:
                ((WalletEngine2) this.f33442b).lambda$prepareRotateKey$35((byte[]) this.e, (String) this.f33443c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f33442b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.e, (String) this.f33443c);
                return;
        }
    }

    public l6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f33441a = i10;
        this.f33442b = obj;
        this.d = obj2;
        this.f33443c = str;
        this.e = obj3;
    }

    public l6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f33441a = 11;
        this.f33442b = walletEngine2;
        this.f33443c = str;
        this.d = bArr;
        this.e = callback2;
    }

    public l6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f33441a = 13;
        this.f33442b = walletEngine2;
        this.e = bArr;
        this.f33443c = str;
        this.d = callback4;
    }
}
