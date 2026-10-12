package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 implements Utilities.Callback {
    public final int f38207a;
    public final h10 f38208b;

    public h00(h10 h10Var, int i10) {
        this.f38207a = i10;
        this.f38208b = h10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38207a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f38208b.finishFragment();
                return;
            case 1:
                this.f38208b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f38208b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
