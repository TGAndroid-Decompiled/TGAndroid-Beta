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
import org.telegram.ui.ft;
public final class m6 implements Runnable {
    public final int f35247a;
    public final Object f35248b;
    public final Object f35249c;
    public final Object d;
    public final Object f35250e;

    public m6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35247a = i10;
        this.f35248b = obj;
        this.d = obj2;
        this.f35250e = obj3;
        this.f35249c = obj4;
    }

    @Override
    public final void run() {
        c0 c0Var;
        byte[] bArr;
        String h;
        JSONObject jSONObject;
        switch (this.f35247a) {
            case 0:
                ((WalletEngine2) this.f35248b).lambda$prepareRotateKey$34((Utilities.Callback4) this.d, (WalletEngine2.PreparedRotation) this.f35250e, (String) this.f35249c);
                return;
            case 1:
                ((WalletEngine2) this.f35248b).lambda$rotateKey$52((WalletEngine2.RotationCallbacks) this.d, (byte[]) this.f35250e, (String) this.f35249c);
                return;
            case 2:
                ((WalletEngine2.SendCallbacks) this.f35248b).lambda$dispatch$0((WalletEngine2.SendPhase) this.d, (String) this.f35249c, (String) this.f35250e);
                return;
            case 3:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f35250e;
                j0 j0Var = (j0) this.f35249c;
                ((h0) this.d).close();
                k0.E("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                j0Var.h();
                j0Var.f();
                j0Var.d();
                ((k0) this.f35248b).P();
                return;
            case 4:
                k0 k0Var = (k0) this.f35248b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f35250e;
                j0 j0Var2 = (j0) this.f35249c;
                k0Var.getClass();
                if (wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.f20300id)) {
                    wallettransaction2.pending = false;
                    wallettransaction2.failed = true;
                    if (nftitem != null && (c0Var = k0Var.f35129o) != null) {
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
                d2 d2Var = (d2) this.f35248b;
                y1 y1Var = (y1) this.d;
                j jVar = (j) this.f35250e;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.f35249c;
                k0 k0Var2 = d2Var.f34768b;
                String r10 = k0Var2.r();
                byte[] w10 = k0Var2.w();
                if (w10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) w10.clone();
                }
                byte[] bArr2 = bArr;
                ft ftVar = new ft(27, y1Var, jVar);
                if (r10 != null && bArr2 != null) {
                    k0Var2.x(new g1(d2Var, ftVar, tonconnectsession, r10, bArr2, y1Var, 3), true, false);
                    return;
                } else {
                    ftVar.run("Wallet is not ready");
                    return;
                }
            case 6:
                d2.a((d2) this.f35248b, (TL_wallet.tonConnectSession) this.d, (String) this.f35249c, (j) this.f35250e);
                return;
            case 7:
                byte[] bArr3 = (byte[]) this.f35248b;
                ft ftVar2 = (ft) this.d;
                String str = (String) this.f35249c;
                s1 s1Var = (s1) this.f35250e;
                if (bArr3 == null) {
                    ftVar2.run(str);
                    return;
                } else {
                    s1Var.run(bArr3);
                    return;
                }
            case 8:
                d2 d2Var2 = (d2) this.f35248b;
                h0 h0Var = (h0) this.d;
                z1 z1Var = (z1) this.f35250e;
                ft ftVar3 = (ft) this.f35249c;
                try {
                    jSONObject = WalletEngine2.signData(h0Var, z1Var.f35720a, z1Var.h, z1Var.f35725g, new JSONObject(z1Var.f35728k), d2.l(z1Var.f35720a.manifest.url), d2Var2.f34771f.getCurrentTime());
                    h = null;
                } catch (Exception e7) {
                    h = d2.h("sign data", e7);
                    jSONObject = null;
                }
                AndroidUtilities.runOnUIThread(new ai.a9(d2Var2, z1Var, h0Var, ftVar3, jSONObject, h, 16));
                return;
            case 9:
                a5.d0((a5) this.f35248b, (LinearLayout) this.d, (k0) this.f35250e, (p80) this.f35249c);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f35250e;
                m6 m6Var = (m6) this.f35249c;
                f fVar = ((k0) this.f35248b).h;
                if (fVar.f() != null && !zArr[0]) {
                    f1Var.setSubtext(fVar.i());
                    m6Var.run();
                    zArr[0] = true;
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.f35248b).lambda$decryptTransactionComment$45((String) this.f35249c, (byte[]) this.d, (Utilities.Callback2) this.f35250e);
                return;
            case 12:
                ((WalletEngine2) this.f35248b).lambda$signMessage$10((Utilities.Callback2) this.d, (String) this.f35249c, (String) this.f35250e);
                return;
            case 13:
                ((WalletEngine2) this.f35248b).lambda$prepareRotateKey$35((byte[]) this.f35250e, (String) this.f35249c, (Utilities.Callback4) this.d);
                return;
            default:
                WalletEngine2.lambda$emulateSend$15((AtomicBoolean) this.f35248b, (Utilities.Callback2) this.d, (TL_wallet.walletTransaction) this.f35250e, (String) this.f35249c);
                return;
        }
    }

    public m6(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f35247a = i10;
        this.f35248b = obj;
        this.d = obj2;
        this.f35249c = str;
        this.f35250e = obj3;
    }

    public m6(WalletEngine2 walletEngine2, String str, byte[] bArr, Utilities.Callback2 callback2) {
        this.f35247a = 11;
        this.f35248b = walletEngine2;
        this.f35249c = str;
        this.d = bArr;
        this.f35250e = callback2;
    }

    public m6(WalletEngine2 walletEngine2, byte[] bArr, String str, Utilities.Callback4 callback4) {
        this.f35247a = 13;
        this.f35248b = walletEngine2;
        this.f35250e = bArr;
        this.f35249c = str;
        this.d = callback4;
    }
}
