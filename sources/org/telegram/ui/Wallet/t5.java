package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_wallet;
public final class t5 implements gs {
    public final int f45111a;
    public final TL_wallet.walletTransaction[] f45112b;
    public final fi.r f45113c;

    public t5(int i7, TL_wallet.walletTransaction[] wallettransactionArr, fi.r rVar) {
        this.f45111a = i7;
        this.f45112b = wallettransactionArr;
        this.f45113c = rVar;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i7 == ls.f25296d4 || i7 == ls.f25302e4) {
            ArrayList arrayList = u0.D(this.f45111a).H().f45087c;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                wallettransactionArr = this.f45112b;
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
                this.f45113c.a(wallettransaction);
            }
        }
    }
}
