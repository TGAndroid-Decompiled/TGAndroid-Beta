package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x implements Runnable {
    public final int f45238a;
    public final u0 f45239b;
    public final boolean[] f45240c;
    public final r10 d;
    public final k2 f45241e;

    public x(u0 u0Var, boolean[] zArr, r10 r10Var, k2 k2Var, int i7) {
        this.f45238a = i7;
        this.f45239b = u0Var;
        this.f45240c = zArr;
        this.d = r10Var;
        this.f45241e = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f45238a) {
            case 0:
                final boolean[] zArr = this.f45240c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.f45239b.f45094b;
                    final r10 r10Var = this.d;
                    if (walletEngine2 == null) {
                        r10Var.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine2.previewTonConnect(this.f45241e, new r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr[0]) {
                                        r10Var.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr[0]) {
                                        r10Var.a(wallettransaction, str);
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
                final boolean[] zArr2 = this.f45240c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.f45239b.f45094b;
                    final r10 r10Var2 = this.d;
                    if (walletEngine22 == null) {
                        r10Var2.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine22.previewTonConnect(this.f45241e, new r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr2[0]) {
                                        r10Var2.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr2[0]) {
                                        r10Var2.a(wallettransaction, str);
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
