package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hu implements org.telegram.messenger.c20 {
    public final int f46487a;
    public final ww f46488b;

    public hu(ww wwVar, int i7) {
        this.f46487a = i7;
        this.f46488b = wwVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46487a) {
            case 0:
                ww wwVar = this.f46488b;
                wwVar.O1 = (Long) obj;
                wwVar.g5();
                return;
            default:
                ww.f0(this.f46488b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
