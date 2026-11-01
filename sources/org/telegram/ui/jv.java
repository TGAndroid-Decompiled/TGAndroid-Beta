package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class jv implements org.telegram.messenger.r20 {
    public final int f38562a;
    public final zx f38563b;

    public jv(zx zxVar, int i10) {
        this.f38562a = i10;
        this.f38563b = zxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38562a) {
            case 0:
                zx zxVar = this.f38563b;
                zxVar.O1 = (Long) obj;
                zxVar.g5();
                return;
            default:
                zx.f0(this.f38563b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
