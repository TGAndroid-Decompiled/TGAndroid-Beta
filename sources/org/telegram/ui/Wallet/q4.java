package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class q4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37129a;
    public final TL_wallet.walletTransaction[] f37130b;
    public final di.s f37131c;

    public q4(int i10, TL_wallet.walletTransaction[] wallettransactionArr, di.s sVar) {
        this.f37129a = i10;
        this.f37130b = wallettransactionArr;
        this.f37131c = sVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == NotificationCenter.walletUpdate || i10 == NotificationCenter.walletTransactionsUpdate) {
            ArrayList arrayList = l0.w(this.f37129a).A().f36763c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.f37130b;
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (l0.f0(wallettransaction2, wallettransaction)) {
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
                this.f37131c.run(wallettransaction);
            }
        }
    }
}
