package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class z implements Runnable {
    public volatile boolean f33894a;
    public Runnable f33895b;
    public final String f33896c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final Utilities.Callback2 f33897f;
    public final j0 h;

    public z(j0 j0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = j0Var;
        this.f33896c = str;
        this.d = nftitem;
        this.e = str2;
        this.f33897f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f33894a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f33320b;
                String str = this.f33896c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f33895b = walletEngine2.emulateSendNFT(str, str2, str3, new n(this, nftitem, str3, this.f33897f, 4));
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
