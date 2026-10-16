package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class bw implements Utilities.Callback {
    public final int f34391a;
    public final yy f34392b;

    public bw(yy yyVar, int i10) {
        this.f34391a = i10;
        this.f34392b = yyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34391a) {
            case 0:
                yy yyVar = this.f34392b;
                yyVar.O1 = (Long) obj;
                yyVar.S4();
                return;
            default:
                yy.a0(this.f34392b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
