package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f34669a;
    public Runnable f34670b;
    public final String f34671c;
    public final TL_wallet.nftItem d;
    public final String f34672e;
    public final Utilities.Callback2 f34673f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = l0Var;
        this.f34671c = str;
        this.d = nftitem;
        this.f34672e = str2;
        this.f34673f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34669a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f35186b;
                String str = this.f34671c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f34672e;
                this.f34670b = walletEngine2.emulateSendNFT(str, str2, str3, new p(this, nftitem, str3, this.f34673f, 4));
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
