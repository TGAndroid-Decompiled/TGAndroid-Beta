package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f42116a;
    public Runnable f42117b;
    public final String f42118c;
    public final TL_wallet.nftItem d;
    public final String f42119e;
    public final n10 f42120f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, n10 n10Var) {
        this.h = k0Var;
        this.f42118c = str;
        this.d = nftitem;
        this.f42119e = str2;
        this.f42120f = n10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f42116a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f42719b;
                String str = this.f42118c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f42119e;
                this.f42117b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f42120f, 4));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
