package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class t4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34897a;
    public final TL_wallet.walletTransaction[] f34898b;
    public final b4 f34899c;

    public t4(int i10, TL_wallet.walletTransaction[] wallettransactionArr, b4 b4Var) {
        this.f34897a = i10;
        this.f34898b = wallettransactionArr;
        this.f34899c = b4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == NotificationCenter.walletUpdate || i10 == NotificationCenter.walletTransactionsUpdate) {
            ArrayList arrayList = m0.w(this.f34897a).A().f34442c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.f34898b;
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (m0.f0(wallettransaction2, wallettransaction)) {
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
                this.f34899c.run(wallettransaction);
            }
        }
    }
}
