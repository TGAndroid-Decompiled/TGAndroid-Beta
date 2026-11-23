package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class gu implements org.telegram.messenger.w10 {
    public final int f48359a;
    public final bx f48360b;

    public gu(bx bxVar, int i7) {
        this.f48359a = i7;
        this.f48360b = bxVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48359a) {
            case 0:
                bx bxVar = this.f48360b;
                bxVar.Q1 = (Long) obj;
                bxVar.o5();
                return;
            default:
                bx.C0(this.f48360b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
