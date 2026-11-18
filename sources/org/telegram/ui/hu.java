package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hu implements org.telegram.messenger.x10 {
    public final int f48482a;
    public final cx f48483b;

    public hu(cx cxVar, int i7) {
        this.f48482a = i7;
        this.f48483b = cxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48482a) {
            case 0:
                cx cxVar = this.f48483b;
                cxVar.Q1 = (Long) obj;
                cxVar.o5();
                return;
            default:
                cx.C0(this.f48483b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
