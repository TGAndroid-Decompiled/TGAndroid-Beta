package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f33429a;
    public final f10 f33430b;

    public f00(f10 f10Var, int i10) {
        this.f33429a = i10;
        this.f33430b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33429a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33430b.finishFragment();
                return;
            case 1:
                this.f33430b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33430b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}
