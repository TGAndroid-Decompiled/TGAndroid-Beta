package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c00 implements Utilities.Callback {
    public final int f35646a;
    public final b10 f35647b;

    public c00(b10 b10Var, int i10) {
        this.f35646a = i10;
        this.f35647b = b10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35646a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f35647b.finishFragment();
                return;
            case 1:
                this.f35647b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f35647b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
