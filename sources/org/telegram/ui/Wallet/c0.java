package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 implements Runnable {
    public volatile boolean f42288a;
    public Runnable f42289b;
    public final String f42290c;
    public final TL_wallet.nftItem d;
    public final String f42291e;
    public final v10 f42292f;
    public final m0 h;

    public c0(m0 m0Var, String str, TL_wallet.nftItem nftitem, String str2, v10 v10Var) {
        this.h = m0Var;
        this.f42290c = str;
        this.d = nftitem;
        this.f42291e = str2;
        this.f42292f = v10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f42288a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f42763b;
                String str = this.f42290c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f42291e;
                this.f42289b = walletEngine2.emulateSendNFT(str, str2, str3, new r(this, nftitem, str3, this.f42292f, 4));
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
