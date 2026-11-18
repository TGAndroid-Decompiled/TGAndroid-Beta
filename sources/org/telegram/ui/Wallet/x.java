package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class x implements Runnable {
    public final int f45228a;
    public final u0 f45229b;
    public final boolean[] f45230c;
    public final q10 d;
    public final k2 f45231e;

    public x(u0 u0Var, boolean[] zArr, q10 q10Var, k2 k2Var, int i7) {
        this.f45228a = i7;
        this.f45229b = u0Var;
        this.f45230c = zArr;
        this.d = q10Var;
        this.f45231e = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f45228a) {
            case 0:
                final boolean[] zArr = this.f45230c;
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = this.f45229b.f45084b;
                    final q10 q10Var = this.d;
                    if (walletEngine2 == null) {
                        q10Var.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine2.previewTonConnect(this.f45231e, new q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr[0]) {
                                        q10Var.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr[0]) {
                                        q10Var.a(wallettransaction, str);
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
                final boolean[] zArr2 = this.f45230c;
                if (!zArr2[0]) {
                    WalletEngine2 walletEngine22 = this.f45229b.f45084b;
                    final q10 q10Var2 = this.d;
                    if (walletEngine22 == null) {
                        q10Var2.a(null, "NULL_ENGINE");
                        return;
                    }
                    walletEngine22.previewTonConnect(this.f45231e, new q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                            String str = (String) obj2;
                            switch (r1) {
                                case 0:
                                    if (!zArr2[0]) {
                                        q10Var2.a(wallettransaction, str);
                                        return;
                                    }
                                    return;
                                default:
                                    if (!zArr2[0]) {
                                        q10Var2.a(wallettransaction, str);
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
