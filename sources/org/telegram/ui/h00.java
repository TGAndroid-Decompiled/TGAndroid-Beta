package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 implements Utilities.Callback {
    public final int f34085a;
    public final h10 f34086b;

    public h00(h10 h10Var, int i10) {
        this.f34085a = i10;
        this.f34086b = h10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34085a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f34086b.finishFragment();
                return;
            case 1:
                this.f34086b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f34086b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
