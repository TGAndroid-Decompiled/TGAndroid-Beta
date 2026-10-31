package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f34156a;
    public Runnable f34157b;
    public final String f34158c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final j20 f34159f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, j20 j20Var) {
        this.h = k0Var;
        this.f34158c = str;
        this.d = nftitem;
        this.e = str2;
        this.f34159f = j20Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34156a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34777b;
                String str = this.f34158c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f34157b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f34159f, 4));
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
