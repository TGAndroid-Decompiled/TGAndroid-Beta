package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ju implements org.telegram.messenger.c20 {
    public final int f47099a;
    public final yw f47100b;

    public ju(yw ywVar, int i7) {
        this.f47099a = i7;
        this.f47100b = ywVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47099a) {
            case 0:
                yw ywVar = this.f47100b;
                ywVar.P1 = (Long) obj;
                ywVar.g5();
                return;
            default:
                yw.f0(this.f47100b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
