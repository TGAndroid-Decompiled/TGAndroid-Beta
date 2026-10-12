package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f34478a;
    public Runnable f34479b;
    public final String f34480c;
    public final TL_wallet.nftItem d;
    public final String f34481e;
    public final Utilities.Callback2 f34482f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = l0Var;
        this.f34480c = str;
        this.d = nftitem;
        this.f34481e = str2;
        this.f34482f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34478a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34995b;
                String str = this.f34480c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f34481e;
                this.f34479b = walletEngine2.emulateSendNFT(str, str2, str3, new o(this, nftitem, str3, this.f34482f, 4));
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
