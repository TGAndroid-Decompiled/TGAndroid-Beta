package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f36219a;
    public final f10 f36220b;

    public f00(f10 f10Var, int i10) {
        this.f36219a = i10;
        this.f36220b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36219a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f36220b.finishFragment();
                return;
            case 1:
                this.f36220b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f36220b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
