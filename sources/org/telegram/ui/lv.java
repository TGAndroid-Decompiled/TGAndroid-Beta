package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class lv implements Utilities.Callback {
    public final int f40232a;
    public final dy f40233b;

    public lv(dy dyVar, int i9) {
        this.f40232a = i9;
        this.f40233b = dyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40232a) {
            case 0:
                dy dyVar = this.f40233b;
                dyVar.K1 = (Long) obj;
                dyVar.U4();
                return;
            default:
                dy.b0(this.f40233b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
