package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_wallet;
public final class u5 implements fs {
    public final int f45239a;
    public final TL_wallet.walletTransaction[] f45240b;
    public final fi.r f45241c;

    public u5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.f45239a = i7;
        this.f45240b = wallettransactionArr;
        this.f45241c = rVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ks.f25201d4 || i7 == ks.f25207e4) {
            ArrayList arrayList = v0.D(this.f45239a).H().f45215c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f45240b;
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (v0.t0(wallettransaction2, wallettransaction)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    wallettransaction = null;
                    break;
                }
            }
            if (wallettransaction != null) {
                wallettransactionArr[0] = wallettransaction;
                this.f45241c.a(wallettransaction);
            }
        }
    }
}
