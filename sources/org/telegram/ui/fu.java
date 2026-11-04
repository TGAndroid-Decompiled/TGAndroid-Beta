package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fu implements org.telegram.messenger.u10 {
    public final int f45369a;
    public final uw f45370b;

    public fu(uw uwVar, int i3) {
        this.f45369a = i3;
        this.f45370b = uwVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45369a) {
            case 0:
                uw uwVar = this.f45370b;
                uwVar.P1 = (Long) obj;
                uwVar.g5();
                return;
            default:
                uw.f0(this.f45370b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
