package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class ov implements Utilities.Callback {

    public final int f41192a;

    public final gy f41193b;

    public ov(gy gyVar, int i10) {
        this.f41192a = i10;
        this.f41193b = gyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41192a) {
            case 0:
                gy gyVar = this.f41193b;
                gyVar.K1 = (Long) obj;
                gyVar.U4();
                break;
            default:
                gy.c0(this.f41193b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
