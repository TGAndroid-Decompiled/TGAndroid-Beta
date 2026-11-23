package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class y implements Runnable {
    public final int f45400a;
    public final v0 f45401b;
    public final boolean[] f45402c;
    public final p10 d;
    public final l2 f45403e;

    public y(v0 v0Var, boolean[] zArr, p10 p10Var, l2 l2Var, int i7) {
        this.f45400a = i7;
        this.f45401b = v0Var;
        this.f45402c = zArr;
        this.d = p10Var;
        this.f45403e = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f45400a) {
            case 0:
                final boolean[] zArr = this.f45402c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.f45401b.f45256b;
                    final p10 p10Var = this.d;
                    if (walletEngine2 == null) {
                        p10Var.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine2.previewTonConnect(this.f45403e, new p10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr[0]) {
                                        p10Var.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr[0]) {
                                        p10Var.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final boolean[] zArr2 = this.f45402c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.f45401b.f45256b;
                    final p10 p10Var2 = this.d;
                    if (walletEngine22 == null) {
                        p10Var2.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine22.previewTonConnect(this.f45403e, new p10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr2[0]) {
                                        p10Var2.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr2[0]) {
                                        p10Var2.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }
}
