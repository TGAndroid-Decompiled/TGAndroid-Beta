package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class jv implements Utilities.Callback {
    public final int f38349a;
    public final ey f38350b;

    public jv(ey eyVar, int i10) {
        this.f38349a = i10;
        this.f38350b = eyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38349a) {
            case 0:
                ey eyVar = this.f38350b;
                eyVar.O1 = (Long) obj;
                eyVar.S4();
                return;
            default:
                ey.a0(this.f38350b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
