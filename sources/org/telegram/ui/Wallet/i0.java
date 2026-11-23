package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements Runnable {
    public volatile boolean f44332a;
    public Runnable f44333b;
    public final String f44334c;
    public final TL_wallet.nftItem d;
    public final String f44335e;
    public final r10 f44336f;
    public final u0 h;

    public i0(u0 u0Var, String str, TL_wallet.nftItem nftitem, String str2, r10 r10Var) {
        this.h = u0Var;
        this.f44334c = str;
        this.d = nftitem;
        this.f44335e = str2;
        this.f44336f = r10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f44332a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f45094b;
                String str = this.f44334c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f44335e;
                this.f44333b = walletEngine2.emulateSendNFT(str, str2, str3, new s(this, nftitem, str3, this.f44336f, 4));
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
