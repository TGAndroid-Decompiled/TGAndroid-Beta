package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 implements Utilities.Callback {
    public final int f33074a;
    public final e10 f33075b;

    public e00(e10 e10Var, int i10) {
        this.f33074a = i10;
        this.f33075b = e10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33074a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33075b.finishFragment();
                return;
            case 1:
                this.f33075b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33075b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
