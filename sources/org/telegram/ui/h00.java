package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 implements Utilities.Callback {
    public final int f34080a;
    public final h10 f34081b;

    public h00(h10 h10Var, int i10) {
        this.f34080a = i10;
        this.f34081b = h10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34080a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f34081b.finishFragment();
                return;
            case 1:
                this.f34081b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f34081b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
