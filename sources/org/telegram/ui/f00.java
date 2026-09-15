package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f33436a;
    public final f10 f33437b;

    public f00(f10 f10Var, int i10) {
        this.f33436a = i10;
        this.f33437b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33436a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33437b.finishFragment();
                return;
            case 1:
                this.f33437b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33437b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
