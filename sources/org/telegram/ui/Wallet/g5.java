package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_wallet;
public final class g5 implements vs {
    public final int f34554a;
    public final TL_wallet.walletTransaction[] f34555b;
    public final q4 f34556c;

    public g5(int i10, TL_wallet.walletTransaction[] wallettransactionArr, q4 q4Var) {
        this.f34554a = i10;
        this.f34555b = wallettransactionArr;
        this.f34556c = q4Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i10 == at.f14678a4 || i10 == at.f14684b4) {
            ArrayList arrayList = k0.x(this.f34554a).B().f34736c;
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                wallettransactionArr = this.f34555b;
                if (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (k0.i0(wallettransaction2, wallettransaction)) {
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
                this.f34556c.a(wallettransaction);
            }
        }
    }
}
