package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f36130a;
    public final f10 f36131b;

    public f00(f10 f10Var, int i10) {
        this.f36130a = i10;
        this.f36131b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36130a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f36131b.finishFragment();
                return;
            case 1:
                this.f36131b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f36131b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
