package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_wallet;
public final class h4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f32975a;
    public final TL_wallet.walletTransaction[] f32976b;
    public final o3 f32977c;

    public h4(int i10, TL_wallet.walletTransaction[] wallettransactionArr, o3 o3Var) {
        this.f32975a = i10;
        this.f32976b = wallettransactionArr;
        this.f32977c = o3Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == NotificationCenter.walletUpdate || i10 == NotificationCenter.walletTransactionsUpdate) {
            ArrayList arrayList = k0.v(this.f32975a).z().f33048c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.f32976b;
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (k0.d0(wallettransaction2, wallettransaction)) {
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
                this.f32977c.run(wallettransaction);
            }
        }
    }
}
