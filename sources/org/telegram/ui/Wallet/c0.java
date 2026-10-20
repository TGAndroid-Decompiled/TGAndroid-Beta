package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 implements Runnable {
    public volatile boolean f34058a;
    public Runnable f34059b;
    public final String f34060c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final Utilities.Callback2 f34061f;
    public final m0 h;

    public c0(m0 m0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = m0Var;
        this.f34060c = str;
        this.d = nftitem;
        this.e = str2;
        this.f34061f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34058a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34477b;
                String str = this.f34060c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f34059b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f34061f, 4));
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
