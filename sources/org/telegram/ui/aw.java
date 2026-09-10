package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class aw implements Utilities.Callback {
    public final int f31097a;
    public final wy f31098b;

    public aw(wy wyVar, int i10) {
        this.f31097a = i10;
        this.f31098b = wyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31097a) {
            case 0:
                wy wyVar = this.f31098b;
                wyVar.O1 = (Long) obj;
                wyVar.U4();
                return;
            default:
                wy.d0(this.f31098b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
