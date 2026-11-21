package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_wallet;
public final class t5 implements fs {
    public final int f45107a;
    public final TL_wallet.walletTransaction[] f45108b;
    public final fi.r f45109c;

    public t5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.f45107a = i7;
        this.f45108b = wallettransactionArr;
        this.f45109c = rVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ks.f25130d4 || i7 == ks.f25136e4) {
            ArrayList arrayList = u0.D(this.f45107a).H().f45083c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f45108b;
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (u0.t0(wallettransaction2, wallettransaction)) {
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
                this.f45109c.a(wallettransaction);
            }
        }
    }
}
