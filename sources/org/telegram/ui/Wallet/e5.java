package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_wallet;
public final class e5 implements is {
    public final int f43793a;
    public final TL_wallet.walletTransaction[] f43794b;
    public final fi.r f43795c;

    public e5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.f43793a = i7;
        this.f43794b = wallettransactionArr;
        this.f43795c = rVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ns.f25468a4 || i7 == ns.f25474b4) {
            ArrayList arrayList = l0.x(this.f43793a).B().f44044c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f43794b;
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (l0.i0(wallettransaction2, wallettransaction)) {
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
                this.f43795c.a(wallettransaction);
            }
        }
    }
}
