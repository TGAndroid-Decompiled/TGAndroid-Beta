package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class a0 implements Runnable {
    public volatile boolean f32611a;
    public Runnable f32612b;
    public final String f32613c;
    public final TL_wallet.nftItem d;
    public final String e;
    public final Utilities.Callback2 f32614f;
    public final k0 h;

    public a0(k0 k0Var, String str, TL_wallet.nftItem nftitem, String str2, Utilities.Callback2 callback2) {
        this.h = k0Var;
        this.f32613c = str;
        this.d = nftitem;
        this.e = str2;
        this.f32614f = callback2;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f32611a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f33093b;
                String str = this.f32613c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.e;
                this.f32612b = walletEngine2.emulateSendNFT(str, str2, str3, new o(this, nftitem, str3, this.f32614f, 4));
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
