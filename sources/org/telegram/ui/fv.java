package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class fv implements Utilities.Callback {
    public final int f39478a;
    public final cy f39479b;

    public fv(cy cyVar, int i10) {
        this.f39478a = i10;
        this.f39479b = cyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39478a) {
            case 0:
                cy cyVar = this.f39479b;
                cyVar.O1 = (Long) obj;
                cyVar.c5();
                return;
            default:
                cy.b0(this.f39479b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
