package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k00 implements Utilities.Callback {
    public final int f37192a;
    public final k10 f37193b;

    public k00(k10 k10Var, int i10) {
        this.f37192a = i10;
        this.f37193b = k10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37192a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37193b.finishFragment();
                return;
            case 1:
                this.f37193b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37193b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
