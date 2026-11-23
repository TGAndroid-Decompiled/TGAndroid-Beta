package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class j0 implements Runnable {
    public volatile boolean f44494a;
    public Runnable f44495b;
    public final String f44496c;
    public final TL_wallet.nftItem d;
    public final String f44497e;
    public final p10 f44498f;
    public final v0 h;

    public j0(v0 v0Var, String str, TL_wallet.nftItem nftitem, String str2, p10 p10Var) {
        this.h = v0Var;
        this.f44496c = str;
        this.d = nftitem;
        this.f44497e = str2;
        this.f44498f = p10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f44494a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f45256b;
                String str = this.f44496c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f44497e;
                this.f44495b = walletEngine2.emulateSendNFT(str, str2, str3, new t(this, nftitem, str3, this.f44498f, 4));
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
