package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class kv implements Utilities.Callback {
    public final int f38677a;
    public final ey f38678b;

    public kv(ey eyVar, int i10) {
        this.f38677a = i10;
        this.f38678b = eyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38677a) {
            case 0:
                ey eyVar = this.f38678b;
                eyVar.O1 = (Long) obj;
                eyVar.S4();
                return;
            default:
                ey.a0(this.f38678b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
