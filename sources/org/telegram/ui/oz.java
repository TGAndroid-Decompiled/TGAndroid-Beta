package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class oz implements Utilities.Callback {
    public final int f42315a;
    public final o00 f42316b;

    public oz(o00 o00Var, int i10) {
        this.f42315a = i10;
        this.f42316b = o00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42315a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f42316b.finishFragment();
                return;
            case 1:
                this.f42316b.o0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f42316b.n0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
