package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class hv implements Utilities.Callback {
    public final int f39993a;
    public final ey f39994b;

    public hv(ey eyVar, int i10) {
        this.f39993a = i10;
        this.f39994b = eyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39993a) {
            case 0:
                ey eyVar = this.f39994b;
                eyVar.O1 = (Long) obj;
                eyVar.c5();
                return;
            default:
                ey.b0(this.f39994b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
