package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class lv implements Utilities.Callback {
    public final int f39397a;
    public final ey f39398b;

    public lv(ey eyVar, int i10) {
        this.f39397a = i10;
        this.f39398b = eyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39397a) {
            case 0:
                ey eyVar = this.f39398b;
                eyVar.O1 = (Long) obj;
                eyVar.S4();
                return;
            default:
                ey.a0(this.f39398b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
