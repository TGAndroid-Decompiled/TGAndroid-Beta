package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ku implements org.telegram.messenger.c20 {
    public final int f47433a;
    public final zw f47434b;

    public ku(zw zwVar, int i7) {
        this.f47433a = i7;
        this.f47434b = zwVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47433a) {
            case 0:
                zw zwVar = this.f47434b;
                zwVar.P1 = (Long) obj;
                zwVar.g5();
                return;
            default:
                zw.f0(this.f47434b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
