package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class mv implements Utilities.Callback {
    public final int f40638a;
    public final fy f40639b;

    public mv(fy fyVar, int i10) {
        this.f40638a = i10;
        this.f40639b = fyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40638a) {
            case 0:
                fy fyVar = this.f40639b;
                fyVar.K1 = (Long) obj;
                fyVar.U4();
                return;
            default:
                fy.c0(this.f40639b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
