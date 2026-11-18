package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hu implements org.telegram.messenger.x10 {
    public final int f48526a;
    public final cx f48527b;

    public hu(cx cxVar, int i7) {
        this.f48526a = i7;
        this.f48527b = cxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48526a) {
            case 0:
                cx cxVar = this.f48527b;
                cxVar.Q1 = (Long) obj;
                cxVar.o5();
                return;
            default:
                cx.C0(this.f48527b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
