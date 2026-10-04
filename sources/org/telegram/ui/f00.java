package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f36125a;
    public final f10 f36126b;

    public f00(f10 f10Var, int i10) {
        this.f36125a = i10;
        this.f36126b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36125a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f36126b.finishFragment();
                return;
            case 1:
                this.f36126b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f36126b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
