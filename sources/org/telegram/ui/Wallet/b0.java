package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f42159a;
    public Runnable f42160b;
    public final String f42161c;
    public final TL_wallet.nftItem d;
    public final String f42162e;
    public final v10 f42163f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, v10 v10Var) {
        this.h = l0Var;
        this.f42161c = str;
        this.d = nftitem;
        this.f42162e = str2;
        this.f42163f = v10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f42159a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f42750b;
                String str = this.f42161c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f42162e;
                this.f42160b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f42163f, 4));
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
