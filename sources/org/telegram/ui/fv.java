package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class fv implements Utilities.Callback {
    public final int f39475a;
    public final cy f39476b;

    public fv(cy cyVar, int i10) {
        this.f39475a = i10;
        this.f39476b = cyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39475a) {
            case 0:
                cy cyVar = this.f39476b;
                cyVar.O1 = (Long) obj;
                cyVar.c5();
                return;
            default:
                cy.b0(this.f39476b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
