package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class aw implements Utilities.Callback {
    public final int f31993a;
    public final wy f31994b;

    public aw(wy wyVar, int i10) {
        this.f31993a = i10;
        this.f31994b = wyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31993a) {
            case 0:
                wy wyVar = this.f31994b;
                wyVar.O1 = (Long) obj;
                wyVar.U4();
                return;
            default:
                wy.d0(this.f31994b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
