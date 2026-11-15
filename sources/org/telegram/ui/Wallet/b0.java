package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f43491a;
    public Runnable f43492b;
    public final String f43493c;
    public final TL_wallet.nftItem d;
    public final String f43494e;
    public final s10 f43495f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, s10 s10Var) {
        this.h = l0Var;
        this.f43493c = str;
        this.d = nftitem;
        this.f43494e = str2;
        this.f43495f = s10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f43491a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f44079b;
                String str = this.f43493c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f43494e;
                this.f43492b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f43495f, 4));
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
