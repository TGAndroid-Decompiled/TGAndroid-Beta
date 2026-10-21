package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class iv implements Utilities.Callback {
    public final int f38116a;
    public final cy f38117b;

    public iv(cy cyVar, int i10) {
        this.f38116a = i10;
        this.f38117b = cyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38116a) {
            case 0:
                cy cyVar = this.f38117b;
                cyVar.O1 = (Long) obj;
                cyVar.S4();
                return;
            default:
                cy.a0(this.f38117b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
