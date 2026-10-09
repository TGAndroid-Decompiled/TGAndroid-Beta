package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f37408a;
    public final f10 f37409b;

    public f00(f10 f10Var, int i10) {
        this.f37408a = i10;
        this.f37409b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37408a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37409b.finishFragment();
                return;
            case 1:
                this.f37409b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37409b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
