package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class iv implements Utilities.Callback {
    public final int f38107a;
    public final cy f38108b;

    public iv(cy cyVar, int i10) {
        this.f38107a = i10;
        this.f38108b = cyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38107a) {
            case 0:
                cy cyVar = this.f38108b;
                cyVar.O1 = (Long) obj;
                cyVar.S4();
                return;
            default:
                cy.a0(this.f38108b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
