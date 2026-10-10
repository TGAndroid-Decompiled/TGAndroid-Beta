package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f34641a;
    public Runnable f34642b;
    public final String f34643c;
    public final TL_wallet.nftItem d;
    public final String f34644e;
    public final Utilities.Callback2 f34645f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = k0Var;
        this.f34643c = str;
        this.d = nftitem;
        this.f34644e = str2;
        this.f34645f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34641a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f35156b;
                String str = this.f34643c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f34644e;
                this.f34642b = walletEngine2.emulateSendNFT(str, str2, str3, new o(this, nftitem, str3, this.f34645f, 4));
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
