package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_wallet;
public final class d5 implements ls {
    public final int f42391a;
    public final TL_wallet.walletTransaction[] f42392b;
    public final di.r f42393c;

    public d5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, di.r rVar) {
        this.f42391a = i7;
        this.f42392b = wallettransactionArr;
        this.f42393c = rVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == qs.f24971a4 || i7 == qs.f24977b4) {
            ArrayList arrayList = m0.x(this.f42391a).B().f42726c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f42392b;
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (m0.i0(wallettransaction2, wallettransaction)) {
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
                this.f42393c.a(wallettransaction);
            }
        }
    }
}
