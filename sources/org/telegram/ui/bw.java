package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class bw implements Utilities.Callback {
    public final int f34637a;
    public final yy f34638b;

    public bw(yy yyVar, int i10) {
        this.f34637a = i10;
        this.f34638b = yyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34637a) {
            case 0:
                yy yyVar = this.f34638b;
                yyVar.O1 = (Long) obj;
                yyVar.R4();
                return;
            default:
                yy.a0(this.f34638b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
