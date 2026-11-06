package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d0 implements Runnable {
    public volatile boolean f42317a;
    public Runnable f42318b;
    public final String f42319c;
    public final TL_wallet.nftItem d;
    public final String f42320e;
    public final v10 f42321f;
    public final n0 h;

    public d0(n0 n0Var, String str, TL_wallet.nftItem nftitem, String str2, v10 v10Var) {
        this.h = n0Var;
        this.f42319c = str;
        this.d = nftitem;
        this.f42320e = str2;
        this.f42321f = v10Var;
    }

    @Override
    public final synchronized void run() {
        try {
            try {
                if (this.f42317a) {
                    return;
                }
                WalletEngine2 walletEngine2 = this.h.f42793b;
                String str = this.f42319c;
                TL_wallet.nftItem nftitem = this.d;
                String str2 = nftitem.address;
                String str3 = this.f42320e;
                this.f42318b = walletEngine2.emulateSendNFT(str, str2, str3, new r(this, nftitem, str3, this.f42321f, 4));
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
