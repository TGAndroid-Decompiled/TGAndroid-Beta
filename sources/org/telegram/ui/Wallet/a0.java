package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f34163a;
    public Runnable f34164b;
    public final String f34165c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final k20 f34166f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, k20 k20Var) {
        this.h = k0Var;
        this.f34165c = str;
        this.d = nftitem;
        this.e = str2;
        this.f34166f = k20Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34163a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34782b;
                String str = this.f34165c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f34164b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f34166f, 4));
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
