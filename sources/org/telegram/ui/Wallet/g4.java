package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f33202a;
    public final TL_wallet.walletTransaction[] f33203b;
    public final n3 f33204c;

    public g4(int i10, TL_wallet.walletTransaction[] wallettransactionArr, n3 n3Var) {
        this.f33202a = i10;
        this.f33203b = wallettransactionArr;
        this.f33204c = n3Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == NotificationCenter.walletUpdate || i10 == NotificationCenter.walletTransactionsUpdate) {
            ArrayList arrayList = j0.v(this.f33202a).z().f33275c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.f33203b;
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (j0.d0(wallettransaction2, wallettransaction)) {
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
                this.f33204c.run(wallettransaction);
            }
        }
    }
}
