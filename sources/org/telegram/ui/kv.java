package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class kv implements org.telegram.messenger.q20 {
    public final int f38956a;
    public final ay f38957b;

    public kv(ay ayVar, int i10) {
        this.f38956a = i10;
        this.f38957b = ayVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38956a) {
            case 0:
                ay ayVar = this.f38957b;
                ayVar.O1 = (Long) obj;
                ayVar.f5();
                return;
            default:
                ay.e0(this.f38957b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
