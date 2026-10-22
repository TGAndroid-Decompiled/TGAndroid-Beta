package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class iv implements Utilities.Callback {
    public final int f38119a;
    public final cy f38120b;

    public iv(cy cyVar, int i10) {
        this.f38119a = i10;
        this.f38120b = cyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38119a) {
            case 0:
                cy cyVar = this.f38120b;
                cyVar.O1 = (Long) obj;
                cyVar.S4();
                return;
            default:
                cy.a0(this.f38120b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
