package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class b0 implements Runnable {
    public volatile boolean f42202a;
    public Runnable f42203b;
    public final String f42204c;
    public final TL_wallet.nftItem d;
    public final String f42205e;
    public final v10 f42206f;
    public final l0 h;

    public b0(l0 l0Var, String str, TL_wallet.nftItem nftitem, String str2, v10 v10Var) {
        this.h = l0Var;
        this.f42204c = str;
        this.d = nftitem;
        this.f42205e = str2;
        this.f42206f = v10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f42202a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f42681b;
                String str = this.f42204c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f42205e;
                this.f42203b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f42206f, 4));
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
