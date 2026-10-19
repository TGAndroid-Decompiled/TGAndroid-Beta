package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class c0 implements Runnable {
    public volatile boolean f34050a;
    public Runnable f34051b;
    public final String f34052c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final Utilities.Callback2 f34053f;
    public final m0 h;

    public c0(m0 m0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = m0Var;
        this.f34052c = str;
        this.d = nftitem;
        this.e = str2;
        this.f34053f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f34050a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f34469b;
                String str = this.f34052c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f34051b = walletEngine2.emulateSendNFT(str, str2, str3, new q(this, nftitem, str3, this.f34053f, 4));
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
