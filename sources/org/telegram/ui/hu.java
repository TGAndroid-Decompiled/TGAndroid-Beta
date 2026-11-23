package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hu implements org.telegram.messenger.y10 {
    public final int f48497a;
    public final cx f48498b;

    public hu(cx cxVar, int i7) {
        this.f48497a = i7;
        this.f48498b = cxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48497a) {
            case 0:
                cx cxVar = this.f48498b;
                cxVar.Q1 = (Long) obj;
                cxVar.o5();
                return;
            default:
                cx.C0(this.f48498b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
