package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f34480a;
    public Runnable f34481b;
    public final String f34482c;
    public final TL_wallet.nftItem d;
    public final String f34483e;
    public final Utilities.Callback2 f34484f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = l0Var;
        this.f34482c = str;
        this.d = nftitem;
        this.f34483e = str2;
        this.f34484f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34480a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34997b;
                String str = this.f34482c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f34483e;
                this.f34481b = walletEngine2.emulateSendNFT(str, str2, str3, new o(this, nftitem, str3, this.f34484f, 4));
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
