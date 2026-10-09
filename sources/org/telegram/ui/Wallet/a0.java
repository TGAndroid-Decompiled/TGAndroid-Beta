package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f34603a;
    public Runnable f34604b;
    public final String f34605c;
    public final TL_wallet.nftItem d;
    public final String f34606e;
    public final Utilities.Callback2 f34607f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = k0Var;
        this.f34605c = str;
        this.d = nftitem;
        this.f34606e = str2;
        this.f34607f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34603a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f35094b;
                String str = this.f34605c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f34606e;
                this.f34604b = walletEngine2.emulateSendNFT(str, str2, str3, new n(this, nftitem, str3, this.f34607f, 4));
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
