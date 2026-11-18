package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements Runnable {
    public volatile boolean f44322a;
    public Runnable f44323b;
    public final String f44324c;
    public final TL_wallet.nftItem d;
    public final String f44325e;
    public final q10 f44326f;
    public final u0 h;

    public i0(u0 u0Var, String str, TL_wallet.nftItem nftitem, String str2, q10 q10Var) {
        this.h = u0Var;
        this.f44324c = str;
        this.d = nftitem;
        this.f44325e = str2;
        this.f44326f = q10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f44322a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f45084b;
                String str = this.f44324c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f44325e;
                this.f44323b = walletEngine2.emulateSendNFT(str, str2, str3, new s(this, nftitem, str3, this.f44326f, 4));
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
