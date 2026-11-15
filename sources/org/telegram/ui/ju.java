package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ju implements org.telegram.messenger.z10 {
    public final int f48415a;
    public final yw f48416b;

    public ju(yw ywVar, int i7) {
        this.f48415a = i7;
        this.f48416b = ywVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48415a) {
            case 0:
                yw ywVar = this.f48416b;
                ywVar.Q1 = (Long) obj;
                ywVar.g5();
                return;
            default:
                yw.f0(this.f48416b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
