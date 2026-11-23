package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hu implements org.telegram.messenger.y10 {
    public final int f48529a;
    public final cx f48530b;

    public hu(cx cxVar, int i7) {
        this.f48529a = i7;
        this.f48530b = cxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48529a) {
            case 0:
                cx cxVar = this.f48530b;
                cxVar.Q1 = (Long) obj;
                cxVar.o5();
                return;
            default:
                cx.C0(this.f48530b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
