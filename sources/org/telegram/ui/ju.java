package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ju implements org.telegram.messenger.z10 {
    public final int f48461a;
    public final yw f48462b;

    public ju(yw ywVar, int i7) {
        this.f48461a = i7;
        this.f48462b = ywVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48461a) {
            case 0:
                yw ywVar = this.f48462b;
                ywVar.Q1 = (Long) obj;
                ywVar.g5();
                return;
            default:
                yw.f0(this.f48462b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
