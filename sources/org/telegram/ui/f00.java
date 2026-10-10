package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f37452a;
    public final f10 f37453b;

    public f00(f10 f10Var, int i10) {
        this.f37452a = i10;
        this.f37453b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37452a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37453b.finishFragment();
                return;
            case 1:
                this.f37453b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37453b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
