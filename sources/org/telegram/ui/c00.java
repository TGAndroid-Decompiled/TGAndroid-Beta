package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c00 implements Utilities.Callback {
    public final int f35635a;
    public final b10 f35636b;

    public c00(b10 b10Var, int i10) {
        this.f35635a = i10;
        this.f35636b = b10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35635a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f35636b.finishFragment();
                return;
            case 1:
                this.f35636b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f35636b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
