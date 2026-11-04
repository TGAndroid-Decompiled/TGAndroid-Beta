package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_wallet;
public final class c5 implements cs {
    public final int f42387a;
    public final TL_wallet.walletTransaction[] f42388b;
    public final ei.s f42389c;

    public c5(int i3, TL_wallet.walletTransaction[] wallettransactionArr, ei.s sVar) {
        this.f42387a = i3;
        this.f42388b = wallettransactionArr;
        this.f42389c = sVar;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i3 == hs.f23200a4 || i3 == hs.f23206b4) {
            ArrayList arrayList = k0.x(this.f42387a).B().f42681c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f42388b;
                if (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
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
                this.f42389c.a(wallettransaction);
            }
        }
    }
}
